package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;
import utilities.objects.Helper;

import java.util.List;

public class POTest20To21 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private int testCase, payoutOdds;
    private int[] testCaseList = new int[]{20, 21};

    public int getTestCase() {
        return 20;
    }

    public void placeBettingOption() {
        if (isFortuneSixPlaced) return;
        else isFortuneSixPlaced = true;
        testCase = payoutOdds = 0;
        EventHandler.click(XPath.GameTable.BettingOption.Option.FortuneSix);
    }

    public void checkBettingChip() {
        if (isFortuneSixPlaced) bet = getChipValue(XPath.GameTable.BettingOption.Chip.FortuneSix);
    }

    public void computeWinResult(String[] roundResult) {
        if (isFortuneSixPlaced) {
            if (Condition.isFortuneSixCardsWin(roundResult, 2)) {
                testCase = 20;
                payoutOdds = 12;
                payout = bet + (bet * payoutOdds);
                addWin(bet, payoutOdds);
            }
            if (Condition.isFortuneSixCardsWin(roundResult, 3)) {
                testCase = 21;
                payoutOdds = 20;
                payout = bet + (bet * payoutOdds);
                addWin(bet, payoutOdds);
            }
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isFortuneSixPlaced) {
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
                System.out.println("    Test Cases of Fortune Six Left: " + Helper.toString(testCaseList));
            }
            if (testCaseList.length == 0) payoutTestCaseList.removeIf(payout -> payout instanceof POTest12To19);
        }
    }

}
