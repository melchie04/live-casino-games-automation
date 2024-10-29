package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.Arrays;
import java.util.List;

public class POTest16 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 16, payoutOdds = 8;
    private final int[][][] betOptionList = Arrays.copyOf(Variables.CORNER_LIST, Variables.CORNER_LIST.length);
    private final double[] chipValueList = new double[betOptionList.length];

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isCornerPlaced) return;
        else isCornerPlaced = true;
        for (int[][] betOption : betOptionList)
            EventHandler.click(XPath.GameTable.BettingOption.Option.getCorner(betOption));
    }

    public void checkBettingChip() {
        if (isCornerPlaced) {
            int i = 0;
            for (int[][] betOption : betOptionList)
                chipValueList[i++] = getChipValue(XPath.GameTable.BettingOption.Chip.getCorner(betOption));
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isCornerPlaced) {
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
        if (isCornerPlaced) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest16 && payout.getTestCase() == testCase);
        }
    }

}
