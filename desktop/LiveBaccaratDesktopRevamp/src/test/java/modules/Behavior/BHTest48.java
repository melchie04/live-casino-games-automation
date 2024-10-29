package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest48 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 48");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 48",
                XPath.GameTable.ToolBar.Double,
                "class",
                "disabled",
                "enabled after clicked"
        );

        System.out.println();
    }

}
