package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class BHTest22 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 22");
        System.out.println("Actual Results: ");

        String newTableLimit = GetHandler.getText(XPath.GameTable.TableLimit.ActiveTableLimit);

        CustomAssert.assertNotEquals(
                "BH Test 22",
                Variables.tableLimit,
                newTableLimit,
                "The selected " + Variables.TABLE_LIMIT + " table limit is highlighted.",
                "The selected " + Variables.TABLE_LIMIT + " table limit is not highlighted."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
