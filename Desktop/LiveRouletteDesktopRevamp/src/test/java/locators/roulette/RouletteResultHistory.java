package locators.roulette;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class RouletteResultHistory {

    public Locator ResultHistoryTheme = new Locator(
            "Result History Theme",
            "Container",
            "Game Lobby Page",
            "//div[contains(@class,'lobby_layout')]"
    );

    public Locator ResultHistory = new Locator(
            "Result History",
            "Panel",
            "Game Lobby Page",
            "//p[contains(text(), 'Roulette')]/ancestor::div[3]//div[@class='roadmap_display']"
    );

    public Locator RedCounters = new Locator(
            "Red Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class, 'dealer-card')]//div[@class='line_statistics dealer-card_footer-roulette']//div[1]//span[@class='number']"
    );

    public Locator BlackCounters = new Locator(
            "Black Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class, 'dealer-card')]//div[@class='line_statistics dealer-card_footer-roulette']//div[2]//span[@class='number']"
    );

    public Locator ZeroCounters = new Locator(
            "Zero Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class, 'dealer-card')]//div[@class='line_statistics dealer-card_footer-roulette']//div[3]//span[@class='number']"
    );

    public Locator TotalCounters = new Locator(
            "Total Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class, 'dealer-card')]//div[@class='line_statistics dealer-card_footer-roulette']//div[4]//span[@class='number']"
    );

    public Locator[] AllCounters = {
            RedCounters,
            BlackCounters,
            ZeroCounters,
            TotalCounters
    };

    public Locator getAllCounters(String dealsOrTable) {
        return new Locator(
                "All Counters in " + dealsOrTable + " Dealer Table",
                "Label",
                "Game Lobby Page",
                "//p[contains(text(), '" + dealsOrTable + "')]/ancestor::div[3]" +
                        "//div[contains(@class, 'dealer-card')]//div[@class='line_statistics dealer-card_footer-roulette']//div//span[@class='number']"
        );
    }

    public Locator getTotalCounter(String dealsOrTable) {
        return new Locator(
                "Total Counter in " + dealsOrTable + " Dealer Table",
                "Label",
                "Game Lobby Page",
                "//p[contains(text(), '" + dealsOrTable + "')]/ancestor::div[3]" +
                        "//div[contains(@class, 'dealer-card')]//div[@class='line_statistics dealer-card_footer-roulette']//div[4]//span[@class='number']"
        );
    }

}
