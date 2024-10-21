package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class WindowJumpTable {

    public TabMenu TabMenu = new TabMenu();

    public static class TabMenu {

        public Locator Baccarat = new Locator(
                "Baccarat",
                "Tab",
                "Jump Table Window",
                "//p[normalize-space()='Baccarat']/ancestor::button"
        );

        public Locator Roulette = new Locator(
                "Roulette",
                "Tab",
                "Jump Table Window",
                "//p[normalize-space()='Roulette']/ancestor::button"
        );

        public Locator SicBo = new Locator(
                "Sic Bo",
                "Tab",
                "Jump Table Window",
                "//p[normalize-space()='Sic Bo']/ancestor::button"
        );

    }

    public Locator JumpTable = new Locator(
            "Jump Table",
            "Panel",
            "Jump Table Window",
            "//div[@class='switch_table_panel']"
    );

    public Locator Close = new Locator(
            "Close",
            "Button",
            "Jump Table Window",
            "//button[@class='btn_jump_table']"
    );

    public Locator ActiveProductName = new Locator(
            "Active Product Name",
            "Label",
            "Jump Table Window",
            "//button[@class='game_icon active']//p"
    );

    public Locator InactiveProductNames = new Locator(
            "Inactive Product Names",
            "Label",
            "Jump Table Window",
            "//button[@class='game_icon']//p"
    );

    public Locator YouAreHere = new Locator(
            "You are here",
            "Label",
            "Jump Table Window",
            "//div[@class='table_card active']//p[contains(text(),'You are here')]"
    );

    public Locator TableNames = new Locator(
            "Table Names",
            "Label",
            "Jump Table Window",
            "//div[@class='title']//h3"
    );

    public Locator AllTableCards = new Locator(
            "All Table Cards",
            "Container",
            "Jump Table Window",
            "//div[contains(@class, 'table_card')]"
    );

    public Locator InactiveTableCards = new Locator(
            "Inactive Table Cards",
            "Container",
            "Jump Table Window",
            "//div[@class='table_card']"
    );

    public Locator ActiveTableName = new Locator(
            "Active Table Name",
            "Label",
            "Jump Table Window",
            "//div[@class='table_card active']//p[contains(text(),'You are here')]" +
                    "/ancestor::div[@class='table_card active']//div[@class='title']//h3"
    );

    public Locator getTableCard(String table) {
        return new Locator(
                table + " Card",
                "Container",
                "Jump Table Window",
                "//h3[normalize-space()='" + table + "']/ancestor::div[2]"
        );
    }

    public Locator getBetIndicator(String table) {
        return new Locator(
                table + " Bet Indicator",
                "Container",
                "Jump Table Window",
                "//h3[normalize-space()='" + table + "']/ancestor::div[2]//span[@class='icon']"
        );
    }

}
