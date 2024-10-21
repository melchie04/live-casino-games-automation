package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class LobbySideMenu {

    public Locator AllGames = new Locator(
            "All Games Side Menu Option",
            "Button",
            "Game Lobby Page",
            "//div[contains(@class,'lobby_sidemenu_tabitem')]//div[contains(text(),'All Games')]/ancestor::div[1]"
    );

    public Locator Baccarat = new Locator(
            "Baccarat Side Menu Option",
            "Button",
            "Game Lobby Page",
            "//div[contains(@class,'lobby_sidemenu_tabitem')]//div[contains(text(),'Baccarat')]/ancestor::div[1]"
    );

    public Locator Roulette = new Locator(
            "Roulette Side Menu Option",
            "Button",
            "Game Lobby Page",
            "//div[contains(@class,'lobby_sidemenu_tabitem')]//div[contains(text(),'Roulette')]/ancestor::div[1]"
    );

    public Locator SicBo = new Locator(
            "Sic Bo Side Menu Option",
            "Button",
            "Game Lobby Page",
            "//div[contains(@class,'lobby_sidemenu_tabitem')]//div[contains(text(),'Sic Bo')]/ancestor::div[1]"
    );

    public Locator ActiveSideMenuOption = new Locator(
            "Active Side Menu Option",
            "Button",
            "Game Lobby Page",
            "//div[@class='lobby_sidemenu_tabitem selected']"
    );

    public Locator[] AllSideMenuOptions = {
            AllGames,
            Baccarat,
            Roulette,
            SicBo
    };

}
