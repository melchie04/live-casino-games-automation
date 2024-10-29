package modules.Behavior;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest40 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 40");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 40",
                XPath.GameTable.Notification.AddMore,
                5
        );

        CustomAssert.assertTrue(
                "BH Test 40",
                ConditionHandler.isDisplayed(XPath.GameTable.ChipSetting.MyChips, 5),
                "The Chip Settings Panel is open.",
                "The Chip Settings Panel is not open."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.ChipSetting.Close);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
