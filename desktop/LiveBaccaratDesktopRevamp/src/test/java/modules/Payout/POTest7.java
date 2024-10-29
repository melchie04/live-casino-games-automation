package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;
import utilities.objects.Helper;

import java.util.List;

public class POTest7 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private int testCase;
    private double payoutOdds;
    private int[] testCaseList = new int[]{7, 8};

    public int getTestCase() {
        return 7;
    }

    public void placeBettingOption() {
        if (isNonCommission) {
            if (isPlayerPlaced || isBankerPlaced) return;
            else isBankerPlaced = true;
            testCase = 0;
            payoutOdds = 0;
            EventHandler.click(XPath.GameTable.BettingOption.Option.Banker);
        }
    }

    public void checkBettingChip() {
        if (isNonCommission && isBankerPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.Banker);
    }

    public void computeWinResult(String[] roundResult) {
        if (isNonCommission && isBankerPlaced && Condition.isBankerWin(roundResult)) {
            if (!Condition.isFortuneSixWin(roundResult)) {
                testCase = 7;
                payoutOdds = 1;
            } else {
                testCase = 8;
                payoutOdds = 0.5;
            }
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isNonCommission && isBankerPlaced) {
            if (Helper.find(testCase, testCaseList)) {
                JsonFeature.write(
                        MODULE,
                        testCase,
                        getRoundResultMap(roundResult),
                        getExpectedResultMap(),
                        getActualResultMap(),
                        getTableInfoMap(),
                        getOtherInfoMap(bet, payoutOdds, payout)
                );
                testCaseList = Helper.remove(testCase, testCaseList);
                System.out.println("    Test Case " + testCase + " of Payout is Completed.");
                System.out.println("    Test Cases of Dragon Bonus Left: " + Helper.toString(testCaseList));
            }
            if (testCaseList.length == 0) payoutTestCaseList.removeIf(payout -> payout instanceof POTest7);
        }
    }

}
