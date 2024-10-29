package locators.pages;

import locators.components.*;
import locators.sicbo.SicBoResultHistory;
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

    public SicBoResultHistory ResultHistory = new SicBoResultHistory();
    public ModalBetDetails BetDetails = new ModalBetDetails();

    public static class ModalBetDetails extends locators.components.ModalBetDetails {

        public Locator DiceResult = new Locator(
                "Dice Result",
                "Container",
                "Bet Details Modal",
                "//div[@class='dice_result']/child::div"
        );

        public Locator TotalResult = new Locator(
                "Total Result",
                "Label",
                "Bet Details Modal",
                "//div[contains(@class,'game_result') and not(contains(@class,'wording'))]"
        );

        public Locator BigEvenResult = new Locator(
                "Big / Even Result",
                "Label",
                "Bet Details Modal",
                "//div[contains(@class,'game_result_wording')]"
        );

        public Locator BettingOption = new Locator(
                "Betting Option",
                "Container",
                "Bet Details Modal",
                "//div[contains(@class,'sic_bo_betting_options') and contains(@class,'isBetDetail')]"
        );

        public Locator WinBettingOptions = new Locator(
                "Win Betting Options",
                "Container",
                "Bet Details Modal",
                "//div[contains(@class,'sic_bo_betting_options') and contains(@class,'isBetDetail')]//div[contains(@class, 'win') and not(contains(@class, 'border'))]"
        );

        public Locator BettingChips = new Locator(
                "Betting Chips",
                "Label",
                "Bet Details Modal",
                "//div[contains(@class,'sic_bo_betting_options') and contains(@class,'isBetDetail')]//div[contains(@class,'chip myself')]"
        );

    }

}
