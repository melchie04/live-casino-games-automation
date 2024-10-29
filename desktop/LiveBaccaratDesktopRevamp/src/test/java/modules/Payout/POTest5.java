package modules.Payout;

import globals.Condition;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutTestCase;

import java.util.List;

public class POTest5 extends Payout implements PayoutTestCase {

    private double playerBet, bankerBet;
    private boolean isBet = false;

    public int getTestCase() {
        return 5;
    }

    public void placeBettingOption() {
        if (isPlayerPlaced || isBankerPlaced) return;
        else isPlayerPlaced = true;
        EventHandler.click(XPath.GameTable.BettingOption.Option.Player);
        isBet = true;
    }

    public void checkBettingChip() {
        if (isPlayerPlaced) playerBet = getChipValue(XPath.GameTable.BettingOption.Chip.Player);
        if (isBankerPlaced) bankerBet = getChipValue(XPath.GameTable.BettingOption.Chip.Banker);
    }

    public void computeWinResult(String[] roundResult) {
        if (isBet && Condition.isPlayerWin(roundResult)) addWin(playerBet, 1);
        if (Condition.isTieWin(roundResult)) {
            int payoutOdds = 0;
            if (isPlayerPlaced) addWin(playerBet, payoutOdds);
            if (isBankerPlaced) addWin(bankerBet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult, List<PayoutTestCase> payoutTestCaseList) {
        if (isCommissionComplete(payoutTestCaseList)) {
            EventHandler.click(XPath.GameTable.Content.Commission);
            isNonCommission = true;
            payoutTestCaseList.removeIf(payout -> payout instanceof POTest5);
        }
    }

    private static boolean isCommissionComplete(List<PayoutTestCase> payoutTestCaseList) {
        for (PayoutTestCase payout : payoutTestCaseList)
            if (payout.getTestCase() >= 1 && payout.getTestCase() <= 4) return false;
        return true;
    }

}
