package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest36 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 36");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 36",
                XPath.GameTable.MyBets.MyBets,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 36",
                XPath.GameTable.MyBets.TabMenu.Settled,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 36",
                XPath.GameTable.MyBets.TabMenu.Running,
                5
        );

        System.out.println();
    }

}
