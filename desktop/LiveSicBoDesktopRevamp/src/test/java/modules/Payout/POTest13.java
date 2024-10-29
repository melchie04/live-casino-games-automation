package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest13 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 13, payoutOdds = 150, betOption = 6;
    private final double[] chipValueList = new double[6];
    private boolean isSpecificTripleWin = false;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isSpecificTriplePLaced) return;
        else isSpecificTriplePLaced = true;
        for (int i = 0; i < betOption; i++) EventHandler.click(XPath.GameTable.BettingOption.Option.getSpecificTriple(i + 1));
    }

    public void checkBettingChip() {
        if (isSpecificTriplePLaced) for (int i = 0; i < betOption; i++) chipValueList[i] = getChipValue(XPath.GameTable.BettingOption.Chip.getSpecificTriple(i + 1));
    }

    public void computeWinResult(String[] roundResult) {
        if (isSpecificTriplePLaced && Condition.isAnyTripleWin(roundResult)) {
            for (int i = 0; i < betOption; i++) {
                if (Condition.isSpecificTripleWin(roundResult, (i + 1))) {
                    bet = chipValueList[i];
                    payout = bet + (bet * payoutOdds);
                    addWin(bet, payoutOdds);
                    isSpecificTripleWin = true;
                }
            }
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isSpecificTriplePLaced && isSpecificTripleWin) {
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
