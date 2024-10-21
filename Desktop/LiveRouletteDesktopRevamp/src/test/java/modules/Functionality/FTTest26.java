package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest26 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 26");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 26",
                XPath.GameTable.LimitsAndPayout.Payout,
                5
        );

        System.out.println();
    }

}
