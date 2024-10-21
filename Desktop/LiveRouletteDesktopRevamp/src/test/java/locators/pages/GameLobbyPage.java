package locators.pages;

import locators.components.*;
import locators.roulette.RouletteResultHistory;
import utilities.objects.Locator;

@SuppressWarnings("unused")
public class GameLobbyPage {

    /*!*******************************************************************************************************************
     !* DO NOT EDIT BELOW THIS COMMENT
     !* It includes all the common components of this live casino.
     !********************************************************************************************************************/

    public ModalMyBets MyBets = new ModalMyBets();
    public ModalAnnouncement Announcement = new ModalAnnouncement();
    public LobbyNavBar NavBar = new LobbyNavBar();
    public LobbySideMenu SideMenu = new LobbySideMenu();
    public LobbyHeader Header = new LobbyHeader();
    public LobbyContent Content = new LobbyContent();
    public PanelUserSetting UserSetting = new PanelUserSetting();

    /*********************************************************************************************************************
     ** EDIT BELOW THIS COMMENT
     ** It includes unique and common components with additional elements for this live casino.
     *********************************************************************************************************************/

    public RouletteResultHistory ResultHistory = new RouletteResultHistory();
    public ModalBetDetails BetDetails = new ModalBetDetails();

    public static class ModalBetDetails extends locators.components.ModalBetDetails {

        public Locator RoundResult = new Locator(
                "Round Result",
                "Label",
                "Bet Details Modal",
                "//div[contains(@class,'result_number')]"
        );

        public Locator BettingOption = new Locator(
                "Betting Option",
                "Container",
                "Bet Details Modal",
                "//div[@class='bet_detail']//div[contains(@class,'bet_options')]"
        );

        public Locator WinBettingOptions = new Locator(
                "Win Betting Options",
                "Container",
                "Bet Details Modal",
                "//div[@class='bet_detail']//div[contains(@class,'bet_options')]//div[contains(@class, 'win')]"
        );

        public Locator BettingChips = new Locator(
                "Betting Chips",
                "Label",
                "Bet Details Modal",
                "//div[@class='bet_detail']//div[contains(@class,'bet_options')]//div[contains(@class,'chip myself')]"
        );

    }

}
