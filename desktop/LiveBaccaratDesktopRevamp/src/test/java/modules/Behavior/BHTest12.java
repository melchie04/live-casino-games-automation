package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class BHTest12 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 12");
        System.out.println("Actual Results: ");

        CustomAssert.assertEquals(
                "BH Test 12",
                Variables.TABLE_LIMIT,
                GetHandler.getText(XPath.GameLobby.Header.getActiveTableLimit(Variables.productName)),
                "The selected " + Variables.TABLE_LIMIT + " table limit is highlighted.",
                "The selected " + Variables.TABLE_LIMIT + " table limit is not highlighted."
        );

        System.out.println();
    }

}
