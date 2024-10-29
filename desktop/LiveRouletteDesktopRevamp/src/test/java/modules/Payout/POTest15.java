package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.Arrays;
import java.util.List;

public class POTest15 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 15, payoutOdds = 11;
    private final int[][][] betOptionList = Arrays.copyOf(Variables.STREET_LIST, Variables.STREET_LIST.length);
    private final double[] chipValueList = new double[betOptionList.length];

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isStreetPlaced) return;
        else isStreetPlaced = true;
        for (int[][] betOption : betOptionList)
            EventHandler.click(XPath.GameTable.BettingOption.Option.getStreet(betOption));
    }

    public void checkBettingChip() {
        if (isStreetPlaced) {
            int i = 0;
            for (int[][] betOption : betOptionList)
                chipValueList[i++] = getChipValue(XPath.GameTable.BettingOption.Chip.getStreet(betOption));
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isStreetPlaced) {
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
        if (isStreetPlaced) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest15 && payout.getTestCase() == testCase);
        }
    }

}
