package modules.Functionality;

import globals.Variables;
import locators.XPath;
import org.testng.SkipException;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;

public class FTTest34 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 34");
        System.out.println("Actual Results: ");

        if (Variables.hasNewAnnouncement) {

            WaitHandler.wait(1);
            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 34",
                    XPath.GameTable.Announcement.NewAnnouncementCards,
                    1,
                    "marked as read"
            );

        } else throw new SkipException("There Is No Unread Announcement.");

        System.out.println();
        EventHandler.click(100, 100);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
