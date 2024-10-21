package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest50 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 50");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 50",
                XPath.GameTable.JumpTable.JumpTable,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 50",
                XPath.GameTable.JumpTable.ActiveTableName,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 50",
                XPath.GameTable.JumpTable.InactiveProductNames,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 50",
                XPath.GameTable.JumpTable.AllTableCards,
                5
        );

        EventHandler.scroll(XPath.GameTable.JumpTable.YouAreHere);

        VerificationHandler.verifyIfDisplayed(
                "FT Test 50",
                XPath.GameTable.JumpTable.YouAreHere,
                5
        );

        System.out.println();
    }

}
