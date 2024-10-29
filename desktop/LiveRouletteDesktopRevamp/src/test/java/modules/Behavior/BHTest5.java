package modules.Behavior;

import globals.Variables;
import locators.XPath;
import org.testng.SkipException;
import utilities.handlers.VerificationHandler;

public class BHTest5 {

    private static boolean insideGameLobby = true;

    public static void verify() {
        if (Variables.hasNewAnnouncement) {
            if (insideGameLobby) {

                System.out.println();
                System.out.println("Module: BEHAVIOR");
                System.out.println("Test Case: 5");
                System.out.println("Actual Results: ");

                VerificationHandler.verifyIfDisplayed(
                        "BH Test 5",
                        XPath.GameLobby.NavBar.AnnouncementMarquee,
                        5,
                        "displayed when entering the game lobby"
                );

                insideGameLobby = false;

            } else {

                VerificationHandler.verifyIfDisplayed(
                        "BH Test 5",
                        XPath.GameLobby.NavBar.AnnouncementMarquee,
                        5,
                        "displayed when returning from the game table"
                );

            }
        } else throw new SkipException("There Is No New Announcement.");
    }

}
