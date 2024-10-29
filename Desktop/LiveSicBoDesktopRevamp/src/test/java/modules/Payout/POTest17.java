package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest17 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 17, payoutOdds = 5, betOption = 6;
    private final double[][] chipValueList = new double[betOption + 1][betOption + 1];
    private boolean isTwoDiceComboWin = false;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isTwoDiceComboPlaced) return;
        else isTwoDiceComboPlaced = true;
        for (int i = 1; i <= betOption; i++) for (int j = 1; j <= betOption; j++) if (i < j) EventHandler.click(XPath.GameTable.BettingOption.Option.getTwoDiceCombo(i, j));
    }

    public void checkBettingChip() {
        if (isTwoDiceComboPlaced) {
            for (int i = 1; i <= betOption; i++) for (int j = 1; j <= betOption; j++) if (i < j) chipValueList[i][j] = getChipValue(XPath.GameTable.BettingOption.Chip.getTwoDiceCombo(i, j));
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isTwoDiceComboPlaced) {
            for (int i = 1; i <= betOption; i++) for (int j = 1; j <= betOption; j++) if (i < j) computeTwoDiceComboWinResult(roundResult, i, j);
        }
    }

    private void computeTwoDiceComboWinResult(String[] roundResult, int firstDice, int secondDice) {
        if (Condition.isTwoDiceComboWin(roundResult, firstDice, secondDice)) {
            double winBet = chipValueList[firstDice][secondDice];
            bet += winBet;
            payout += winBet + (winBet * payoutOdds);
            addWin(winBet, payoutOdds);
            isTwoDiceComboWin = true;
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isTwoDiceComboPlaced && isTwoDiceComboWin) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest17 && payout.getTestCase() == testCase);
        }
    }

}
