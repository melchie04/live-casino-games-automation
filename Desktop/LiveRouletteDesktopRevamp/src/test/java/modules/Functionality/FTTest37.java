package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.objects.CustomAssert;

public class FTTest37 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 37");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 37",
                ConditionHandler.isDisplayed(XPath.GameTable.MyBets.MyBets, 1),
                "The My Bets Modal is closed when the Close Button is clicked.",
                "The My Bets Modal is not closed when the Close Button is clicked."
        );

        System.out.println();
    }

}
