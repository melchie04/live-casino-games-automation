package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest13 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 13, payoutOdds = 35, bettingOption = 37;
    private final double[] chipValueList = new double[bettingOption];

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isStraightUpPlaced) return;
        else isStraightUpPlaced = true;
        for (int i = 0; i < bettingOption; i++)
            EventHandler.click(XPath.GameTable.BettingOption.Option.getStraightUp(i));
    }

    public void checkBettingChip() {
        if (isStraightUpPlaced)
            for (int i = 0; i < bettingOption; i++)
                chipValueList[i] = getChipValue(XPath.GameTable.BettingOption.Chip.getStraightUp(i));
    }

    public void computeWinResult(String[] roundResult) {
        if (isStraightUpPlaced) {
            for (int i = 0; i < bettingOption; i++) {
                if (Condition.isStraightUpWin(roundResult, i)) {
                    bet = chipValueList[i];
                    payout = bet + (bet * payoutOdds);
                    addWin(bet, payoutOdds);
                }
            }
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isStraightUpPlaced) {
            JsonFeature.write(
                    MODULE,
                    testCase,
                    getRoundResultMap(roundResult),
                    getExpectedResultMap(),
                    getActualResultMap(),
                    getTableInfoMap(),
                    getOtherInfoMap(bet, payoutOdds, payout)
            );
            System.out.println("    Test Case " + testCase + " of Payout is Completed.");
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest13 && payout.getTestCase() == testCase);
        }
    }

}
