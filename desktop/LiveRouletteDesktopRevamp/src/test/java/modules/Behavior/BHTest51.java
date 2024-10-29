package modules.Behavior;

import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest51 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 51");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 51",
                XPath.GameTable.ToolBar.Confirm,
                "class",
                "disabled",
                "enabled after placing lower than minimum bet limit"
        );

        CustomAssert.assertTrue(
                "BH Test 51",
                GetHandler.getText(XPath.GameTable.ToolBar.Confirm).contains("Top Up"),
                "The Confirm button has been changed to the Top Up Confirm button.",
                "The Confirm button has not been changed to the Top Up Confirm button."
        );

        System.out.println();
    }

}
