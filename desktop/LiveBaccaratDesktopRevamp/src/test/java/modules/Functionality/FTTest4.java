package modules.Functionality;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;

public class FTTest4 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 4");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 4",
                XPath.GameLobby.Announcement.Announcement,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 4",
                XPath.GameLobby.Announcement.Close,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 4",
                XPath.GameLobby.Announcement.MarkAllAsRead,
                5
        );

        if (ConditionHandler.isDisplayed(XPath.GameLobby.Announcement.PinnedAnnouncementCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 4",
                    XPath.GameLobby.Announcement.PinnedAnnouncementCards,
                    5
            );
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 4",
                    XPath.GameLobby.Announcement.PinIcon,
                    5
            );
        }

        if (ConditionHandler.isDisplayed(XPath.GameLobby.Announcement.AllAnnouncementCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 4",
                    XPath.GameLobby.Announcement.AllAnnouncementCards,
                    5
            );
        }

        if (ConditionHandler.isDisplayed(XPath.GameLobby.Announcement.NewAnnouncementCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "FT Test 4",
                    XPath.GameLobby.Announcement.NewAnnouncementCards,
                    5
            );
        }

        System.out.println();
    }

}
