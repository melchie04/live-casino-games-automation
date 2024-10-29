package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest58 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 58");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(
                "BH Test 58",
                Variables.DEFAULT_BETTING_CHIP,
                1,
                "removed"
        );

        CustomAssert.assertEquals(
                "BH Test 58",
                0,
                GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet),
                "The placed bet is denied.",
                "The placed bet is not denied.");

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
