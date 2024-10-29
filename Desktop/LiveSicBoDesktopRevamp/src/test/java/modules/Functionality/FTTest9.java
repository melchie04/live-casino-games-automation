package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest9 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 9");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 9",
                XPath.GameLobby.MyBets.MyBets,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 9",
                XPath.GameLobby.MyBets.TabMenu.Settled,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 9",
                XPath.GameLobby.MyBets.TabMenu.Running,
                5
        );

        System.out.println();
    }

}
