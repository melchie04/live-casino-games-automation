package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest7 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 7, payoutOdds = 2;
    private final String bettingOption = Variables.FIRST_DOZEN;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (is1stDozenPlaced) return;
        else is1stDozenPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getDozen(bettingOption));
    }

    public void checkBettingChip() {
        if (is1stDozenPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getDozen(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (is1stDozenPlaced && Condition.is1stDozenWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (is1stDozenPlaced && Condition.is1stDozenWin(roundResult)) {
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
