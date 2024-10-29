package modules.UserInterface;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class UITest5 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 5");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "UI Test 5",
                XPath.GameTable.Notification.NoMoreBets,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 5",
                XPath.GameTable.Content.ShowDealing,
                5
        );

        VerificationHandler.verifyIfNotContained(
                "UI Test 5",
                XPath.GameTable.ToolBar.ToolBar,
                "class",
                "active",
                "hidden"
        );

        System.out.println();
    }

}
