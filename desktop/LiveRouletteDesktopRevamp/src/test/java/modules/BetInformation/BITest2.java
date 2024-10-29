package modules.BetInformation;

import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class BITest2 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BET INFORMATION");
        System.out.println("Test Case: 2");
        System.out.println("Table Name: " + Variables.tableName);
        System.out.println("Round ID: " + Variables.roundID);
        System.out.println("Round Result: " + Helper.toString(Variables.roundResult));
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(XPath.GameTable.BetDetails.BetDetails, 15);

        VerificationHandler.verifyIfDisplayed(
                "BI Test 2",
                XPath.GameTable.BetDetails.Back,
                5
        );

        WaitHandler.wait(2);
        double expectedStake = Variables.totalBet;
        double actualStake = GetHandler.getDouble(XPath.GameTable.BetDetails.Stake);

        CustomAssert.assertEquals(
                "BI Test 2",
                expectedStake,
                actualStake,
                "The stake is correct: " + expectedStake + " == " + actualStake,
                "The stake is not correct: " + expectedStake + " != " + actualStake
        );

        double expectedWinLoss = -(Variables.totalBet);
        double actualWinLoss = GetHandler.getDouble(XPath.GameTable.BetDetails.WinLoss);

        CustomAssert.assertEquals(
                "BI Test 2",
                expectedWinLoss,
                actualWinLoss,
                "The win/loss is correct: " + expectedWinLoss + " == " + actualWinLoss,
                "The win/loss is not correct: " + expectedWinLoss + " != " + actualWinLoss
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 2",
                XPath.GameTable.BetDetails.RoundResult,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 2",
                XPath.GameTable.BetDetails.BettingOption,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "BI Test 2",
                Variables.DEFAULT_BETTING_CHIP,
                5
        );

        int winCount = GetHandler.getElements(XPath.GameTable.BetDetails.WinBettingOptions).size();

        CustomAssert.assertNotEquals(
                "BI Test 2",
                0,
                winCount,
                "The win betting options is correct: " + winCount,
                "The win betting options is not correct: " + winCount
        );

        System.out.println();
    }

}
