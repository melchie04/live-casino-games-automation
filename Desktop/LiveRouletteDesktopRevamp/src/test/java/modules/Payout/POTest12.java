package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest12 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 12, payoutOdds = 2, bettingOption = Variables.THIRD_COLUMN;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (is3rdColumnPlaced) return;
        else is3rdColumnPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getColumn(bettingOption));
    }

    public void checkBettingChip() {
        if (is3rdColumnPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getColumn(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (is3rdColumnPlaced && Condition.is3rdColumnWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (is3rdColumnPlaced && Condition.is3rdColumnWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest12 && payout.getTestCase() == testCase);
        }
    }

}
