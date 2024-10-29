package modules.Payout;

import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;
import utilities.objects.Helper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class POTest14To16 extends Payout implements PayoutTestCase {

    private double bet, payout;
    private final int betOption = 6;
    private final double[] chipValueList = new double[6];
    private int testCase, payoutOdds;
    private int[] testCaseList = new int[]{ 14, 15, 16 };

    public int getTestCase() { return testCase; }

    public void placeBettingOption() {
        if (isSingleDicePlaced) return;
        else isSingleDicePlaced = true;
        testCase = payoutOdds = 0;
        for (int i = 0; i < betOption; i++) EventHandler.click(XPath.GameTable.BettingOption.Option.getSingleDice(i + 1));
    }

    public void checkBettingChip() {
        if (isSingleDicePlaced) for (int i = 0; i < betOption; i++) chipValueList[i] = getChipValue(XPath.GameTable.BettingOption.Chip.getSingleDice(i + 1));
    }

    public void computeWinResult(String[] roundResult) {
        if (isSingleDicePlaced) {
            computeSingleDiceWinResult(roundResult, 3, 16, 3);
            computeSingleDiceWinResult(roundResult, 2, 15, 2);
            computeSingleDiceWinResult(roundResult, 1, 14, 1);
        }
    }

    private void computeSingleDiceWinResult(String[] roundResult, int occurrences, int testCase, int payoutOdds) {
        int[] dices = getDicesByOccurrences(roundResult, occurrences);
        if (dices.length != 0) {
            this.testCase = testCase;
            this.payoutOdds = payoutOdds;
            for (int dice : dices) {
                bet = chipValueList[dice - 1];
                payout = bet + (bet * payoutOdds);
                addWin(bet, payoutOdds);
            }
        }
    }

    private static int[] getDicesByOccurrences(String[] result, int occurrences) {
        int[] intArray = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Long> numCount = Arrays.stream(intArray).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return Arrays.stream(intArray).filter(num -> numCount.get(num) == occurrences).distinct().toArray();
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isSingleDicePlaced) {
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
                System.out.println("    Test Cases of Specific Dice Left: " + Helper.toString(testCaseList));
            }
            if (testCaseList.length == 0) payoutTestCaseList.removeIf(payout -> payout instanceof POTest14To16);
        }

    }

}
