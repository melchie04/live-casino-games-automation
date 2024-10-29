package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest6 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 6, payoutOdds = 50;
    private final int[] betOptionList = new int[]{ 4, 17 };
    private final double[] chipValueList = new double[2];

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isTotal4And17Placed) return;
        else isTotal4And17Placed = true;
        for (int betOption : betOptionList) EventHandler.click(XPath.GameTable.BettingOption.Option.getThreeDiceTotal(betOption));
    }

    public void checkBettingChip() {
        if (isTotal4And17Placed) {
            byte i = 0;
            for (int betOption : betOptionList) chipValueList[i++] = getChipValue(XPath.GameTable.BettingOption.Chip.getThreeDiceTotal(betOption));
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isTotal4And17Placed && (Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) || Condition.isThreeDiceTotalWin(roundResult, betOptionList[1]))) {
            bet = Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) ? chipValueList[0] : chipValueList[1];
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isTotal4And17Placed && (Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) || Condition.isThreeDiceTotalWin(roundResult, betOptionList[1]))) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest6 && payout.getTestCase() == testCase);
        }
    }

}
