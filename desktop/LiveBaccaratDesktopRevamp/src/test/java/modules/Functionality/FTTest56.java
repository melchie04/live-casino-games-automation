package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest56 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 56");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 56",
                XPath.GameTable.Notification.NoMoreBets,
                5
        );

        VerificationHandler.verifyIfNotContained(
                "FT Test 56",
                XPath.GameTable.ToolBar.ToolBar,
                "class",
                "active",
                "hidden"
        );

        EventHandler.click(Variables.DEFAULT_BETTING_OPTION);

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 56",
                Variables.DEFAULT_BETTING_CHIP,
                1,
                "denied"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
