package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest9 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 9, payoutOdds = 2;
    private final String bettingOption = Variables.THIRD_DOZEN;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (is3rdDozenPlaced) return;
        else is3rdDozenPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getDozen(bettingOption));
    }

    public void checkBettingChip() {
        if (is3rdDozenPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getDozen(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (is3rdDozenPlaced && Condition.is3rdDozenWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (is3rdDozenPlaced && Condition.is3rdDozenWin(roundResult)) {
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
