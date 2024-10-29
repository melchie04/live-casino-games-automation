package locators.sicbo;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class SicBoGameResults {

    public Locator Open = new Locator(
            "Open",
            "Button",
            "Game Table Page",
            "//div[@class='result_icon']"
    );

    public Locator Close = new Locator(
            "Close",
            "Button",
            "Game Table Page",
            "//div[@class='panel_toggle']"
    );

    public Locator GameResults = new Locator(
            "Game Results",
            "Panel",
            "Game Table Page",
            "//div[@class='result_box']"
    );

    public Locator TotalResult = new Locator(
            "Total Result",
            "Panel",
            "Game Table Page",
            "//div[@class='result_panel openBox']//li[1]//div[contains(@class,'result text')]"

    );


}
