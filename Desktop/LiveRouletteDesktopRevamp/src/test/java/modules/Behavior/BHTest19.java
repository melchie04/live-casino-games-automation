package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest19 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 19");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 19",
                XPath.GameTable.LimitsAndPayout.BetLimit,
                5,
                "the default display"
        );

        System.out.println();
    }

}
