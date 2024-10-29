package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest18 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 18, payoutOdds = 8, betOption = 6;
    private final double[] chipValueList = new double[6];
    private boolean isSpecificDoubleWin = false;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isSpecificDoublePlaced) return;
        else isSpecificDoublePlaced = true;
        for (int i = 0; i < betOption; i++) EventHandler.click(XPath.GameTable.BettingOption.Option.getSpecificDouble(i + 1));
    }

    public void checkBettingChip() {
        if (isSpecificDoublePlaced)
            for (int i = 0; i < betOption; i++) chipValueList[i] = getChipValue(XPath.GameTable.BettingOption.Chip.getSpecificDouble(i + 1));
    }

    public void computeWinResult(String[] roundResult) {
        if (isSpecificDoublePlaced && Condition.isAnyDoubleWin(roundResult)) {
            for (int i = 0; i < betOption; i++) {
                if (Condition.isSpecificDoubleWin(roundResult, (i + 1))) {
                    bet = chipValueList[i];
                    payout = bet + (bet * payoutOdds);
                    addWin(bet, payoutOdds);
                    isSpecificDoubleWin = true;
                }
            }
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isSpecificDoublePlaced && isSpecificDoubleWin) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest18 && payout.getTestCase() == testCase);
        }
    }

}
