package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest45 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 45");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 45",
                XPath.GameTable.ToolBar.Cancel,
                "class",
                "disabled",
                "enabled after placing bets"
        );

        System.out.println();
    }

}
