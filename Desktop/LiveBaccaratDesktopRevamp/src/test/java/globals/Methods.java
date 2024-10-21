package globals;

import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Helper;
import utilities.objects.Locator;

import java.util.ArrayList;
import java.util.List;

public class Methods {

    public static void waitBettingPhase(int specifiedTime, boolean isExact) {
        int currentTimerValue = isExact ? 100 : -1;
        long startTime = System.currentTimeMillis();
        long timeout = 600000; // Set a timeout of 10 minutes
        while (isExact ? (currentTimerValue != specifiedTime) : (currentTimerValue < specifiedTime)) {
            if ((System.currentTimeMillis() - startTime) > timeout) break;
            currentTimerValue = GetHandler.getInt(XPath.GameTable.Content.ShowTimer, HandleCollection.WithException);
        }
    }

    public static String[] getRoundResult() {
        WaitHandler.waitVisibility(XPath.GameTable.RoundResult.WinResult, Variables.WAIT_PHASE_SECONDS);
        int[] playerCards = getCardResults(XPath.GameTable.RoundResult.PlayerCards);
        int[] bankerCards = getCardResults(XPath.GameTable.RoundResult.BankerCards);
        int playerTotal = GetHandler.getInt(XPath.GameTable.RoundResult.PlayerTotalPoints);
        int bankerTotal = GetHandler.getInt(XPath.GameTable.RoundResult.BankerTotalPoints);
        List<String> roundResults = new ArrayList<>();
        roundResults.add("P " + Helper.toString(playerCards));
        roundResults.add("B " + Helper.toString(bankerCards));
        setTieResult(roundResults, playerCards, bankerCards, playerTotal, bankerTotal);
        setPlayerResult(roundResults, playerCards, playerTotal, bankerTotal);
        setBankerResult(roundResults, bankerCards, playerTotal, bankerTotal);
        setPairResult(roundResults);
        return Helper.toArray(roundResults);
    }

    public static int[] getCardResults(Locator component) {
        return GetHandler.getElements(component).parallelStream()
                .mapToInt(element -> Integer.parseInt(element.getAttribute("class").split("_")[1]))
                .toArray();
    }

    private static void setTieResult(List<String> roundResults, int[] playerCards, int[] bankerCards, int playerTotal, int bankerTotal) {
        if (Condition.isWin(XPath.GameTable.BettingOption.Option.Tie)) {
            roundResults.add(Variables.TIE);
            if ((playerCards.length == 2 && bankerCards.length == 2) &&
                    (playerTotal == 8 || playerTotal == 9 ) &&
                    (bankerTotal == 8 || bankerTotal == 9 ))
                roundResults.add(Variables.NATURAL_TIE);
        }
    }

    private static void setPlayerResult(List<String> roundResults, int[] playerCards, int playerTotal, int bankerTotal) {
        if (Condition.isWin(XPath.GameTable.BettingOption.Option.Player)) {
            roundResults.add(Variables.PLAYER);
            if (playerCards.length == 2 &&
                    (playerTotal == 8 || playerTotal == 9 ))
                roundResults.add(Variables.NATURAL_WIN);
            if (Condition.isWin(XPath.GameTable.BettingOption.Option.PlayerDragonBonus))
                roundResults.add(Variables.PLAYER_DRAGON_BONUS + (playerTotal - bankerTotal));
        }
    }

    private static void setBankerResult(List<String> roundResults, int[] bankerCards, int playerTotal, int bankerTotal) {
        if (Condition.isWin(XPath.GameTable.BettingOption.Option.Banker)) {
            roundResults.add(Variables.BANKER);
            if (bankerCards.length == 2 &&
                    (bankerTotal == 8 || bankerTotal == 9 ))
                roundResults.add(Variables.NATURAL_WIN);
            if (Condition.isWin(XPath.GameTable.BettingOption.Option.BankerDragonBonus))
                roundResults.add(Variables.BANKER_DRAGON_BONUS + (bankerTotal - playerTotal));
            if (Condition.isWin(XPath.GameTable.BettingOption.Option.FortuneSix))
                roundResults.add(Variables.FORTUNE_SIX + bankerCards.length);
        }
    }

    private static void setPairResult(List<String> roundResults) {
        if (Condition.isWin(XPath.GameTable.BettingOption.Option.PlayerPair))
            roundResults.add(Variables.PLAYER_PAIR);
        if (Condition.isWin(XPath.GameTable.BettingOption.Option.BankerPair))
            roundResults.add(Variables.BANKER_PAIR);
    }

    public static int getChipValue(Locator chip) {
        String chipText = GetHandler.getText(chip).toLowerCase().replace("+", "");
        if (chipText.endsWith("k")) {
            return (int) (Double.parseDouble(chipText.replace("k", "")) * 1000);
        } else if (chipText.endsWith("m")) {
            return (int) (Double.parseDouble(chipText.replace("m", "")) * 1000000);
        }
        return switch (chipText) {
            case "1" -> 1;
            case "5" -> 5;
            case "10" -> 10;
            case "25" -> 25;
            case "100" -> 100;
            case "500" -> 500;
            default -> GetHandler.getInt(chip);
        };
    }

    public static String getTableName() {
        String table = GetHandler.getText(XPath.GameTable.NavBar.TableName).split(" ")[1];
        String initial = Helper.getFirstChar(table);
        return "Baccarat " + initial;
    }

    public static double getUpdatedBalance() {
        WaitHandler.wait(3);
        return GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
    }

}
