package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest11 extends Payout implements PayoutTestCase {

    private double bet, playerBet, bankerBet, payout;
    private final int testCase = 11, payoutOdds = 11;

    public int getTestCase() {
        return testCase;
    }

    public void placeBettingOption() {
        if (isNonCommission) {
            if (isPairPlaced) return;
            else isPairPlaced = true;
            EventHandler.click(XPath.GameTable.BettingOption.Option.PlayerPair);
            EventHandler.click(XPath.GameTable.BettingOption.Option.BankerPair);
        }
    }

    public void checkBettingChip() {
        if (isNonCommission && isPairPlaced) {
            playerBet = getChipValue(XPath.GameTable.BettingOption.Chip.PlayerPair);
            bankerBet = getChipValue(XPath.GameTable.BettingOption.Chip.BankerPair);
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isNonCommission && isPairPlaced) {
            if (Condition.isPlayerPairWin(roundResult)) {
                bet = playerBet;
                payout = bet + (bet * payoutOdds);
                addWin(bet, payoutOdds);
            }
            if (Condition.isBankerPairWin(roundResult)) {
                bet = bankerBet;
                payout = bet + (bet * payoutOdds);
                addWin(bet, payoutOdds);
            }
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isNonCommission && isPairPlaced && (Condition.isPlayerPairWin(roundResult) || Condition.isBankerPairWin(roundResult))) {
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
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest11 && payout.getTestCase() == testCase);
        }
    }

}
