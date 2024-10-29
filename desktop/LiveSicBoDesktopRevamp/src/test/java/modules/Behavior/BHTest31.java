package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class BHTest31 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 31");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfContained(
                "BH Test 31",
                XPath.GameTable.UserSetting.LightMode,
                "class",
                "active",
                "highlighted"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
