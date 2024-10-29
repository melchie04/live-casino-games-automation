package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Locator;

public class BHTest4 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 4");
        System.out.println("Actual Results: ");

        if (Variables.pinnedAnnouncementCards > 0)
            verify(Variables.pinnedAnnouncementCards, XPath.GameTable.Announcement.PinnedAnnouncementCards);
        if (Variables.allAnnouncementCards > 0)
            verify(Variables.allAnnouncementCards, XPath.GameTable.Announcement.AllAnnouncementCards);
        if (Variables.newAnnouncementCards > 0)
            verify(Variables.newAnnouncementCards, XPath.GameTable.Announcement.NewAnnouncementCards);

        EventHandler.click(100, 100);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static void verify(int expected, Locator actualLocator) {
        CustomAssert.assertEquals(
                "BH Test 4",
                expected,
                GetHandler.getElements(actualLocator).size(),
                "The " + actualLocator.getName() + " of the Announcement Modal in the Game Lobby and Game Table are the same.",
                "The " + actualLocator.getName() + " of the Announcement Modal in the Game Lobby and Game Table are not the same."
        );
    }

}
