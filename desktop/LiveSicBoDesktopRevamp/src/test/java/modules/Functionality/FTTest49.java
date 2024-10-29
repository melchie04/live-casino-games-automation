package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest49 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 49");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "FT Test 49",
                XPath.GameTable.Content.Theme,
                "class",
                "light",
                "changed to light mode when the Light Mode Button is clicked"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
