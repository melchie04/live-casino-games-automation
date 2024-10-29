package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class FTTest81 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 81");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);

        CustomAssert.assertFalse(
                "FT Test 81",
                ConditionHandler.isDisplayed(XPath.GameTable.Confirmation.ConfirmNow, 1),
                "The Confirmation Modal is closed.",
                "The Confirmation Modal is not closed."
        );

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 81",
                Variables.DEFAULT_BETTING_CHIP,
                1,
                "removed"
        );

        CustomAssert.assertEquals(
                "FT Test 81",
                0,
                GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet),
                "The placed bet is denied.",
                "The placed bet is not denied.");

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
