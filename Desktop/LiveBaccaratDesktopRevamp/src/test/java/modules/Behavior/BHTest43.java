package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest43 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 43");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 43",
                XPath.GameTable.ToolBar.Undo,
                "class",
                "disabled",
                "enabled after clicked when there are still placed bets"
        );

        System.out.println();
    }

}
