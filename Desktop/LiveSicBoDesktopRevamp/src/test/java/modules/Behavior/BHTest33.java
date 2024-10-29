package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class BHTest33 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 33");
        System.out.println("Actual Results: ");

        String actualTableName = GetHandler.getText(XPath.GameTable.JumpTable.ActiveProductName);

        CustomAssert.assertEquals(
                "BH Test 33",
                "Baccarat",
                actualTableName,
                "The selected Roulette product is highlighted.",
                "The selected Roulette product is not highlighted."
        );

        System.out.println();
        EventHandler.click(100, 100);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
