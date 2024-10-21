package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FTTest62 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 62");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 62",
                ConditionHandler.isDisplayed(XPath.GameTable.ChipSetting.ChipSelections, 1) ||
                        ConditionHandler.isDisplayed(XPath.GameTable.ChipSetting.MyChips, 1),
                "The Chip Settings Panel is closed.",
                "The Chip Settings Panel is not closed."
        );

        String[] actualChipOptions = GetHandler.getTextArray(XPath.GameTable.ToolBar.DefaultChips);

        CustomAssert.assertTrue(
                "FT Test 62",
                Helper.contains(Variables.REMOVED_CHIP, actualChipOptions),
                "The selected chips is not changed: " + Helper.toString(actualChipOptions),
                "The selected chips is changed: " + Helper.toString(actualChipOptions)
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
