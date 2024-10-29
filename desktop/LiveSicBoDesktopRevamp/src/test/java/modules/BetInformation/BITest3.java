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

        double expectedWinLoss = getExpectedPayout() - Variables.totalBet;
        double actualWinLoss = GetHandler.getDouble(XPath.GameTable.BetDetails.WinLoss);

        CustomAssert.assertEquals(
                "BI Test 3",
                expectedWinLoss,
                actualWinLoss,
                "The win/loss is correct: " + expectedWinLoss + " == " + actualWinLoss,
                "The win/loss is not correct: " + expectedWinLoss + " != " + actualWinLoss
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 1",
                XPath.GameTable.BetDetails.DiceResult,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 1",
                XPath.GameTable.BetDetails.TotalResult,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 1",
                XPath.GameTable.BetDetails.BigEvenResult,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 3",
                XPath.GameTable.BetDetails.BettingOption,
                5
        );

        int expectedBetSize = Variables.MULTIPLE_BETTING_CHIPS.length;
        int actualBetSize = GetHandler.getElements(XPath.GameTable.BetDetails.BettingChips).size();

        CustomAssert.assertEquals(
                "BI Test 3",
                expectedBetSize,
                actualBetSize,
                "The betting chips is correct: " + expectedBetSize + " == " + actualBetSize,
                "The betting chips is not correct: " + expectedBetSize + " != " + actualBetSize
        );

        int winCount = GetHandler.getElements(XPath.GameTable.BetDetails.WinBettingOptions).size();

        CustomAssert.assertNotEquals(
                "BI Test 3",
                0,
                winCount,
                "The win betting options is correct: " + winCount,
                "The win betting options is not correct: " + winCount
        );

        System.out.println();
    }

    private static double getExpectedPayout() {
        double expectedWinLoss = 0.0;
        expectedWinLoss += getPayout(getSingleMultiplier(), Condition.isSingleDiceWin(Variables.roundResult, 4), Variables.MULTIPLE_BETTING_CHIPS[0]);
        expectedWinLoss += getPayout(8, Condition.isSpecificDoubleWin(Variables.roundResult, 3), Variables.MULTIPLE_BETTING_CHIPS[1]);
        expectedWinLoss += getPayout(150, Condition.isSpecificTripleWin(Variables.roundResult, 2), Variables.MULTIPLE_BETTING_CHIPS[2]);
        expectedWinLoss += getPayout(12, Condition.isThreeDiceTotalWin(Variables.roundResult, 14), Variables.MULTIPLE_BETTING_CHIPS[3]);
        expectedWinLoss += getPayout(5, Condition.isTwoDiceComboWin(Variables.roundResult, 1, 2), Variables.MULTIPLE_BETTING_CHIPS[4]);
        expectedWinLoss += getPayout(1, Condition.isSmallWin(Variables.roundResult), Variables.MULTIPLE_BETTING_CHIPS[5]);
        expectedWinLoss += getPayout(1, Condition.isOddWin(Variables.roundResult), Variables.MULTIPLE_BETTING_CHIPS[6]);
        expectedWinLoss += getPayout(24, Condition.isAnyTripleWin(Variables.roundResult), Variables.MULTIPLE_BETTING_CHIPS[7]);
        return expectedWinLoss;
    }

    private static double getPayout(int multiplier, boolean condition, Locator chipValue) {
        if (condition) {
            int bet = Methods.getChipValue(chipValue);
            return bet * multiplier + bet;
        }
        return 0;
    }

    private static int getSingleMultiplier() {
        int total = 0;
        for (String number : Variables.roundResult) if (Integer.parseInt(number) == 4) ++total;
        return total;
    }

}
