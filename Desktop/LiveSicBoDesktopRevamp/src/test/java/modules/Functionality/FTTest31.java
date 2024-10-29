package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;

public class FTTest31 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 31");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 31",
                XPath.GameTable.Announcement.Announcement,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 31",
                XPath.GameTable.Announcement.Close,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 31",
                XPath.GameTable.Announcement.MarkAllAsRead,
                5
        );

        if (ConditionHandler.isDisplayed(XPath.GameTable.Announcement.PinnedAnnouncementCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 31",
                    XPath.GameTable.Announcement.PinnedAnnouncementCards,
                    5
            );
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 31",
                    XPath.GameTable.Announcement.PinIcon,
                    5
            );
        }

        if (ConditionHandler.isDisplayed(XPath.GameTable.Announcement.AllAnnouncementCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 31",
                    XPath.GameTable.Announcement.AllAnnouncementCards,
                    5
            );
        }

        if (ConditionHandler.isDisplayed(XPath.GameTable.Announcement.NewAnnouncementCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 31",
                    XPath.GameTable.Announcement.NewAnnouncementCards,
                    5
            );
        }

        System.out.println();
    }

}
