package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FTTest64 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 64");
        System.out.println("Actual Results: ");

        String[] actualMyChips = GetHandler.getTextArray(XPath.GameTable.ChipSetting.MyChips);

        CustomAssert.assertFalse(
                "FT Test 64",
                Helper.find(Variables.REMOVED_CHIP, actualMyChips),
                "The " + Variables.REMOVED_CHIP + " chip is removed: " + Helper.toString(actualMyChips),
                "The " + Variables.REMOVED_CHIP + " chip is not removed: " + Helper.toString(actualMyChips)
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.ChipSetting.Close);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
