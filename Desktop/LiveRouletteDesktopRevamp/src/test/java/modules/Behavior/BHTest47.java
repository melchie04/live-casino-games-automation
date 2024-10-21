package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest47 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 47");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 47",
                XPath.GameTable.ToolBar.Double,
                "class",
                "disabled",
                "enabled after placing bets"
        );

        System.out.println();
    }

}
