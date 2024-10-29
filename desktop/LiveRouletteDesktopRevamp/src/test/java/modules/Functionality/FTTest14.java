package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.NavigationHandler;
import utilities.objects.CustomAssert;

public class FTTest14 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 14");
        System.out.println("Actual Results: ");

        EventHandler.click(XPath.GameLobby.NavBar.Back);
        NavigationHandler.switchBackToMainWindow();
        NavigationHandler.switchToAnotherWindow();

        CustomAssert.assertTrue(
                "FT Test 14",
                ConditionHandler.isUrlContains("help.sbobet.com", 5),
                "The Help Page is open.",
                "The Help Page is not open."
        );

        System.out.println();
    }

}
