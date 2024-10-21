package modules.Payout;

import globals.Condition;
import globals.Variables;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest4 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int testCase = 4, payoutOdds = 1;
    private final String bettingOption = Variables.ODD;

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isOddPlaced) return;
        else isOddPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.getSide(bettingOption));
    }

    public void checkBettingChip() {
        if (isOddPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.getSide(bettingOption));
    }

    public void computeWinResult(String[] roundResult) {
        if (isOddPlaced && Condition.isOddWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isOddPlaced && Condition.isOddWin(roundResult)) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest4 && payout.getTestCase() == testCase);
        }
    }

}
