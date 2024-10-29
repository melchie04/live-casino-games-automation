package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class BHTest39 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 39");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 39",
                XPath.GameTable.Notification.RemoveOne,
                5
        );

        String[] actualMyChips = GetHandler.getTextArray(XPath.GameTable.ChipSetting.MyChips);

        CustomAssert.assertFalse(
                "BH Test 39",
                Helper.find(Variables.ADDED_CHIP, actualMyChips),
                "The " + Variables.ADDED_CHIP + " chip is not added: " + Helper.toString(actualMyChips),
                "The " + Variables.ADDED_CHIP + " chip is added: " + Helper.toString(actualMyChips)
        );

        System.out.println();
    }

}
