package steps;

import globals.Condition;
import globals.Methods;
import globals.Variables;
import io.cucumber.java.en.When;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Locator;
import utilities.objects.Printer;

public class BetSteps extends Methods {

    @When("I Bet {string}")
    public void iBet(String step) {
        switch (step) {
            case "In Any Betting Option Until Win" -> betInAnyBettingOptionUntilWin();
            case "In Any Betting Option Until Lose" -> betInAnyBettingOptionUntilLose();
            case "In Multiple Betting Options Until Round Complete" -> betInMultipleBettingOptionsUntilRoundComplete();
            case "In Any Betting Option" -> betInAnyBettingOption();
            case "In The Betting Option Again" -> EventHandler.click(2, Variables.DEFAULT_BETTING_OPTION);
            case "In The Betting Option Until Reaching The Minimum Bet Limit" -> {
                for (int i = 0; i < 9; i++) {
                    EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
                }
            }
            case "In The Betting Option Until Reaching The Maximum Bet Limit" -> betInTheBettingOptionUntilReachingTheMaximumBetLimit();
            case "Each Chip In The Default Chips In Any Betting Option",
                 "In Each Betting Option" -> Printer.printInfo("Bet Step Is Included In The Next Step.");
            case "Four Or More In Any Betting Options" -> betFourOrMoreInAnyBettingOptions();
            case "Lower Than Minimum Bet Limit In Any Betting Option" -> betLowerThanMinimumBetLimitInAnyBettingOption();
        }
    }

    private static void betInAnyBettingOptionUntilWin() {
        boolean isError = true;
        do {
            try {
                Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                waitBettingPhase(20, false);
                EventHandler.click(3, Variables.MINIMUM_BETTING_CHIP);
                EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
                EventHandler.click(XPath.GameTable.ToolBar.Confirm);
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                Variables.totalBet = GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet);
                Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
                Variables.roundResult = getRoundResult();
                isError = false;
            } catch (Exception e) { Printer.printError("Failed To Bet In " + Variables.DEFAULT_BETTING_OPTION.getName()); }
        } while (isError || !Condition.isRedWin(Variables.roundResult));
        WaitHandler.wait(5);
    }

    private static void betInAnyBettingOptionUntilLose() {
        boolean isError = true;
        do {
            try {
                Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                waitBettingPhase(20, false);
                EventHandler.click(3, Variables.MINIMUM_BETTING_CHIP);
                EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
                EventHandler.click(XPath.GameTable.ToolBar.Confirm);
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                Variables.totalBet = GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet);
                Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
                Variables.roundResult = getRoundResult();
                isError = false;
            } catch (Exception e) { Printer.printError("Failed To Bet In " + Variables.DEFAULT_BETTING_OPTION.getName()); }
        } while (isError || Condition.isRedWin(Variables.roundResult));
        WaitHandler.wait(5);
    }

    private static void betInMultipleBettingOptionsUntilRoundComplete() {
        boolean isError = true;
        do {
            try {
                Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                waitBettingPhase(20, false);
                EventHandler.click(3, Variables.MINIMUM_BETTING_CHIP);
                for (Locator bettingOption : Variables.MULTIPLE_BETTING_OPTIONS)
                    EventHandler.click(bettingOption);
                EventHandler.click(XPath.GameTable.ToolBar.Confirm);
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                Variables.totalBet = GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet);
                Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
                Variables.roundResult = getRoundResult();
                isError = false;
            } catch (Exception e) { Printer.printError("Failed To Bet In Multiple Betting Options"); }
        } while (isError);
        WaitHandler.wait(5);
    }

    private static void betInAnyBettingOption() {
        Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
        waitBettingPhase(20, false);
        Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
        EventHandler.click(3, Variables.MINIMUM_BETTING_CHIP);
        EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
        Variables.placedBet = getChipValue(Variables.DEFAULT_BETTING_CHIP);
    }

    private static void betFourOrMoreInAnyBettingOptions() {
        Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
        waitBettingPhase(20, false);
        Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
        EventHandler.click(3, Variables.DEFAULT_BETTING_OPTION);
        for (Locator bettingOption : Variables.DEFAULT_BETTING_OPTIONS)
            EventHandler.click(bettingOption);
    }

    private static void betLowerThanMinimumBetLimitInAnyBettingOption() {
        Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
        waitBettingPhase(20, false);
        Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
        EventHandler.click(3, XPath.GameTable.ToolBar.getChip("1"));
        EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
        Variables.placedBet = getChipValue(Variables.DEFAULT_BETTING_CHIP);
    }

    private static void betInTheBettingOptionUntilReachingTheMaximumBetLimit() {
        Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
        waitBettingPhase(20, false);
        Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
        EventHandler.click(3, Variables.MINIMUM_BETTING_CHIP);
        EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
        for (int i = 0; i < 8; i++) EventHandler.click(XPath.GameTable.ToolBar.Double);
        Variables.placedBet = getChipValue(Variables.DEFAULT_BETTING_CHIP);
    }

}
