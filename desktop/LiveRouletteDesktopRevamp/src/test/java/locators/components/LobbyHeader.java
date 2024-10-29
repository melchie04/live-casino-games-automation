package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class LobbyHeader {

    public Locator getProductName(String product) {
        return new Locator(
                product + " Product",
                "Label",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='" + product + "']"
        );
    }

    public Locator getTableLimits(String product) {
        return new Locator(
                product + " Table Limits",
                "Button",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='" + product + "']/ancestor::div[1]//ul//li"
        );
    }

    public Locator getActiveTableLimit(String product) {
        return new Locator(
                product + " Active Table Limit",
                "Button",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='" + product + "']/ancestor::div[1]//ul//li[contains(@class,'active')]"
        );
    }

    public Locator getSpecificTableLimit(String product, String tableLimit) {
        return new Locator(
                tableLimit + " Table Limit",
                "Button",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='" + product + "']/ancestor::div[1]//ul//li[contains(text(),'" + tableLimit + "')]"
        );
    }

    public Locator getDateTime(String product) {
        return new Locator(
                product + " Date Time",
                "Label",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='" + product + "']/ancestor::div[1]//div[@class='header_time']"
        );
    }

}
