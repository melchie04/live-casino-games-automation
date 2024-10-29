package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FTTest74 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 74");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 74",
                XPath.GameTable.Notification.BetsAccepted,
                10
        );

        WaitHandler.wait(2);
        double actualBet = Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP);

        CustomAssert.assertTrue(
                "FT Test 74",
                Variables.placedBet < actualBet,
                "The placed bet has been increased to the minimum bet limit: " + Variables.placedBet + " --> " + actualBet,
                "The placed bet has not been increased to the minimum bet limit: " + Variables.placedBet + " --> " + actualBet
        );

        VerificationHandler.verifyIfContained(
                "FT Test 74",
                XPath.GameTable.BettingOption.PlayerBettingChip,
                "class",
                "confirm",
                "changed to dark color"
        );

        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
        double actualTotalBet = GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet);
        double expectedBalance = Variables.balanceBeforeBetting - actualBet;
        double actualBalance = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);

        CustomAssert.assertEquals(
                "FT Test 74",
                actualBet,
                actualTotalBet,
                "The placed bet is reflected in the total bet when it's top up confirmed: " + actualBet + " == " + actualTotalBet,
                "The placed bet is not reflected in the total bet when it's top up confirmed: " + actualBet + " != " + actualTotalBet
        );

        CustomAssert.assertEquals(
                "FT Test 74",
                expectedBalance,
                actualBalance,
                "The placed bet is deducted from the total balance when it's top up confirmed: " + Variables.balanceBeforeBetting + " --> " + actualBalance,
                "The placed bet is not deducted from the total balance when it's top up confirmed: " + Variables.balanceBeforeBetting + " --> " + actualBalance
        );

        System.out.println();
        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowTimer, Variables.WAIT_PHASE_SECONDS);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
