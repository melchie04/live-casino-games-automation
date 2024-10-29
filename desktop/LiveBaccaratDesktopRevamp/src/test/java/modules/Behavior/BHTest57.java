package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class BHTest57 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 57");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 57",
                XPath.GameTable.Confirmation.ConfirmNow,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BH Test 57",
                XPath.GameTable.Confirmation.Confirm,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BH Test 57",
                XPath.GameTable.Confirmation.NotNow,
                5
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.Confirmation.NotNow);
    }

}
