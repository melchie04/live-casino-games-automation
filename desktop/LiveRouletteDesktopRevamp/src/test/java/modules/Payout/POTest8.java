package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest8 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 8, payoutOdds = 2;
    private final String bettingOption = Variables.SECOND_DOZEN;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (is2ndDozenPlaced) return;
        else is2ndDozenPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getDozen(bettingOption));
    }

    public void checkBettingChip() {
        if (is2ndDozenPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getDozen(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (is2ndDozenPlaced && Condition.is2ndDozenWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (is2ndDozenPlaced && Condition.is2ndDozenWin(roundResult)) {
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
