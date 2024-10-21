package locators.pages;

import locators.baccarat.BaccaratRoadMaps;
import locators.components.*;
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

    public BaccaratRoadMaps RoadMaps = new BaccaratRoadMaps();
    public ModalBetDetails BetDetails = new ModalBetDetails();

    public static class ModalBetDetails extends locators.components.ModalBetDetails {

        public Locator PlayerCards = new Locator(
                "Player Cards",
                "Container",
                "Bet Details Modal",
                "//div[contains(@class, 'player')]//div[contains(@class, 'front')]"
        );

        public Locator BankerCards = new Locator(
                "Banker Cards",
                "Container",
                "Bet Details Modal",
                "//div[contains(@class, 'banker')]//div[contains(@class, 'front')]"
        );

        public Locator PlayerTotalPoints = new Locator(
                "Player Total Points",
                "Label",
                "Bet Details Modal",
                "//div[contains(@class, 'player')]//div[@class='total_points']//p"
        );

        public Locator BankerTotalPoints = new Locator(
                "Banker Total Points",
                "Label",
                "Bet Details Modal",
                "//div[contains(@class, 'banker')]//div[@class='total_points']//p"
        );

        public Locator PlayerWon = new Locator(
                "Player Won",
                "Container",
                "Bet Details Modal",
                "//div[@class='result player']"
        );

        public Locator TieWon = new Locator(
                "Tie Won",
                "Container",
                "Bet Details Modal",
                "//div[@class='result tie']"
        );

        public Locator BettingOption = new Locator(
                "Betting Option",
                "Container",
                "Bet Details Modal",
                "//div[@class='bet_options betting_area_baccarat']"
        );

        public Locator WinBettingOptions = new Locator(
                "Win Betting Options",
                "Container",
                "Bet Details Modal",
                "//div[@class='bet_options betting_area_baccarat']//li[contains(@class, 'win')]"
        );

        public Locator BettingChips = new Locator(
                "Betting Chips",
                "Label",
                "Bet Details Modal",
                "//div[@class='bet_options betting_area_baccarat']//div[@class='chip_text']"
        );

    }

}
