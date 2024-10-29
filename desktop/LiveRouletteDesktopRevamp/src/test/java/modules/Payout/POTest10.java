package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest10 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 10, payoutOdds = 2, bettingOption = Variables.FIRST_COLUMN;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (is1stColumnPlaced) return;
        else is1stColumnPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getColumn(bettingOption));
    }

    public void checkBettingChip() {
        if (is1stColumnPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getColumn(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (is1stColumnPlaced && Condition.is1stColumnWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (is1stColumnPlaced && Condition.is1stColumnWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest10 && payout.getTestCase() == testCase);
        }
    }

}
