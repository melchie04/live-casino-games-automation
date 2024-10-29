package locators.pages;

import locators.components.*;
import locators.sicbo.SicBoBettingOption;
import locators.sicbo.SicBoGameResults;
import locators.sicbo.SicBoHotColdNumbers;
import locators.sicbo.SicBoRoundResult;
import utilities.objects.Locator;

@SuppressWarnings("unused")
public class GameTablePage {

    /*!*******************************************************************************************************************
     !* DO NOT EDIT BELOW THIS COMMENT
     !* It includes all the common components of this live casino.
     !********************************************************************************************************************/

    public PanelNavBar NavBar = new PanelNavBar();
    public PanelNotification Notification = new PanelNotification();
    public PanelTableLimit TableLimit = new PanelTableLimit();
    public PanelToolBar ToolBar = new PanelToolBar();
    public PanelChipSetting ChipSetting = new PanelChipSetting();
    public PanelUserSetting UserSetting = new PanelUserSetting();
    public ModalMyBets MyBets = new ModalMyBets();
    public ModalAnnouncement Announcement = new ModalAnnouncement();
    public ModalConfirmation Confirmation = new ModalConfirmation();
    public WindowHelp Help = new WindowHelp();

    /*********************************************************************************************************************
     ** EDIT BELOW THIS COMMENT
     ** It includes unique and common components with additional elements for this live casino.
     *********************************************************************************************************************/

    public SicBoGameResults GameResults = new SicBoGameResults();
    public SicBoHotColdNumbers HotColdNumbers = new SicBoHotColdNumbers();
    public SicBoBettingOption BettingOption = new SicBoBettingOption();
    public SicBoRoundResult RoundResult = new SicBoRoundResult();
    public PanelLimitsAndPayout LimitsAndPayout = new PanelLimitsAndPayout();
    public ModalBetDetails BetDetails = new ModalBetDetails();
    public TableContent Content = new TableContent();
    public WindowJumpTable JumpTable = new WindowJumpTable();

    public static class PanelLimitsAndPayout extends locators.components.PanelLimitsAndPayout {

        public Locator MinimumBetLimit = new Locator(
                "Minimum Bet Limit",
                "Label",
                "Limits And Payout Panel",
                "//div[@class='tab_content content_1']//div[text()='Single Number']/following-sibling::div"
        );

    }

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

    public static class TableContent extends locators.components.TableContent {

        public Locator HideShowToolBar = new Locator(
                "Hide / Show Tool Bar",
                "Button",
                "Game Table Page",
                "//div[contains(@class,'toogle_chip_panel')]"
        );

        public Locator PlayerSeats = new Locator(
                "Player Seats",
                "Container",
                "Game Table Page",
                "//div[@class='user_flex']//div[contains(@class,'user')]"
        );

    }

    public static class WindowJumpTable extends locators.components.WindowJumpTable {

        public Locator getLatestResult(String table) {
            return new Locator(
                    "Latest Result in " + table + " Dealer Table",
                    "Label",
                    "Jump Table Window",
                    "//h3[normalize-space()='" + table + "']/ancestor::div[2]//li//div[contains(@class,'sicbo_line_result') and contains(@class,'active')]//div"
            );
        }

    }

}
