package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest2 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 2");
        System.out.println("Actual Results: ");

        if (Variables.hasNewAnnouncement) {

            VerificationHandler.verifyIfDisplayed(
                    "BH Test 2",
                    XPath.GameLobby.NavBar.NewAnnouncementIndicator,
                    5,
                    "displayed when there is new announcement"
            );

        } else {

            VerificationHandler.verifyIfNotDisplayed(
                    "BH Test 2",
                    XPath.GameLobby.NavBar.NewAnnouncementIndicator,
                    1,
                    "hidden when there is no new announcement"
            );

        }
    }

}
