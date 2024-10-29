package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest8 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 8, payoutOdds = 18;
    private final int[] betOptionList = new int[]{ 6, 15 };
    private final double[] chipValueList = new double[2];

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isTotal6And15Placed) return;
        else isTotal6And15Placed = true;
        for (int betOption : betOptionList) EventHandler.click(XPath.GameTable.BettingOption.Option.getThreeDiceTotal(betOption));
    }

    public void checkBettingChip() {
        if (isTotal6And15Placed) {
            byte i = 0;
            for (int betOption : betOptionList) chipValueList[i++] = getChipValue(XPath.GameTable.BettingOption.Chip.getThreeDiceTotal(betOption));
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isTotal6And15Placed && (Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) || Condition.isThreeDiceTotalWin(roundResult, betOptionList[1]))) {
            bet = Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) ? chipValueList[0] : chipValueList[1];
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isTotal6And15Placed && (Condition.isThreeDiceTotalWin(roundResult, betOptionList[0]) || Condition.isThreeDiceTotalWin(roundResult, betOptionList[1]))) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest8 && payout.getTestCase() == testCase);
        }
    }

}
