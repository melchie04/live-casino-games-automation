package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.objects.CustomAssert;

public class FTTest6 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 6");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(
                "FT Test 6",
                ConditionHandler.isDisplayed(XPath.GameLobby.Announcement.Announcement, 1),
                "The Announcement Modal is closed when it's clicked outside of modal.",
                "The Announcement Modal is not closed when it's clicked outside of modal."
        );

        System.out.println();
    }

}
