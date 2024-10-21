package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest30 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 30");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 30",
                XPath.GameTable.UserSetting.DarkMode,
                "class",
                "active",
                "highlighted"
        );

        System.out.println();
    }

}
