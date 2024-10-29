package locators.roulette;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class RouletteGameStatistics {

    public Locator Open = new Locator(
            "Open",
            "Button",
            "Game Table Page",
            "//div[@class='advanced_icon']"
    );

    public Locator Close = new Locator(
            "Close",
            "Button",
            "Game Table Page",
            "//div[@class='advanced_toggle']"
    );

    public Locator GameStatistics = new Locator(
            "Game Statistics",
            "Panel",
            "Game Table Page",
            "//div[contains(@class,'advanced_panel')]"
    );

}
