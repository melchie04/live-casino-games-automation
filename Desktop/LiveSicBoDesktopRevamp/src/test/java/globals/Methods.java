package globals;

import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.enums.HandleCollection;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Helper;
import utilities.objects.Locator;

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
        Locator currentResult = XPath.GameTable.RoundResult.DiceResult;
        WaitHandler.waitVisibility(currentResult, Variables.WAIT_PHASE_SECONDS);
        List<WebElement> elements = GetHandler.getElements(currentResult);
        String[] dices = new String[3];
        for (int i = 0; i < 3; i++) dices[i] = elements.get(i).getAttribute("class").replace("dice dice_", "");
        return dices;
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
        String table = GetHandler.getText(XPath.GameTable.NavBar.TableName).split(" ")[2];
        String initial = Helper.getFirstChar(table);
        return "Sic Bo " + initial;
    }

    public static double getUpdatedBalance() {
        WaitHandler.wait(3);
        return GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
    }

}
