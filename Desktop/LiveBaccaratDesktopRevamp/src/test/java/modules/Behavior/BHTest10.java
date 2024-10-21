package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest10 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 10");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 10",
                XPath.GameLobby.UserSetting.DarkMode,
                "class",
                "active",
                "highlighted"
        );

        System.out.println();
    }

}
