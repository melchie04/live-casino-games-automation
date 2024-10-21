package locators.pages;

import locators.components.*;
import locators.roulette.RouletteBettingOption;
import locators.roulette.RouletteGameStatistics;
import locators.roulette.RouletteHotColdNumbers;
import locators.roulette.RouletteRoundResult;
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

    public RouletteGameStatistics GameStatistics = new RouletteGameStatistics();
    public RouletteHotColdNumbers HotColdNumbers = new RouletteHotColdNumbers();
    public RouletteBettingOption BettingOption = new RouletteBettingOption();
    public RouletteRoundResult RoundResult = new RouletteRoundResult();
    public PanelLimitsAndPayout LimitsAndPayout = new PanelLimitsAndPayout();
    public ModalBetDetails BetDetails = new ModalBetDetails();
    public TableContent Content = new TableContent();
    public WindowJumpTable JumpTable = new WindowJumpTable();

    public static class PanelLimitsAndPayout extends locators.components.PanelLimitsAndPayout {

        public Locator MinimumBetLimit = new Locator(
                "Minimum Bet Limit",
                "Label",
                "Limits And Payout Panel",
                "//div[@class='tab_content content_1']//div[text()='Straight-up']/following-sibling::div"
        );

    }

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

        public Locator NumbersInResultPanel = new Locator(
                "Numbers In Result Panel",
                "Label",
                "Game Table Page",
                "(//div[contains(@class, 'roulette_line_roadmap')]//p)[position() <= 12]"
        );

    }

    public static class WindowJumpTable extends locators.components.WindowJumpTable {

        public Locator getAllCounters(String table) {
            return new Locator(
                    "All Counters in the Dealer " + table,
                    "Label",
                    "Jump Table Window",
                    "//h3[normalize-space()='" + table + "']/ancestor::div[2]//main//div[@class='line_statistics']//div//span[@class='number']"
            );
        }

    }

}
