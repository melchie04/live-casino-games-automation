package locators.roulette;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class RouletteHotColdNumbers {

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

    public Locator OpenInformation = new Locator(
            "Open Information",
            "Button",
            "Game Table Page",
            "//div[@class='info']//div[@class='icon']//*[name()='svg']"
    );

    public Locator CloseInformation = new Locator(
            "Close Information",
            "Button",
            "Game Table Page",
            "//div[@class='info_modal_close']"
    );

    public Locator HotNumbersInformation = new Locator(
            "Hot Numbers Information",
            "Container",
            "Game Table Page",
            "//div[@class='info_modal_content']//div[@class='info_list'][1]"
    );

    public Locator ColdNumbersInformation = new Locator(
            "Cold Numbers Information",
            "Container",
            "Game Table Page",
            "//div[@class='info_modal_content']//div[@class='info_list'][2]"
    );

}
