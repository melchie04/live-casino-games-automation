package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest51 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 51");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 51",
                XPath.GameTable.JumpTable.JumpTable,
                1,
                "closed"
        );

        System.out.println();
    }

}
