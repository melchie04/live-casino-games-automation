package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest7 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 7, payoutOdds = 30;
    private final int[] betOptionList = new int[]{ 5, 16 };
    private final double[] chipValueList = new double[2];

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isTotal5And16Placed) return;
        else isTotal5And16Placed = true;
        for (int betOption : betOptionList) EventHandler.click(XPath.GameTable.BettingOption.Option.getThreeDiceTotal(betOption));
    }

    public void checkBettingChip() {
        if (isTotal5And16Placed) {
            byte i = 0;
            for (int betOption : betOptionList) chipValueList[i++] = getChipValue(XPath.GameTable.BettingOption.Chip.getThreeDiceTotal(betOption));
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isTotal5And16Placed && (Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) || Condition.isThreeDiceTotalWin(roundResult, betOptionList[1]))) {
            bet = Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) ? chipValueList[0] : chipValueList[1];
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isTotal5And16Placed && (Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) || Condition.isThreeDiceTotalWin(roundResult, betOptionList[1]))) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest7 && payout.getTestCase() == testCase);
        }
    }

}
