package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest43 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 43");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 43",
                XPath.GameTable.Help.Back,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 43",
                XPath.GameTable.Help.TabMenu.Basics,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 43",
                XPath.GameTable.Help.TabMenu.BetOptions,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 43",
                XPath.GameTable.Help.TabMenu.GameControls,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 43",
                XPath.GameTable.Help.TabMenu.Likelihood,
                5
        );

        System.out.println();
    }

}
