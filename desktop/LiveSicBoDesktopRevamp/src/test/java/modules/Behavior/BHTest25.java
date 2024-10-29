package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Locator;

public class BHTest25 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 25");
        System.out.println("Actual Results: ");

        if (Variables.pinnedAnnouncementCards > 0)
            verify(Variables.pinnedAnnouncementCards, XPath.GameLobby.Announcement.PinnedAnnouncementCards);
        if (Variables.allAnnouncementCards > 0)
            verify(Variables.allAnnouncementCards, XPath.GameLobby.Announcement.AllAnnouncementCards);
        if (Variables.newAnnouncementCards > 0)
            verify(Variables.newAnnouncementCards, XPath.GameLobby.Announcement.NewAnnouncementCards);

        EventHandler.click(100, 100);
    }

    private static void verify(int expected, Locator actualLocator) {
        CustomAssert.assertEquals(
                "BH Test 25",
                expected,
                GetHandler.getElements(actualLocator).size(),
                "The " + actualLocator.getName() + " of the Announcement Modal in the Game Table and Game Lobby are the same.",
                "The " + actualLocator.getName() + " of the Announcement Modal in the Game Table and Game Lobby are not the same."
        );
    }

}
