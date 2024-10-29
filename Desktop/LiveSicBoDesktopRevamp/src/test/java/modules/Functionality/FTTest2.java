package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest2 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 2");
        System.out.println("Actual Results: ");

        verify("Baccarat");
        verify("Roulette");
        verify("Sic Bo");

        System.out.println();
    }

    private static void verify(String targetLiveGame) {
        EventHandler.scroll(XPath.GameLobby.Header.getProductName(targetLiveGame));

        VerificationHandler.verifyIfDisplayed(
                "FT Test 2",
                XPath.GameLobby.Header.getTableLimits(targetLiveGame),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 2",
                XPath.GameLobby.Content.getTables(targetLiveGame),
                5
        );
    }

}
