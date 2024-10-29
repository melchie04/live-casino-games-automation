package modules.UserInterface;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class UITest4 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 4");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "UI Test 4",
                XPath.GameTable.Notification.PlaceYourBetsPlease,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 4",
                XPath.GameTable.Content.ShowTimer,
                5
        );

        VerificationHandler.verifyIfContained(
                "UI Test 4",
                XPath.GameTable.ToolBar.ToolBar,
                "class",
                "active",
                "displayed"
        );

        System.out.println();
    }

}
