package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest17 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 17");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "FT Test 17",
                XPath.GameLobby.ResultHistory.ResultHistoryTheme,
                "class",
                "dark",
                "changed to dark mode when the Dark Mode Button is clicked"
        );

        System.out.println();
    }

}
