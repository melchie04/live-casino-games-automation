package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.Arrays;
import java.util.List;

public class POTest14 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 14, payoutOdds = 17;
    private final int[][][] betOptionList = Arrays.copyOf(Variables.SPLIT_LIST, Variables.SPLIT_LIST.length);
    private final double[] chipValueList = new double[betOptionList.length];

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isSplitPlaced) return;
        else isSplitPlaced = true;
        for (int[][] betOption : betOptionList)
            EventHandler.click(XPath.GameTable.BettingOption.Option.getSplit(betOption));
    }

    public void checkBettingChip() {
        if (isSplitPlaced) {
            int i = 0;
            for (int[][] betOption : betOptionList)
                chipValueList[i++] = getChipValue(XPath.GameTable.BettingOption.Chip.getSplit(betOption));
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isSplitPlaced) {
            if (Condition.isPosBetLose(roundResult, betOptionList)) return;

            byte i = 0;
            for (int[][] betOption : betOptionList) {
                if (Condition.isPosBetWin(roundResult, betOption)) {
                    bet = chipValueList[i++];
                    payout += bet + (bet * payoutOdds);
                    addWin(bet, payoutOdds);
                }
            }
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isSplitPlaced) {
            if (Condition.isPosBetLose(roundResult, betOptionList)) return;
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest14 && payout.getTestCase() == testCase);
        }
    }

}
