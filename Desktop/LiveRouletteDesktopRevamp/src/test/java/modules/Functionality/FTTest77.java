package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Locator;

public class FTTest77 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 77");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 77",
                Variables.DEFAULT_BETTING_CHIP,
                5,
                "placed"
        );

        for (Locator actionButton : XPath.GameTable.ToolBar.AllActionButtons)
            VerificationHandler.verifyIfNotContained(
                    "FT Test 77",
                    actionButton,
                    "class",
                    "disabled",
                    "enabled"
            );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
