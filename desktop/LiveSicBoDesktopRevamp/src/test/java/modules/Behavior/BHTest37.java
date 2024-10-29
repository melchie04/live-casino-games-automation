package modules.Behavior;

import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

import java.util.List;

public class BHTest37 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 37");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(XPath.GameTable.RoundResult.RoundResult, 150);

        VerificationHandler.verifyIfDisplayed(
                "BE Test 37",
                XPath.GameTable.RoundResult.DiceResult,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BE Test 37",
                XPath.GameTable.RoundResult.TotalResult,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BE Test 37",
                XPath.GameTable.BettingOption.WinBettingOptions,
                5
        );

        int expectedTotal = GetHandler.getInt(XPath.GameTable.RoundResult.TotalResult);
        int actualTotal = getTotalResult();

        CustomAssert.assertEquals(
                "BE Test 37",
                expectedTotal,
                actualTotal,
                "The total result is correct: " + expectedTotal + " == " + actualTotal,
                "The total result is correct: " + expectedTotal + " != " + actualTotal
        );

        int expectedLatestResult = GetHandler.getInt(XPath.GameTable.GameResults.TotalResult);

        CustomAssert.assertEquals(
                "BE Test 37",
                expectedTotal,
                actualTotal,
                "The latest result in the Game Results is correct: " + expectedLatestResult + " == " + actualTotal,
                "The latest result in the Game Results is correct: " + expectedLatestResult + " != " + actualTotal
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static int getTotalResult() {
        List<WebElement> elements = GetHandler.getElements(XPath.GameTable.RoundResult.DiceResult);
        int total = 0;
        for (int i = 0; i < 3; i++)
            total += Integer.parseInt(elements.get(i).getAttribute("class").replace("dice dice_", ""));
        return total;
    }

}
