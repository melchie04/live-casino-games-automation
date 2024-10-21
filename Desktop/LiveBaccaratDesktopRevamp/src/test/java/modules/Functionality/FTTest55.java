package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Locator;

public class FTTest55 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 55");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 55",
                XPath.GameTable.Notification.PlaceYourBetsPlease,
                5
        );

        VerificationHandler.verifyIfContained(
                "FT Test 55",
                XPath.GameTable.ToolBar.ToolBar,
                "class",
                "active",
                "displayed"
        );

        for (Locator actionButton : XPath.GameTable.ToolBar.AllActionButtons)
            VerificationHandler.verifyIfContained(
                    "FT Test 55",
                    actionButton,
                    "class",
                    "disabled",
                    "disabled"
            );

        EventHandler.click(Variables.DEFAULT_BETTING_OPTION);

        VerificationHandler.verifyIfDisplayed(
                "FT Test 55",
                Variables.DEFAULT_BETTING_CHIP,
                5,
                "placed"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
