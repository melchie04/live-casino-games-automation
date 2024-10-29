package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.objects.CustomAssert;

public class FTTest11 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 11");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 11",
                ConditionHandler.isDisplayed(XPath.GameLobby.MyBets.MyBets, 1),
                "The My Bets Modal is closed when it's clicked outside of modal.",
                "The My Bets Modal is not closed when it's clicked outside of modal."
        );

        System.out.println();
    }

}
