package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class PanelLimitsAndPayout {

    public TabMenu TabMenu = new TabMenu();

    public static class TabMenu {

        public Locator BetLimit = new Locator(
                "Bet Limit",
                "Tab",
                "Limits And Payout Panel",
                "//div[@data-gtm='Btn_ClickLimit']"
        );

        public Locator Payout = new Locator(
                "Payout",
                "Tab",
                "Limits And Payout Panel",
                "//div[@data-gtm='Btn_ClickPayout']"
        );

    }

    public Locator LimitsAndPayout = new Locator(
            "Limits And Payout",
            "Panel",
            "Limits And Payout Panel",
            "//div[contains(@class,'paytable_panel')]"
    );

    public Locator BetLimit = new Locator(
            "Bet Limit",
            "Container",
            "Limits And Payout Panel",
            "//div[@class='tab_content content_1']//div[@class='row_item']"
    );

    public Locator Payout = new Locator(
            "Payout",
            "Container",
            "Limits And Payout Panel",
            "//div[@class='tab_content content_2']//div[@class='row_item']"
    );

}
