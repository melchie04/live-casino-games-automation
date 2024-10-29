package modules.Behavior;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class BHTest28 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 28");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(
                "BH Test 28",
                ConditionHandler.isDisplayed(XPath.GameTable.MyBets.DefaultTab, 5),
                "The Settled Tab is highlighted.",
                "The Settled Tab is not highlighted."
        );

        System.out.println();
        EventHandler.click(100, 100);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
