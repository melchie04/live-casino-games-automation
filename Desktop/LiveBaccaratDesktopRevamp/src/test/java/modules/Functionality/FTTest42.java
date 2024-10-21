package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FTTest42 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 42");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 42",
                ConditionHandler.isDisplayed(XPath.GameTable.BetDetails.BetDetails, 1),
                "The Bet Details Modal is closed.",
                "The Bet Details Modal is not closed."
        );

        CustomAssert.assertTrue(
                "FT Test 42",
                ConditionHandler.isDisplayed(XPath.GameTable.MyBets.MyBets, 5),
                "The player went back to the My Bets Modal.",
                "The player did not go back to the My Bets Modal."
        );

        System.out.println();
        EventHandler.click(100, 100);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
