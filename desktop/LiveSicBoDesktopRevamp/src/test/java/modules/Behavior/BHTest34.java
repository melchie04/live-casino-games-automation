package modules.Behavior;

import globals.Variables;
import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Locator;

import java.util.List;

public class BHTest34 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 34");
        System.out.println("Actual Results: ");

        String[] actualLatestResults = getResult(XPath.GameLobby.ResultHistory.getLatestResult(Variables.tableName));

        CustomAssert.assertTrue(
                "BH Test 34",
                Helper.isEqual(Variables.latestResult, actualLatestResults),
                "The latest results within the Jump Table Panel of the Game Table and the Game Lobby is the same: " + Helper.toString(Variables.latestResult) + " == " + Helper.toString(actualLatestResults),
                "The latest results within the Jump Table Panel of the Game Table and the Game Lobby is not the same: " + Helper.toString(Variables.latestResult) + " != " + Helper.toString(actualLatestResults)
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
        return new String[]{firstDice,secondDice, thirdDice, totalResult, smallOrBig};
    }

}
