package modules.Behavior;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest54 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 54");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotContained(
                "BH Test 54",
                XPath.GameTable.ToolBar.ReBet,
                "class",
                "disabled",
                "enabled after the round is settled"
        );

        CustomAssert.assertTrue(
                "BH Test 54",
                ConditionHandler.isDisplayed(XPath.GameTable.ToolBar.ReBet, 5),
                "The Confirm button has been changed to the ReBet button.",
                "The Confirm button has not been changed to the ReBet button."
        );

        System.out.println();
    }

}
