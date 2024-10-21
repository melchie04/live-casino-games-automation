package modules.Behavior;

import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest52 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 52");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 52",
                XPath.GameTable.ToolBar.Confirm,
                "class",
                "disabled",
                "enabled after placing minimum bet limit"
        );

        CustomAssert.assertFalse(
                "BH Test 52",
                GetHandler.getText(XPath.GameTable.ToolBar.Confirm).contains("Top Up"),
                "The Top Up Confirm button has been changed to the Confirm button.",
                "The Top Up Confirm button has not been changed to the Confirm button."
        );

        System.out.println();
    }

}
