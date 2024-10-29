package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FTTest33 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 33");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 33",
                ConditionHandler.isDisplayed(XPath.GameTable.Announcement.Announcement, 1),
                "The Announcement Modal is closed when it's clicked outside of modal.",
                "The Announcement Modal is not closed when it's clicked outside of modal."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
