package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.VerificationHandler;

public class BHTest23 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 23");
        System.out.println("Actual Results: ");

        if (Variables.hasNewAnnouncement) {

            VerificationHandler.verifyIfDisplayed(
                    "BH Test 23",
                    XPath.GameTable.NavBar.NewAnnouncementIndicator,
                    5,
                    "displayed when there is new announcement"
            );

        } else {

            VerificationHandler.verifyIfNotDisplayed(
                    "BH Test 23",
                    XPath.GameTable.NavBar.NewAnnouncementIndicator,
                    1,
                    "hidden when there is no new announcement"
            );

        }
    }

}
