package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest9 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 9, payoutOdds = 8;

    public int getTestCase() {
        return testCase;
    }

    public void placeBettingOption() {
        if (isNonCommission) {
            if (isTiePlaced) return;
            else isTiePlaced = true;
            EventHandler.click(XPath.GameTable.BettingOption.Option.Tie);
        }
    }

    public void checkBettingChip() {
        if (isNonCommission && isTiePlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.Tie);
    }

    public void computeWinResult(String[] roundResult) {
        if (isNonCommission && isTiePlaced && Condition.isTieWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isNonCommission && isTiePlaced && Condition.isTieWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest9 && payout.getTestCase() == testCase);
        }
    }

}
