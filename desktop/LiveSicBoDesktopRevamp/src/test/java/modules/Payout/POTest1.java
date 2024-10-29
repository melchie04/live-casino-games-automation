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
    private final String bettingOption = Variables.SMALL;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isSmallPlaced) return;
        else isSmallPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getMain(bettingOption));
    }

    public void checkBettingChip() {
        if (isSmallPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getMain(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (isSmallPlaced && Condition.isSmallWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isSmallPlaced && Condition.isSmallWin(roundResult)) {
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
