package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest18 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 18");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "FT Test 18",
                XPath.GameLobby.RoadMaps.ResultHistoryTheme,
                "class",
                "light",
                "changed to light mode when the Light Mode Button is clicked"
        );

        System.out.println();
    }

}
