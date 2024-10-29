package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FTTest66 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 66");
        System.out.println("Actual Results: ");

        String[] actualMyChips = GetHandler.getTextArray(XPath.GameTable.ChipSetting.MyChips);

        CustomAssert.assertTrue(
                "FT Test 66",
                Helper.find(Variables.ADDED_CHIP, actualMyChips),
                "The " + Variables.ADDED_CHIP + " chip is added: " + Helper.toString(actualMyChips),
                "The " + Variables.ADDED_CHIP + " chip is not added: " + Helper.toString(actualMyChips)
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.ChipSetting.Close);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
