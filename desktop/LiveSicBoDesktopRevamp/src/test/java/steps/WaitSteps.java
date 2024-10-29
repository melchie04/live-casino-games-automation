package steps;

import globals.Condition;
import globals.Methods;
import globals.Variables;
import io.cucumber.java.en.When;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;

public class WaitSteps extends Methods {

    @When("I Wait {string}")
    public void iWait(String step) {
        switch (step) {
            // Game Lobby Page
            case "Until The Table Is Betting Phase In The Game Lobby" -> {
                EventHandler.scroll(XPath.GameLobby.Content.getTable(Variables.tableName));
                WaitHandler.waitVisibility(XPath.GameLobby.Content.getShowDealing(Variables.tableName), Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameLobby.Content.getShowTimer(Variables.tableName), Variables.WAIT_PHASE_SECONDS);
            }
            case "Until The Table Is Dealing Phase In The Game Lobby" -> {
                EventHandler.scroll(XPath.GameLobby.Content.getTable(Variables.tableName));
                WaitHandler.waitVisibility(XPath.GameLobby.Content.getShowTimer(Variables.tableName), Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameLobby.Content.getShowDealing(Variables.tableName), Variables.WAIT_PHASE_SECONDS);
            }
            case "Until The Round Is Settled In The Game Lobby" -> {
                EventHandler.scroll(XPath.GameLobby.Content.getTable(Variables.tableName));
                WaitHandler.waitVisibility(XPath.GameLobby.Content.getShowTimer(Variables.tableName), Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameLobby.Content.getShowDealing(Variables.tableName), Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameLobby.Content.getShowTimer(Variables.tableName), Variables.WAIT_PHASE_SECONDS);
            }
            // Game Table Page
            case "Until The Game Is Betting Phase In The Game Table" -> {
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowTimer, Variables.WAIT_PHASE_SECONDS);
            }
            case "Until The Game Is Dealing Phase In The Game Table" -> {
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowTimer, Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
            }
            case "Until The Game Is Result Phase In The Game Table" -> {
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameTable.RoundResult.RoundResult, Variables.WAIT_PHASE_SECONDS);
            }
            case "Until The Round Is Settled In The Game Table" -> {
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowTimer, Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowTimer, Variables.WAIT_PHASE_SECONDS);
            }
            case "Until The Betting Timer Is Less Than 10 Seconds In The Game Table" -> waitBettingPhase(10, true);
            case "Until The Player Wins A Round In The Game Table" -> {
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                Variables.balanceAfterBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                while (!Condition.isBigWin(getRoundResult())) {
                    Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                    waitBettingPhase(20, false);
                    Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
                    EventHandler.click(3, Variables.MINIMUM_BETTING_CHIP);
                    EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
                    Variables.placedBet = getChipValue(Variables.DEFAULT_BETTING_CHIP);
                    EventHandler.click(XPath.GameTable.ToolBar.Confirm);
                    WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                    Variables.balanceAfterBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                }
            }
            case "Until The Player Loses A Round In The Game Table" -> {
                WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                Variables.balanceAfterBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                while (Condition.isBigWin(getRoundResult())) {
                    Variables.balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                    waitBettingPhase(20, false);
                    Variables.roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
                    EventHandler.click(3, Variables.MINIMUM_BETTING_CHIP);
                    EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
                    Variables.placedBet = getChipValue(Variables.DEFAULT_BETTING_CHIP);
                    EventHandler.click(XPath.GameTable.ToolBar.Confirm);
                    WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
                    Variables.balanceAfterBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
                }
            }
        }
    }

}
