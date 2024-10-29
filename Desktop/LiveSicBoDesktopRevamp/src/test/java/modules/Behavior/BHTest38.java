package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class BHTest38 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 38");
        System.out.println("Actual Results: ");

        String[] actualChipOptions = GetHandler.getTextArray(XPath.GameTable.ToolBar.DefaultChips);

        CustomAssert.assertTrue(
                "BH Test 38",
                Helper.contains(Variables.REMOVED_CHIP, actualChipOptions),
                "The default chips is not changed: " + Helper.toString(actualChipOptions),
                "The default chips is changed: " + Helper.toString(actualChipOptions)
        );

        System.out.println();
    }

}
