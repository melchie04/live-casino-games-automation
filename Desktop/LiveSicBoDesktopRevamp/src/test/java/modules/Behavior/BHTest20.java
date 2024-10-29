package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest20 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 20");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 20",
                XPath.GameTable.LimitsAndPayout.Payout,
                5,
                "the current display"
        );

        System.out.println();
    }

}
