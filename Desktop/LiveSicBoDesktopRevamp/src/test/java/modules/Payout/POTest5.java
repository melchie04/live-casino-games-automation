package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest5 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 5, payoutOdds = 24;
    private final String bettingOption = Variables.ANY_TRIPLE;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isAnyTriplePlaced) return;
        else isAnyTriplePlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getMain(bettingOption));
    }

    public void checkBettingChip() {
        if (isAnyTriplePlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getMain(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (isAnyTriplePlaced && Condition.isAnyTripleWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isAnyTriplePlaced && Condition.isAnyTripleWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest5 && payout.getTestCase() == testCase);
        }
    }

}
