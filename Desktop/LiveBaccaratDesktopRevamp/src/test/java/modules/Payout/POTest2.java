package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest2 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 2;
    private final double payoutOdds = 0.95;

    public int getTestCase() {
        return testCase;
    }

    public void placeBettingOption() {
        if (isPlayerPlaced || isBankerPlaced) return;
        else isBankerPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.Banker);
    }

    public void checkBettingChip() {
        if (isBankerPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.Banker);
    }

    public void computeWinResult(String[] roundResult) {
        if (isBankerPlaced && Condition.isBankerWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isBankerPlaced && Condition.isBankerWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest2 && payout.getTestCase() == testCase);
        }
    }

}
