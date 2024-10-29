package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest15 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 15");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 15",
                XPath.GameLobby.Content.getShowCards(Variables.tableName),
                Variables.WAIT_PHASE_SECONDS
        );

        VerificationHandler.verifyIfDisplayed(
                "BH Test 15",
                XPath.GameLobby.Content.getShowDealing(Variables.tableName),
                Variables.WAIT_PHASE_SECONDS
        );

        System.out.println();
    }

}
