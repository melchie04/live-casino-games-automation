package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Locator;

public class FTTest70 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 70");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 70",
                Variables.DEFAULT_BETTING_CHIP,
                1,
                "removed"
        );

        for (Locator bettingChip : Variables.DEFAULT_BETTING_CHIPS) {
            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 70",
                    bettingChip,
                    1,
                    "removed"
            );
        }

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
