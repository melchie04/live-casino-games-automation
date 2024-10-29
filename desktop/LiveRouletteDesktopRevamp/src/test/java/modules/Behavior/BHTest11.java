package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest11 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 11");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 11",
                XPath.GameLobby.UserSetting.LightMode,
                "class",
                "active",
                "highlighted"
        );

        System.out.println();
    }

}
