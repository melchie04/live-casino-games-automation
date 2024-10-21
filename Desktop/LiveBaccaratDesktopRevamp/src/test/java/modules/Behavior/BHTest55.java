package modules.Behavior;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest55 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 55");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 55",
                XPath.GameTable.ToolBar.Confirm,
                "class",
                "disabled",
                "enabled after the ReBet Button is clicked"
        );

        CustomAssert.assertTrue(
                "BH Test 55",
                ConditionHandler.isDisplayed(XPath.GameTable.ToolBar.Confirm, 5),
                "The ReBet button has been changed to the Confirm button.",
                "The ReBet button has not been changed to the Confirm button."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
