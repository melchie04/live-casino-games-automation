package steps;

import globals.Methods;
import globals.Variables;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import locators.XPath;
import modules.Payout.Payout;
import utilities.features.JsonFeature;
import utilities.features.ScreenshotFeature;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Helper;
import utilities.objects.Printer;

public class PayoutSteps {

    @Then("I Place A Bet Until There Is {int} Round Result For All Payouts")
    public void iPlaceABetUntilThereIsRoundResultForAllPayouts(int totalRounds, DataTable dataTable) {
        JsonFeature.clean(Payout.MODULE);
        Payout.init(dataTable.asList(String.class));
        waitUntilWins(totalRounds);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static void waitUntilWins(int totalRounds) {
        Methods.waitBettingPhase(45, true);
        for (int round = 1; round <= totalRounds; round++) {
            try {

                System.out.println();
                System.out.println("Round #" + round);
                System.out.println();

                setBeforeBetting();
                setBettingOption();
                setAfterBetting();
                setDealingResult();

                if (Payout.isCompleted()) {
                    System.out.println();
                    System.out.println("Total Rounds To Complete: " + round);
                    System.out.println();
                    break;
                }

            } catch (Exception e) {
                Printer.printError("Failed on round #" + round + " due to the following cause: " + e.getMessage());
                ScreenshotFeature.capture("errors", "Round " + round);
            }
        }
    }

    private static void setBeforeBetting() {
        Payout.setBeforeBetting();
    }

    private static void setBettingOption() {
        Methods.waitBettingPhase(20, false);
        WaitHandler.wait(3);
        Payout.setBettingOption();
    }

    private static void setAfterBetting() {
        Payout.setAfterBetting();
    }

    private static void setDealingResult() {
        WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
        String[] roundResult = Methods.getRoundResult();
        System.out.println("    Round Result: " + Helper.toString(roundResult));
        WaitHandler.waitVisibility(XPath.GameTable.Notification.PlaceYourBetsPlease, Variables.WAIT_PHASE_SECONDS);
        Payout.setDealingResult(roundResult);
    }

}
