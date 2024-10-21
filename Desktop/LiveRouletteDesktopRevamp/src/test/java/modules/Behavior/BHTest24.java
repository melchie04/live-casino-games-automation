package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.objects.CustomAssert;

public class BHTest24 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 24");
        System.out.println("Actual Results: ");

        if (Variables.hasNewAnnouncement) {

            CustomAssert.assertTrue(
                    "BH Test 24",
                    ConditionHandler.isEnabled(XPath.GameTable.Announcement.MarkAllAsRead, 5),
                    "The Mark All As Read Button is enabled.",
                    "The Mark All As Read Button is not enabled."
            );

            CustomAssert.assertTrue(
                    "BH Test 24",
                    ConditionHandler.isDisplayed(XPath.GameTable.Announcement.NewAnnouncementCards, 5),
                    "There are highlighted announcement cards.",
                    "There are no highlighted announcement cards."
            );

        } else {

            CustomAssert.assertFalse(
                    "BH Test 24",
                    ConditionHandler.isEnabled(XPath.GameTable.Announcement.MarkAllAsRead, 1),
                    "The Mark All As Read Button is disabled.",
                    "The Mark All As Read Button is not disabled."
            );

            CustomAssert.assertFalse(
                    "BH Test 24",
                    ConditionHandler.isDisplayed(XPath.GameTable.Announcement.NewAnnouncementCards, 1),
                    "There are no highlighted announcement cards.",
                    "There are highlighted announcement cards."
            );

        }
    }

}