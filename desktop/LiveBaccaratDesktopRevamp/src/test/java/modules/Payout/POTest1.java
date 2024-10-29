package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest1 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 1, payoutOdds = 1;

    public int getTestCase() {
        return testCase;
    }

    public void placeBettingOption() {
        if (isPlayerPlaced) return;
        else isPlayerPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.Player);
    }

    public void checkBettingChip() {
        if (isPlayerPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.Player);
    }

    public void computeWinResult(String[] roundResult) {
        if (isPlayerPlaced && Condition.isPlayerWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isPlayerPlaced && Condition.isPlayerWin(roundResult)) {
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
