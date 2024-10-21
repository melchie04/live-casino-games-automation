package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class BHTest1 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        CustomAssert.assertEquals(
                "BH Test 1",
                GetHandler.getText(XPath.GameLobby.SideMenu.ActiveSideMenuOption),
                "Baccarat",
                "The selected Roulette tab is highlighted.",
                "The selected Roulette tab is not highlighted."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
