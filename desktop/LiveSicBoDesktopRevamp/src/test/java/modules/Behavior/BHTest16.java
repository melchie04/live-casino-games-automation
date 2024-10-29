package modules.Behavior;

import globals.Variables;
import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Locator;

import java.util.List;

public class BHTest16 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 16");
        System.out.println("Actual Results: ");

        int actualNumberOfDeals = GetHandler.getInt(XPath.GameLobby.Content.getNumberOfDeals(Variables.tableName));
        String[] newLatestResult = getResult(XPath.GameLobby.ResultHistory.getLatestResult(Variables.tableName));
        String[] newPreviousResult = getResult(XPath.GameLobby.ResultHistory.getPreviousResult(Variables.tableName));

        if (Variables.numberOfDeals == 300) {
            CustomAssert.assertTrue(
                    "BH Test 16",
                    Variables.numberOfDeals == actualNumberOfDeals,
                    "The number of deals in the Game Lobby remained at 300 after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals,
                    "The number of deals in the Game Lobby did not remain at 300 after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals
            );
        } else {
            CustomAssert.assertTrue(
                    "BH Test 16",
                    Variables.numberOfDeals < actualNumberOfDeals,
                    "The number of deals in the Game Lobby increased after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals,
                    "The number of deals in the Game Lobby did not increase after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals
            );
        }

        CustomAssert.assertTrue(
                "BH Test 16",
                isResultUpdated(newLatestResult, newPreviousResult),
                "The active round result of the " + Variables.tableName + " in the Game Lobby Page is updated: " + Helper.toString(Variables.latestResult) + " --> " + Helper.toString(newLatestResult),
                "The active round result of the " + Variables.tableName + " in the Game Lobby Page is not updated: " + Helper.toString(Variables.latestResult) + " --> " + Helper.toString(newLatestResult)
        );

        System.out.println();
    }

    private static String[] getResult(Locator result) {
        List<WebElement> elementsInResultPanel = GetHandler.getElements(result);
        String firstDice = elementsInResultPanel.get(0).getAttribute("class").replaceAll("[^0-9.-]+", "");
        String secondDice = elementsInResultPanel.get(1).getAttribute("class").replaceAll("[^0-9.-]+", "");
        String thirdDice = elementsInResultPanel.get(2).getAttribute("class").replaceAll("[^0-9.-]+", "");
        String totalResult = elementsInResultPanel.get(3).getText();
        String smallOrBig = elementsInResultPanel.get(4).getText();
        String oddOrEven = elementsInResultPanel.get(5).getText();
        return new String[]{firstDice,secondDice, thirdDice, totalResult, smallOrBig, oddOrEven};
    }

    private static boolean isResultUpdated(String[] newLatestResult, String[] newPreviousResult) {
        if (!Helper.isEqual(Variables.latestResult, newLatestResult)) return true;
        else return Helper.isEqual(Variables.latestResult, newPreviousResult);
    }

}
