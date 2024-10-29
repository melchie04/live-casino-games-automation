package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class BHTest46 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 46");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 46",
                XPath.GameTable.ToolBar.Cancel,
                "class",
                "disabled",
                "disabled after clicked"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
