package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest1 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 1, payoutOdds = 1;
    private final String bettingOption = Variables.RED;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isRedPlaced) return;
        else isRedPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getSide(bettingOption));
    }

    public void checkBettingChip() {
        if (isRedPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getSide(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (isRedPlaced && Condition.isRedWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isRedPlaced && Condition.isRedWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest1 && payout.getTestCase() == testCase);
        }
    }

}
