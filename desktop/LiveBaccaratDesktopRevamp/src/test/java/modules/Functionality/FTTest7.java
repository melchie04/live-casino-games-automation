package modules.Functionality;

import globals.Variables;
import locators.XPath;
import org.testng.SkipException;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;

public class FTTest7 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 7");
        System.out.println("Actual Results: ");

        if (Variables.hasNewAnnouncement) {

            WaitHandler.wait(1);
            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 7",
                    XPath.GameLobby.Announcement.NewAnnouncementCards,
                    1,
                    "marked as read"
            );

        } else throw new SkipException("There Is No Unread Announcement.");

        System.out.println();
    }

}
