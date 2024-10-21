package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest11 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 11, payoutOdds = 2, bettingOption = Variables.SECOND_COLUMN;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (is2ndColumnPlaced) return;
        else is2ndColumnPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getColumn(bettingOption));
    }

    public void checkBettingChip() {
        if (is2ndColumnPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getColumn(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (is2ndColumnPlaced && Condition.is2ndColumnWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (is2ndColumnPlaced && Condition.is2ndColumnWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest11 && payout.getTestCase() == testCase);
        }
    }

}
