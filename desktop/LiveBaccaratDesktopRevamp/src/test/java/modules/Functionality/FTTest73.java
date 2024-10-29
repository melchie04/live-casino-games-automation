package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FTTest73 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 73");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 73",
                XPath.GameTable.Notification.BetsAccepted,
                5
        );

        WaitHandler.wait(2);

        VerificationHandler.verifyIfDisplayed(
                "FT Test 73",
                Variables.DEFAULT_BETTING_CHIP,
                5,
                "placed"
        );

        VerificationHandler.verifyIfContained(
                "FT Test 73",
                XPath.GameTable.BettingOption.PlayerBettingChip,
                "class",
                "confirm",
                "changed to dark color"
        );

        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
        double expectedTotalBet = Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP);
        double actualTotalBet = GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet);
        double expectedBalance = Variables.balanceBeforeBetting - expectedTotalBet;
        double actualBalance = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);

        CustomAssert.assertEquals(
                "FT Test 73",
                expectedTotalBet,
                actualTotalBet,
                "The second placed bet is reflected in the total bet when it's confirmed: " + expectedTotalBet + " == " + actualTotalBet,
                "The second placed bet is not reflected in the total bet when it's confirmed: " + expectedTotalBet + " != " + actualTotalBet
        );

        CustomAssert.assertEquals(
                "FT Test 73",
                expectedBalance,
                actualBalance,
                "The second placed bet is deducted from the total balance when it's confirmed: " + Variables.balanceBeforeBetting + " --> " + actualBalance,
                "The second placed bet is not deducted from the total balance when it's confirmed: " + Variables.balanceBeforeBetting + " --> " + actualBalance
        );

        System.out.println();
        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowTimer, Variables.WAIT_PHASE_SECONDS);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
