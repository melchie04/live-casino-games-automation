package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class BHTest44 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 44");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 44",
                XPath.GameTable.ToolBar.Undo,
                "class",
                "disabled",
                "disabled after pressing and holding"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
