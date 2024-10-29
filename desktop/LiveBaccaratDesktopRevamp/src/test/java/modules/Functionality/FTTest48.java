package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest48 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 48");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "FT Test 48",
                XPath.GameTable.Content.Theme,
                "class",
                "dark",
                "changed to dark mode when the Dark Mode Button is clicked"
        );

        System.out.println();
    }

}
