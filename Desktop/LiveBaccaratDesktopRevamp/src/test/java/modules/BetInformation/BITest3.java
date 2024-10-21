package modules.BetInformation;

import globals.Condition;
import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Locator;

public class BITest3 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BET INFORMATION");
        System.out.println("Test Case: 3");
        System.out.println("Table Name: " + Variables.tableName);
        System.out.println("Round ID: " + Variables.roundID);
        System.out.println("Round Result: " + Helper.toString(Variables.roundResult));
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(XPath.GameTable.BetDetails.BetDetails, 15);

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.Back,
                5
        );

        WaitHandler.wait(2);
        double expectedStake = Variables.totalBet;
        double actualStake = GetHandler.getDouble(XPath.GameTable.BetDetails.Stake);

        CustomAssert.assertEquals(
                "BI Test 3",
                expectedStake,
                actualStake,
                "The stake is correct: " + expectedStake + " == " + actualStake,
                "The stake is not correct: " + expectedStake + " != " + actualStake
        );

        double expectedWinLoss = getExpectedWinLoss();
        double actualWinLoss = GetHandler.getDouble(XPath.GameTable.BetDetails.WinLoss);

        CustomAssert.assertEquals(
                "BI Test 3",
                expectedWinLoss,
                actualWinLoss,
                "The win/loss is correct: " + expectedWinLoss + " == " + actualWinLoss,
                "The win/loss is not correct: " + expectedWinLoss + " != " + actualWinLoss
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.PlayerCards, 5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.PlayerTotalPoints,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.BankerCards,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.BankerTotalPoints,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.TieWon,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.BettingOption,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.WinBettingOptions,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                Variables.DEFAULT_BETTING_CHIP,
                5
        );

        for (Locator bettingChip : Variables.DEFAULT_BETTING_CHIPS)
            VerificationHandler.verifyIfDisplayed(
                    "BI Test 3",
                    bettingChip,
                    5
            );

        System.out.println();
    }

    private static double getExpectedWinLoss() {
        double payout = 0.0;
        payout += getPayout(0, Condition.isTieWin(Variables.roundResult), Variables.DEFAULT_BETTING_CHIP);
        payout += getPayout(8, Condition.isTieWin(Variables.roundResult), Variables.DEFAULT_BETTING_CHIPS[0]);
        payout += getPayout(11, Condition.isPlayerPairWin(Variables.roundResult), Variables.DEFAULT_BETTING_CHIPS[1]);
        payout += getPayout(11, Condition.isBankerPairWin(Variables.roundResult), Variables.DEFAULT_BETTING_CHIPS[2]);
        payout += getPayout(0, Condition.isNaturalTie(Variables.roundResult), Variables.DEFAULT_BETTING_CHIPS[3]);
        return payout - Variables.totalBet;
    }

    private static double getPayout(int multiplier, boolean condition, Locator chip) {
        if (condition) {
            int bet = Methods.getChipValue(chip);
            return (bet * multiplier) + bet;
        }
        return 0;
    }

}
