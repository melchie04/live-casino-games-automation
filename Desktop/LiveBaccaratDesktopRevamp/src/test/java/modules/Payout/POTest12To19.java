package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;
import utilities.objects.Helper;

import java.util.List;

public class POTest12To19 extends Payout implements PayoutTestCase {

    private double bet, playerBet, bankerBet, payout;
    private int testCase, payoutOdds;
    private int[] testCaseList = new int[]{12, 13, 14, 15, 16, 17, 18, 19};

    public int getTestCase() {
        return 12;
    }

    public void placeBettingOption() {
        if (isDragonBonusPlaced) return;
        else isDragonBonusPlaced = true;
        testCase = payoutOdds = 0;
        EventHandler.click(XPath.GameTable.BettingOption.Option.PlayerDragonBonus);
        EventHandler.click(XPath.GameTable.BettingOption.Option.BankerDragonBonus);
    }

    public void checkBettingChip() {
        if (isDragonBonusPlaced) {
            playerBet = getChipValue(XPath.GameTable.BettingOption.Chip.PlayerDragonBonus);
            bankerBet = getChipValue(XPath.GameTable.BettingOption.Chip.BankerDragonBonus);
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isDragonBonusPlaced) {
            computeNatural(roundResult);
            computeDifference(roundResult);
        }
    }

    private void computeNatural(String[] roundResult) {
        if (Condition.isPlayerDragonBonusNaturalWin(roundResult)) computeDragonBonusPayout(12, 1, playerBet);
        if (Condition.isBankerDragonBonusNaturalWin(roundResult)) computeDragonBonusPayout(12, 1, bankerBet);
        if (Condition.isNaturalTie(roundResult)) computeDragonBonusPayout(13, 0, (playerBet + bankerBet));
    }

    private void computeDifference(String[] roundResult) {
        if (Condition.isPlayerDragonBonusDifferenceWin(roundResult, 9)) computeDragonBonusPayout(14, 30, playerBet);
        if (Condition.isBankerDragonBonusDifferenceWin(roundResult, 9)) computeDragonBonusPayout(14, 30, bankerBet);
        if (Condition.isPlayerDragonBonusDifferenceWin(roundResult, 8)) computeDragonBonusPayout(15, 10, playerBet);
        if (Condition.isBankerDragonBonusDifferenceWin(roundResult, 8)) computeDragonBonusPayout(15, 10, bankerBet);
        if (Condition.isPlayerDragonBonusDifferenceWin(roundResult, 7)) computeDragonBonusPayout(16, 6, playerBet);
        if (Condition.isBankerDragonBonusDifferenceWin(roundResult, 7)) computeDragonBonusPayout(16, 6, bankerBet);
        if (Condition.isPlayerDragonBonusDifferenceWin(roundResult, 6)) computeDragonBonusPayout(17, 4, playerBet);
        if (Condition.isBankerDragonBonusDifferenceWin(roundResult, 6)) computeDragonBonusPayout(17, 4, bankerBet);
        if (Condition.isPlayerDragonBonusDifferenceWin(roundResult, 5)) computeDragonBonusPayout(18, 2, playerBet);
        if (Condition.isBankerDragonBonusDifferenceWin(roundResult, 5)) computeDragonBonusPayout(18, 2, bankerBet);
        if (Condition.isPlayerDragonBonusDifferenceWin(roundResult, 4)) computeDragonBonusPayout(19, 1, playerBet);
        if (Condition.isBankerDragonBonusDifferenceWin(roundResult, 4)) computeDragonBonusPayout(19, 1, bankerBet);
    }

    private void computeDragonBonusPayout(int testNumber, int odds, double chipValue) {
        testCase = testNumber;
        payoutOdds = odds;
        bet = chipValue;
        payout = bet + (bet * payoutOdds);
        addWin(bet, payoutOdds);
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isDragonBonusPlaced) {
            if (Helper.find(testCase, testCaseList)) {
                JsonFeature.write(
                        MODULE,
                        testCase,
                        getRoundResultMap(roundResult),
                        getExpectedResultMap(),
                        getActualResultMap(),
                        getTableInfoMap(),
                        getOtherInfoMap(bet, payoutOdds, payout)
                );
                testCaseList = Helper.remove(testCase, testCaseList);
                System.out.println("    Test Case " + testCase + " of Payout is Completed.");
                System.out.println("    Test Cases of Dragon Bonus Left: " + Helper.toString(testCaseList));
            }
            if (testCaseList.length == 0) payoutTestCaseList.removeIf(payout -> payout instanceof POTest12To19);
        }
    }

}
