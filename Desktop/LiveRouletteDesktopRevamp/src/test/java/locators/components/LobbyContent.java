package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class LobbyContent {

    public Locator getTables(String product) {
        return new Locator(
                product + " Tables",
                "Container",
                "Game Lobby Page",
                "//p[not(contains(text(), 'Speed'))][contains(text(),'" + product + "')]/ancestor::div[2]/preceding-sibling::div" +
                        "//span[@class='dealer_name' and not(contains(text(), 'Maintenance'))]/ancestor::div[3]"
        );
    }

    public Locator getTable(String table) {
        return new Locator(
                table + " Table",
                "Container",
                "Game Lobby Page",
                "//p[contains(text(), '" + table + "')]/ancestor::div[3]"
        );
    }

    public Locator getTable(String product, int deals) {
        return new Locator(
                product + " Table With " + deals + " Deals",
                "Container",
                "Game Lobby Page",
                "//p[not(contains(text(), 'Speed'))][contains(text(),'" + product +
                        "')]/ancestor::div[3]//p[contains(text(), 'Deals " + deals + "')]/ancestor::div[4]"
        );
    }

    public Locator getNumberOfDeals(String table) {
        return new Locator(
                "Number Of Deals In The " + table + " Table",
                "Label",
                "Game Lobby Page",
                "//p[contains(text(),'" + table + "')]/ancestor::div[3]//p[@class='dealer-card_title_display-deals']"
        );
    }

    public Locator getTableNames(String product) {
        return new Locator(
                product + " Table Names",
                "Label",
                "Game Lobby Page",
                "//p[contains(text(),'" + product + "')]/ancestor::div[3]//p[@class='dealer-card_title_table-name']"
        );
    }

    public Locator getTableName(String product, int deals) {
        return new Locator(
                product + " Table Name With " + deals + " Deals",
                "Label",
                "Game Lobby Page",
                "//p[not(contains(text(), 'Speed'))][contains(text(),'" + product + "')]/ancestor::div[3]" +
                        "//p[contains(text(), 'Deals " + deals + "')]/ancestor::div[4]//p[contains(@class,'dealer-card_title_table-name')]"
        );
    }

    public Locator getDealerPhotos(String product) {
        return new Locator(
                product + " Dealer Photos",
                "Container",
                "Game Lobby Page",
                "//p[contains(text(),'" + product + "')]/ancestor::div[3]//div[@class='dealer-card_dealer-info_dealer']//img"
        );
    }

    public Locator getDealerNames(String product) {
        return new Locator(
                product + " Dealer Names",
                "Label",
                "Game Lobby Page",
                "//p[contains(text(),'" + product + "')]/ancestor::div[3]//span[@class='dealer_name']"
        );
    }

    public Locator getShowDealing(String productOrTable) {
        return new Locator(
                "Show Dealing Of The " + productOrTable,
                "Container",
                "Game Lobby Page",
                "//p[contains(text(),'" + productOrTable + "')]/ancestor::div[3]//div[@class='game-status--dealing']"
        );
    }

    public Locator getShowCards(String productOrTable) {
        return new Locator(
                "Show Cards Of The " + productOrTable,
                "Container",
                "Game Lobby Page",
                "//p[contains(text(),'" + productOrTable + "')]/ancestor::div[3]//div[@class='game-status_icon-animation']"
        );
    }

    public Locator getShowTimer(String productOrTable) {
        return new Locator(
                "Show Timer Of The " + productOrTable,
                "Container",
                "Game Lobby Page",
                "//p[contains(text(),'" + productOrTable + "')]/ancestor::div[3]//div[@class='game-status_text']"
        );
    }

}
