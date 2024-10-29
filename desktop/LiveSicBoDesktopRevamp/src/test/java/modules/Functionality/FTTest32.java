package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.objects.CustomAssert;

public class FTTest32 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 32");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 32",
                ConditionHandler.isDisplayed(XPath.GameTable.Announcement.Announcement, 1),
                "The Announcement Modal is closed when the Close Button is clicked.",
                "The Announcement Modal is not closed when the Close Button is clicked."
        );

        System.out.println();
    }

}
