package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FTTest13 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 13");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 13",
                ConditionHandler.isDisplayed(XPath.GameLobby.BetDetails.BetDetails, 1),
                "The Bet Details Modal is closed.",
                "The Bet Details Modal is not closed."
        );

        CustomAssert.assertTrue(
                "FT Test 13",
                ConditionHandler.isDisplayed(XPath.GameLobby.MyBets.MyBets, 5),
                "The player went back to the My Bets Modal.",
                "The player did not go back to the My Bets Modal."
        );

        System.out.println();
        EventHandler.click(100, 100);
    }

}
