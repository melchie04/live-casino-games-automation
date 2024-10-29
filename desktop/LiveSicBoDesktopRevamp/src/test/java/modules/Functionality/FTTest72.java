package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FTTest72 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 72");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 72",
                XPath.GameTable.Notification.BetsAccepted,
                5
        );

        WaitHandler.wait(2);

        VerificationHandler.verifyIfDisplayed(
                "FT Test 72",
                Variables.DEFAULT_BETTING_CHIP,
                5,
                "placed"
        );

        VerificationHandler.verifyIfContained(
                "FT Test 72",
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
                "FT Test 72",
                expectedTotalBet,
                actualTotalBet,
                "The total bet is displayed according to player's placed bet: " + expectedTotalBet + " == " + actualTotalBet,
                "The total bet is not displayed according to player's placed bet: " + expectedTotalBet + " != " + actualTotalBet
        );

        CustomAssert.assertEquals(
                "FT Test 72",
                expectedBalance,
                actualBalance,
                "The placed bet is deducted in the balance: " + Variables.balanceBeforeBetting + " --> " + actualBalance,
                "The placed bet is not deducted in the balance: " + Variables.balanceBeforeBetting + " --> " + actualBalance
        );

        System.out.println();
    }

}
