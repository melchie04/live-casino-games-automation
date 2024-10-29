package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest25 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 25");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 25",
                XPath.GameTable.LimitsAndPayout.TabMenu.Payout,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 25",
                XPath.GameTable.LimitsAndPayout.TabMenu.BetLimit,
                5
        );

        System.out.println();
    }

}
