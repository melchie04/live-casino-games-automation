package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest9 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 9");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 9",
                XPath.GameLobby.UserSetting.LightMode,
                "class",
                "active",
                "highlighted as a default theme"
        );

        System.out.println();
    }

}
