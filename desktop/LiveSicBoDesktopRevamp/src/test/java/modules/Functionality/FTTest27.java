package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest27 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 27");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 27",
                XPath.GameTable.LimitsAndPayout.BetLimit,
                5
        );

        System.out.println();
    }

}
