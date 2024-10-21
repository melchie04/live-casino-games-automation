package globals;

import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Helper;
import utilities.objects.Locator;

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
        WaitHandler.waitVisibility(XPath.GameTable.RoundResult.ResultNumber, Variables.WAIT_PHASE_SECONDS);
        String number = GetHandler.getText(XPath.GameTable.RoundResult.ResultNumber);
        String color = GetHandler.getAttribute(XPath.GameTable.RoundResult.ResultNumber, "class").replace("bet_result_number ", "").toUpperCase();
        return new String[]{number, color};
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
        return "Roulette " + initial;
    }

    public static double getUpdatedBalance() {
        WaitHandler.wait(3);
        return GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
    }

}
