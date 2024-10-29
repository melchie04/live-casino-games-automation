package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class PanelNavBar {

    public Locator Back = new Locator(
            "Back",
            "Button",
            "Game Table Page",
            "//button[@class='back_btn']"
    );

    public Locator TableName = new Locator(
            "Table Name",
            "Label",
            "Game Table Page",
            "//p[@class='table_name']"
    );

    public Locator RoundID = new Locator(
            "Round ID",
            "Label",
            "Game Table Page",
            "//p[@class='game_id']"
    );

    public Locator LimitsAndPayout = new Locator(
            "Limits And Payout",
            "Button",
            "Game Table Page",
            "//button[contains(@class,'limits_payout_btn')]"
    );

    public Locator TableLimit = new Locator(
            "Table Limit",
            "Button",
            "Game Table Page",
            "//button[@class='tableLimit_btn']"
    );

    public Locator TotalBet = new Locator(
            "Total Bet",
            "Label",
            "Game Table Page",
            "//p[@class='total_bet']"
    );

    public Locator Announcement = new Locator(
            "Announcement",
            "Button",
            "Game Table Page",
            "//div[@data-gtm='Btn_ClickAnnouncement']//button"
    );

    public Locator NewAnnouncementIndicator = new Locator(
            "New Announcement Indicator",
            "Container",
            "Game Lobby Page",
            "//div[@class='newness-dot']"
    );

    public Locator FullScreen = new Locator(
            "Full Screen",
            "Button",
            "Game Table Page",
            "//div[@data-gtm='Btn_ClickFullscreen']//button"
    );

    public Locator Video = new Locator(
            "Video",
            "Button",
            "Game Table Page",
            "//div[@data-gtm='Btn_ClickVideo']//button"
    );

    public Locator Music = new Locator(
            "Music",
            "Button",
            "Game Table Page",
            "//div[@data-gtm='Btn_ClickMusic']//button"
    );

    public Locator Voice = new Locator(
            "Voice",
            "Button",
            "Game Table Page",
            "//div[@data-gtm='Btn_ClickVoice']//button"
    );

    public Locator MyBets = new Locator(
            "My Bets",
            "Button",
            "Game Table Page",
            "//div[@data-gtm='Btn_ClickMyBets']//button"
    );

    public Locator Help = new Locator(
            "Help",
            "Button",
            "Game Table Page",
            "//div[@data-gtm='Btn_ClickHelp']//button"
    );

    public Locator HideShowBalance = new Locator(
            "Hide / Show Balance",
            "Button",
            "Game Table Page",
            "//div[contains(@data-gtm,'Switch_ClickBalance')]"
    );

    public Locator Balance = new Locator(
            "Balance",
            "Label",
            "Game Table Page",
            "//div[contains(@data-gtm,'Switch_ClickBalance')]//p"
    );

    public Locator UserSetting = new Locator(
            "User Setting",
            "Button",
            "Game Table Page",
            "//div[contains(@data-gtm,'Btn_ClickProfile')]"
    );

}
