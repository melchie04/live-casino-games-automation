package locators.sicbo;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class SicBoHotColdNumbers {

    public Locator Open = new Locator(
            "Open",
            "Button",
            "Game Table Page",
            "//div[@class='hotcold hotcold_btn']"
    );

    public Locator Close = new Locator(
            "Close",
            "Button",
            "Game Table Page",
            "//div[@class='hotcold_toggle']"
    );

    public Locator HotColdNumbers = new Locator(
            "Hot & Cold Numbers",
            "Panel",
            "Game Table Page",
            "//div[@class='hotcold_panel']"
    );

}