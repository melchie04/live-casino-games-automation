package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest10 extends Payout implements PayoutTestCase {

    private double playerBet, bankerBet;
    private boolean isBet = false;

    public int getTestCase() {
        return 10;
    }

    public void placeBettingOption() {
        if (isNonCommission) {
            if (isPlayerPlaced || isBankerPlaced) return;
            else isPlayerPlaced = true;
            EventHandler.click(XPath.GameTable.BettingOption.Option.Player);
            isBet = true;
        }
    }

    public void checkBettingChip() {
        if (isNonCommission) {
            if (isPlayerPlaced) playerBet = getChipValue(XPath.GameTable.BettingOption.Chip.Player);
            if (isBankerPlaced) bankerBet = getChipValue(XPath.GameTable.BettingOption.Chip.Banker);
        }
    }

    public void computeWinResult(String[] roundResult) {
        if (isNonCommission) {
            if (isBet && Condition.isPlayerWin(roundResult)) addWin(playerBet, 1);
            if (Condition.isTieWin(roundResult)) {
                int payoutOdds = 0;
                if (isPlayerPlaced) addWin(playerBet, payoutOdds);
                if (isBankerPlaced) addWin(bankerBet, payoutOdds);
            }
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isNonCommission && isNonCommissionComplete(payoutTestCaseList)) {
            EventHandler.click(XPath.GameTable.Content.Commission);
            isNonCommission = false;
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest10);
        }
    }

    private static boolean isNonCommissionComplete(List<PayoutTestCase> payoutTestCaseList) {
        for (PayoutTestCase payout : payoutTestCaseList)
            if (payout.getTestCase() >= 6 && payout.getTestCase() <= 11) return false;
        return true;
    }

}
