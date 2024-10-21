package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest50 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 50");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 50",
                XPath.GameTable.ToolBar.Confirm,
                "class",
                "disabled",
                "enabled after placing bets"
        );

        System.out.println();
    }

}
