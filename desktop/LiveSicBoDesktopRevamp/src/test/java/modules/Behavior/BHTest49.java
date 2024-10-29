package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class BHTest49 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 49");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 49",
                XPath.GameTable.ToolBar.Double,
                "class",
                "disabled",
                "disabled after reaching the maximum bet limit"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
