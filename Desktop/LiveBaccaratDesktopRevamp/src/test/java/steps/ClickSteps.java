package steps;

import globals.Variables;
import io.cucumber.java.en.When;
import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.Helper;
import utilities.objects.Printer;

public class ClickSteps {

    @When("I Click {string}")
    public void iClick(String step) {
        switch (step) {
            case "The Outside Of The Modal",
                 "The Outside Of The Window" -> EventHandler.click(100, 100);
            // ? Side Menu of the Game Lobby Page
            case "The Other Live Game Tab Within The Side Menu In The Game Lobby" -> EventHandler.click(XPath.GameLobby.SideMenu.Roulette);
            case "The All Games Tab Of The Side Menu In The Game Lobby" -> EventHandler.click(XPath.GameLobby.SideMenu.AllGames);
            // ? Navigation Bar of the Game Lobby Page
            case "The Back Button In The Game Lobby" -> EventHandler.click(XPath.GameLobby.NavBar.Back);
            case "The Announcement Button In The Game Lobby" -> EventHandler.click(1, XPath.GameLobby.NavBar.Announcement);
            case "The Full Screen Button In The Game Lobby" -> EventHandler.click(XPath.GameLobby.NavBar.FullScreen);
            case "The My Bets Button In The Game Lobby" -> EventHandler.click(XPath.GameLobby.NavBar.MyBets);
            case "The Help Button In The Game Lobby" -> EventHandler.click(XPath.GameLobby.NavBar.Help);
            case "The Balance Button In The Game Lobby" -> EventHandler.click(XPath.GameLobby.NavBar.HideShowBalance);
            case "The User Setting Button In The Game Lobby" -> EventHandler.click(XPath.GameLobby.NavBar.UserSetting);
            // ? Announcement Modal of the Game Lobby Page
            case "The Close Button Within The Announcement Modal In The Game Lobby" -> EventHandler.click(XPath.GameLobby.Announcement.Close);
            case "The Mark All As Read Button Within The Announcement Modal In The Game Lobby" -> {
                if (Variables.hasNewAnnouncement) EventHandler.click(XPath.GameLobby.Announcement.MarkAllAsRead);
            }
            // ? My Bets Modal of the Game Lobby Page
            case "The Close Button Within The My Bets Modal In The Game Lobby" -> EventHandler.click(XPath.GameLobby.MyBets.Close);
            case "The Running Tab Within The My Bets Modal In The Game Lobby" -> EventHandler.click(XPath.GameLobby.MyBets.TabMenu.Running, 1);
            case "The Settled Tab Within The My Bets Modal In The Game Lobby" -> EventHandler.click(XPath.GameLobby.MyBets.TabMenu.Settled, 1);
            case "The Details Button Within The My Bets Modal In The Game Lobby" -> {
                if (Variables.hasSettledRounds) EventHandler.click(GetHandler.getElementByRandom(XPath.GameLobby.MyBets.Settled.getDetails("#")));
            }
            // ? Bet Details Modal of the Game Lobby Page
            case "The Back Button Within The Bet Details Modal In The Game Lobby" -> EventHandler.click(XPath.GameLobby.BetDetails.Back);
            // ? User Setting Panel of the Game Lobby Page
            case "The Dark Theme Button Within The User Setting Panel In The Game Lobby" -> EventHandler.click(XPath.GameLobby.UserSetting.DarkMode);
            case "The Light Theme Button Within The User Setting Panel In The Game Lobby" -> EventHandler.click(XPath.GameLobby.UserSetting.LightMode);
            // ? Header of the Game Lobby Page
            case "Any Table Limit Button In The Game Lobby" -> EventHandler.click(XPath.GameLobby.Header.getSpecificTableLimit(Variables.productName, Variables.TABLE_LIMIT));
            case "Each Table Limit Button In The Game Lobby" -> Printer.printInfo("Click Step Is Included In The Next Step.");
            // ? Navigation Bar of the Game Table Page
            case "The Back Button In The Game Table" -> EventHandler.click(2, XPath.GameTable.NavBar.Back);
            case "The Limits & Payouts Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.LimitsAndPayout);
            case "The Table Limit Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.TableLimit);
            case "The Announcement Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.Announcement);
            case "The Full Screen Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.FullScreen);
            case "The My Bets Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.MyBets);
            case "The Help Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.Help);
            case "The Balance Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.HideShowBalance);
            case "The User Setting Button In The Game Table" -> EventHandler.click(1, XPath.GameTable.NavBar.UserSetting);
            // ? Limits And Payout Panel of the Game Table Page
            case "The Payout Tab Within The Limits & Payouts Panel In The Game Table" -> EventHandler.click(XPath.GameTable.LimitsAndPayout.TabMenu.Payout);
            case "The Bet Limit Tab Within The Limits & Payouts Panel In The Game Table" -> EventHandler.click(XPath.GameTable.LimitsAndPayout.TabMenu.BetLimit);
            // ? Table Limit Panel of the Game Table Page
            case "The Other Table Limit Within The Table Limit Panel In The Game Table" -> EventHandler.click(XPath.GameTable.TableLimit.getTableLimit(Variables.TABLE_LIMIT.replace(" ", "")), 2);
            // ? Announcement Modal of the Game Lobby Page
            case "The Close Button Within The Announcement Modal In The Game Table" -> EventHandler.click(XPath.GameTable.Announcement.Close);
            case "The Mark All As Read Button Within The Announcement Modal In The Game Table" -> {
                if (Variables.hasNewAnnouncement) EventHandler.click(XPath.GameTable.Announcement.MarkAllAsRead);
            }
            // ? My Bets Modal of the Game Table Page
            case "The Close Button Within The My Bets Modal In The Game Table" -> EventHandler.click(XPath.GameTable.MyBets.Close);
            case "The Running Tab Within The My Bets Modal In The Game Table" -> EventHandler.click(XPath.GameTable.MyBets.TabMenu.Running, 1);
            case "The Settled Tab Within The My Bets Modal In The Game Table" -> EventHandler.click(XPath.GameTable.MyBets.TabMenu.Settled, 1);
            case "The Details Button Within The My Bets Modal In The Game Table" -> EventHandler.click(XPath.GameTable.MyBets.Settled.getDetails(Variables.roundID), HandleCollection.WithScroll);
            // ? Bet Details Modal of the Game Lobby Page
            case "The Back Button Within The Bet Details Modal In The Game Table" -> EventHandler.click(XPath.GameTable.BetDetails.Back);
            // ? Help Window of the Game Table Page
            case "Each Category Within The Help Window In The Game Table" -> Printer.printInfo("Click Step Is Included In Next Step");
            case "The Back Button Within The Help Window In The Game Table" -> EventHandler.click(XPath.GameTable.Help.Back);
            // ? User Setting Panel of the Game Table Page
            case "The Dark Theme Button Within The User Setting Panel In The Game Table" -> EventHandler.click(XPath.GameTable.UserSetting.DarkMode);
            case "The Light Theme Button Within The User Setting Panel In The Game Table" -> EventHandler.click(XPath.GameTable.UserSetting.LightMode);
            // ? Game Screen of the Game Table Page
            case "The Jump Table Button In The Game Table" -> EventHandler.click(XPath.GameTable.Content.JumpTable);
            case "The Commission / Non-Commission Button In The Game Table" -> EventHandler.click(XPath.GameTable.Content.Commission);
            case "The Player Prediction Button In The Game Table" -> EventHandler.click(XPath.GameTable.Predictions.Blue);
            case "The Banker Prediction Button In The Game Table" -> EventHandler.click(XPath.GameTable.Predictions.Red);
            // ? Jump Table Window of the Game Table Page
            case "The Close Button Within The Jump Table Window In The Game Table" -> EventHandler.click(XPath.GameTable.JumpTable.Close);
            case "The Other Table Within The Jump Table Window In The Game Table" -> EventHandler.click(XPath.GameTable.JumpTable.getTableCard("Table " + Helper.getLastChar(Variables.tableName)), HandleCollection.WithScroll);
            case "The Other Product Within The Jump Table Window In The Game Table" -> EventHandler.click(XPath.GameTable.JumpTable.TabMenu.Roulette, 1);
            case "The Other Product Table Within The Jump Table Window In The Game Table" -> EventHandler.click(XPath.GameTable.JumpTable.getTableCard("Table " + Helper.getLastChar(Variables.tableName)), HandleCollection.WithScroll);
            // ? Tool Bar of the Game Table Page
            case "The Edit Chips Button In The Game Table" -> EventHandler.click(3, XPath.GameTable.ToolBar.EditChips);
            case "The Undo Button In The Game Table" -> EventHandler.click(XPath.GameTable.ToolBar.Undo);
            case "The Cancel Button In The Game Table" -> EventHandler.click(XPath.GameTable.ToolBar.Cancel);
            case "The Double Button In The Game Table" -> EventHandler.click(XPath.GameTable.ToolBar.Double);
            case "The Double Button In The Game Table Until Reaching The Maximum Bet Limit" -> {
                for (int i = 0; i < 7; i++) EventHandler.click(XPath.GameTable.ToolBar.Double);
            }
            case "The Confirm Button In The Game Table",
                 "The Top Up Confirm Button In The Game Table" -> EventHandler.click(XPath.GameTable.ToolBar.Confirm);
            case "The ReBet Button In The Game Table" -> EventHandler.click(3, XPath.GameTable.ToolBar.ReBet);
            // ? Chip Settings Panel of the Game Table Page
            case "The Close Button Within The Chip Settings Panel In The Game Table" -> EventHandler.click(XPath.GameTable.ChipSetting.Close);
            case "The Next Arrow Button Within The Chip Settings Panel In The Game Table" -> EventHandler.click(XPath.GameTable.ChipSetting.NextArrow);
            case "The Previous Arrow Button Within The Chip Settings Panel In The Game Table" -> EventHandler.click(XPath.GameTable.ChipSetting.PreviousArrow);
            case "The Remove Chip Button Within The Chip Settings Panel In The Game Table" -> EventHandler.click(1, XPath.GameTable.ChipSetting.getMyChip(Variables.REMOVED_CHIP));
            case "The Add Chip Button Within The Chip Settings Panel In The Game Table" -> EventHandler.click(1, XPath.GameTable.ChipSetting.getChipSelection(Variables.ADDED_CHIP));
            case "The Save Button Within The Chip Settings Panel In The Game Table" -> EventHandler.click(XPath.GameTable.ChipSetting.Save);
            // ? Confirmation Modal of the Game Table Page
            case "The Confirm Button Within The Confirmation Modal In The Game Table" -> EventHandler.click(XPath.GameTable.Confirmation.Confirm);
            case "The Not Now Button Within The Confirmation Modal In The Game Table" -> EventHandler.click(XPath.GameTable.Confirmation.NotNow);
        }

    }

}
