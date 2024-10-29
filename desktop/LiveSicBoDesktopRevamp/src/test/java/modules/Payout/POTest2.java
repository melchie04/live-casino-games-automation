package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest2 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 2, payoutOdds = 1;
    private final String bettingOption = Variables.BIG;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isBigPlaced) return;
        else isBigPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getMain(bettingOption));
    }

    public void checkBettingChip() {
        if (isBigPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getMain(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (isBigPlaced && Condition.isBigWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isBigPlaced && Condition.isBigWin(roundResult)) {
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
