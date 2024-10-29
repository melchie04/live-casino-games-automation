package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class LobbyNavBar {

    public Locator Back = new Locator(
            "Back",
            "Button",
            "Game Lobby Page",
            "//button[@data-gtm='Btn_ClickBack']"
    );

    public Locator Announcement = new Locator(
            "Announcement",
            "Button",
            "Game Lobby Page",
            "//div[@data-gtm='Btn_ClickAnnouncement']//button"
    );

    public Locator NewAnnouncementIndicator = new Locator(
            "New Announcement Indicator",
            "Container",
            "Game Lobby Page",
            "//div[@class='newness-dot']"
    );

    public Locator AnnouncementMarquee = new Locator(
            "Announcement Marquee",
            "Label",
            "Game Lobby Page",
            "//div[@class='announcement_news_ticker desktopViewStyleEnabled']"
    );

    public Locator FullScreen = new Locator(
            "Full Screen",
            "Button",
            "Game Lobby Page",
            "//div[contains(@data-gtm,'Btn_ClickFullScreen')]//button"
    );

    public Locator MyBets = new Locator(
            "My Bets",
            "Button",
            "Game Lobby Page",
            "//div[@data-gtm='Btn_ClickMyBet']//button"
    );

    public Locator Help = new Locator(
            "Help",
            "Button",
            "Game Lobby Page",
            "//div[@data-gtm='Btn_ClickTnC']//button"
    );

    public Locator HideShowBalance = new Locator(
            "Hide / Show Balance",
            "Button",
            "Game Lobby Page",
            "//div[contains(@data-gtm,'Switch_ClickBalance')]"
    );

    public Locator Balance = new Locator(
            "Balance",
            "Label",
            "Game Lobby Page",
            "//div[contains(@data-gtm,'Switch_ClickBalance')]//p"
    );

    public Locator UserSetting = new Locator(
            "User Setting",
            "Button",
            "Game Lobby Page",
            "//div[contains(@data-gtm,'Btn_ClickProfile')]"
    );

}
