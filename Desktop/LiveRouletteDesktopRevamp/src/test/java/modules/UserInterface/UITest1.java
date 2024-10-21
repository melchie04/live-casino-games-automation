package modules.UserInterface;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class UITest1 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "UI Test 1",
                XPath.LiveCasino.LiveRouletteDesktopRevamp,
                5
        );

        System.out.println();
    }

}
