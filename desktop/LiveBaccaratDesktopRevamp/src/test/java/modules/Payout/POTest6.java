package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest6 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 6, payoutOdds = 1;

    public int getTestCase() {
        return testCase;
    }

    public void placeBettingOption() {
        if (isNonCommission) {
            if (isPlayerPlaced) return;
            else isPlayerPlaced = true;
            EventHandler.click(XPath.GameTable.BettingOption.Option.Player);
        }
    }

    public void checkBettingChip() {
        if (isNonCommission && isPlayerPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.Player);
    }

    public void computeWinResult(String[] roundResult) {
        if (isNonCommission && isPlayerPlaced && Condition.isPlayerWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isNonCommission && isPlayerPlaced && Condition.isPlayerWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest6 && payout.getTestCase() == testCase);
        }
    }

}
