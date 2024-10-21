package modules.Behavior;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest56 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 56");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 56",
                XPath.GameTable.Notification.ExceededTheMaxBet,
                5
        );

        CustomAssert.assertEquals(
                "BH Test 56",
                Variables.placedBet,
                Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP),
                "The placed bets did not exceed the maximum limit.",
                "The placed bets exceed the maximum limit."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
