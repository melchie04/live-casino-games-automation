package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest42 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 42");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 42",
                XPath.GameTable.ToolBar.Undo,
                "class",
                "disabled",
                "enabled after placing bets"
        );

        System.out.println();
    }

}
