package modules.Behavior;

import locators.XPath;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;

public class BHTest53 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 53");
        System.out.println("Actual Results: ");

        WaitHandler.wait(3);

        VerificationHandler.verifyIfContained(
                "BH Test 53",
                XPath.GameTable.ToolBar.Confirm,
                "class",
                "disabled",
                "disabled after clicked"
        );

        VerificationHandler.verifyIfContained(
                "BH Test 53",
                XPath.GameTable.ToolBar.Double,
                "class",
                "disabled",
                "disabled after confirming bets"
        );

        VerificationHandler.verifyIfContained(
                "BH Test 53",
                XPath.GameTable.ToolBar.Cancel,
                "class",
                "disabled",
                "disabled after confirming bets"
        );

        VerificationHandler.verifyIfContained(
                "BH Test 53",
                XPath.GameTable.ToolBar.Undo,
                "class",
                "disabled",
                "disabled after confirming bets"
        );

        System.out.println();
    }

}
