package locators.pages;

import locators.baccarat.BaccaratBettingOption;
import locators.baccarat.BaccaratRoundResult;
import locators.components.PanelTableLimit;
import locators.components.*;
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
    public WindowJumpTable JumpTable = new WindowJumpTable();

    /*********************************************************************************************************************
     ** EDIT BELOW THIS COMMENT
     ** It includes unique and common components with additional elements for this live casino.
     *********************************************************************************************************************/

    public BaccaratBettingOption BettingOption = new BaccaratBettingOption();
    public BaccaratRoundResult RoundResult = new BaccaratRoundResult();
    public PanelLimitsAndPayout LimitsAndPayout = new PanelLimitsAndPayout();
    public PanelCounters Counters = new PanelCounters();
    public PanelPredictions Predictions = new PanelPredictions();
    public PanelRoadMaps RoadMaps = new PanelRoadMaps();
    public ModalBetDetails BetDetails = new ModalBetDetails();
    public TableContent Content = new TableContent();

    public static class PanelLimitsAndPayout extends locators.components.PanelLimitsAndPayout {

        public Locator MinimumBetLimit = new Locator(
                "Minimum Bet Limit",
                "Label",
                "Limits And Payout Panel",
                "//div[@class='tab_content content_1']//div[text()='Player']/following-sibling::div"
        );

    }

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

    public static class PanelCounters {

        public Locator Player = new Locator(
                "Player Counter",
                "Label",
                "Game Table Page",
                "//div[@class='roadmap_stastic']//b[@class='blue circle']/ancestor::span"
        );

        public Locator Banker = new Locator(
                "Banker Counter",
                "Label",
                "Game Table Page",
                "//div[@class='roadmap_stastic']//b[@class='red circle']/ancestor::span"
        );

        public Locator Tie = new Locator(
                "Tie Counter",
                "Label",
                "Game Table Page",
                "//div[@class='roadmap_stastic']//b[@class='green circle']/ancestor::span"
        );

        public Locator PlayerPair = new Locator(
                "Player Pair Counter",
                "Label",
                "Game Table Page",
                "//div[@class='roadmap_stastic']//b[@class='blue']/ancestor::span"
        );

        public Locator BankerPair = new Locator(
                "Banker Pair Counter",
                "Label",
                "Game Table Page",
                "//div[@class='roadmap_stastic']//b[@class='red']/ancestor::span"
        );

        public Locator Total = new Locator(
                "Total Counter",
                "Label",
                "Game Table Page",
                "//div[@class='roadmap_stastic']//b[@class='gray']/ancestor::span"
        );

        public Locator[] AllCounters = {
                Player,
                Banker,
                Tie,
                PlayerPair,
                BankerPair,
                Total
        };

    }

    public static class PanelPredictions {

        public Locator Red = new Locator(
                "Red Prediction",
                "Button",
                "Game Table Page",
                "//button[@class='red']"
        );

        public Locator Blue = new Locator(
                "Blue Prediction",
                "Button",
                "Game Table Page",
                "//button[@class='blue']"
        );

    }

    public static class PanelRoadMaps {

        public Locator Bead = new Locator(
                "Bead Road Map",
                "Container",
                "Game Table Page",
                "//div[@class='roadmap_area_container_left_first']"
        );

        public Locator Big = new Locator(
                "Big Road Map",
                "Container",
                "Game Table Page",
                "//div[@class='roadmap_area_container_left_second']"
        );

        public Locator BigEye = new Locator(
                "Big Eye Road Map",
                "Container",
                "Game Table Page",
                "//div[@class='roadmap_area_container_right_first']"
        );

        public Locator Small = new Locator(
                "Small Road Map",
                "Container",
                "Game Table Page",
                "//div[@class='roadmap_area_container_right_second']"
        );

        public Locator Cockroach = new Locator(
                "Cockroach Road Map",
                "Container",
                "Game Table Page",
                "//div[@class='roadmap_area_container_right_third']"
        );

        public Locator Predictions = new Locator(
                "Prediction in All Road Maps",
                "Container",
                "Game Table Page",
                "//li[contains(@class, 'prediction')]"
        );

        public Locator[] AllRoadMaps = {
                Bead,
                Big,
                BigEye,
                Small,
                Cockroach,
        };

    }

    public static class TableContent extends locators.components.TableContent {

        public Locator Commission = new Locator(
                "Commission / Non-Commission",
                "Button",
                "Game Table Page",
                "//div[@class='btn_comm']"
        );

        public Locator CommissionToggle = new Locator(
                "Commission / Non-Commission",
                "Toggle",
                "Game Table Page",
                "//div[@class='btn_comm']//input[@type='checkbox']"
        );

        public Locator CommissionText = new Locator(
                "Commission / Non-Commission",
                "Label",
                "Game Table Page",
                "//div[@class='btn_comm']//span"
        );

        public Locator PlayerSeats = new Locator(
                "Player Seats",
                "Container",
                "Game Table Page",
                "//ul[@class='player_seats']//li"
        );

    }

}
