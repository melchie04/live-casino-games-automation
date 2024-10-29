package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest1 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 1",
                XPath.GameLobby.Header.getTableLimits("Baccarat"),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 1",
                XPath.GameLobby.Content.getTables("Baccarat"),
                5
        );

        System.out.println();
    }

}
