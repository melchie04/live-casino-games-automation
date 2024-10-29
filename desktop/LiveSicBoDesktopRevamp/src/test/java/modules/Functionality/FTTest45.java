package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Locator;

public class FTTest45 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 45");
        System.out.println("Actual Results: ");

        WaitHandler.wait(2);

        CustomAssert.assertTrue(
                "FT Test 45",
                isHelpPanelClosed(),
                "The Help Window is closed.",
                "The Help Window is not closed."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static boolean isHelpPanelClosed() {
        for (Locator tab : XPath.GameTable.Help.TabMenu.AllTabs)
            if (ConditionHandler.isDisplayed(tab, 1)) return false;
        return true;
    }

}
