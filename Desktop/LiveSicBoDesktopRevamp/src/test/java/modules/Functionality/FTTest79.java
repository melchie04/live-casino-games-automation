package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class FTTest79 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 79");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 79",
                XPath.GameTable.Notification.BetsAccepted,
                5
        );

        CustomAssert.assertFalse(
                "FT Test 79",
                ConditionHandler.isDisplayed(XPath.GameTable.Confirmation.ConfirmNow, 1),
                "The Confirmation Modal is closed.",
                "The Confirmation Modal is not closed."
        );

        WaitHandler.wait(2);

        VerificationHandler.verifyIfDisplayed(
                "FT Test 79",
                Variables.DEFAULT_BETTING_CHIP,
                5,
                "placed"
        );

        VerificationHandler.verifyIfContained(
                "FT Test 79",
                Variables.DEFAULT_BETTING_CHIP,
                "class",
                "confirm",
                "changed to dark color"
        );

        double expectedTotalBet = Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP);
        double actualTotalBet = GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet);
        double expectedBalance = Variables.balanceBeforeBetting - expectedTotalBet;
        double actualBalance = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);

        CustomAssert.assertEquals(
                "FT Test 79",
                expectedTotalBet,
                actualTotalBet,
                "The total bet is displayed according to player's placed bet: " + expectedTotalBet + " == " + actualTotalBet,
                "The total bet is not displayed according to player's placed bet: " + expectedTotalBet + " != " + actualTotalBet
        );

        CustomAssert.assertEquals(
                "FT Test 79",
                expectedBalance,
                actualBalance,
                "The placed bet is deducted in the balance: " + Variables.balanceBeforeBetting + " --> " + actualBalance,
                "The placed bet is not deducted in the balance: " + Variables.balanceBeforeBetting + " --> " + actualBalance
        );

        System.out.println();
        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowTimer, Variables.WAIT_PHASE_SECONDS);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
