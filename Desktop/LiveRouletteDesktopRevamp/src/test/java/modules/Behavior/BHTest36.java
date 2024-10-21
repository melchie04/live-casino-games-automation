package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class BHTest36 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 36");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 36",
                XPath.GameTable.Content.ShowDealing,
                5
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
