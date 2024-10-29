package locators.sicbo;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class SicBoResultHistory {

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
            "//p[contains(text(), 'Sic Bo')]/ancestor::div[3]//div[@class='sicbo_line_results']"
    );

    public Locator BigCounters = new Locator(
            "Big Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class,'dealer-card')]//div[contains(@class,'sicbo_line_statistics')]//div[1]//span[2]"
    );

    public Locator SmallCounters = new Locator(
            "Small Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class,'dealer-card')]//div[contains(@class,'sicbo_line_statistics')]//div[2]//span[2]"
    );

    public Locator TripleCounters = new Locator(
            "Triple Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class,'dealer-card')]//div[contains(@class,'sicbo_line_statistics')]//div[3]//span[2]"
    );

    public Locator OddCounters = new Locator(
            "Odd Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class,'dealer-card')]//div[contains(@class,'sicbo_line_statistics')]//div[4]//span[2]"
    );

    public Locator EvenCounters = new Locator(
            "Even Counters",
            "Label",
            "Game Lobby Page",
            "//div[contains(@class,'dealer-card')]//div[contains(@class,'sicbo_line_statistics')]//div[5]//span[2]"
    );

    public Locator[] AllCounters = {
            BigCounters,
            SmallCounters,
            TripleCounters,
            OddCounters,
            EvenCounters
    };

    public Locator getAllCounters(String table) {
        return new Locator(
                "All Counters in " + table + " Dealer Table",
                "Label",
                "Game Lobby Page",
                "//p[contains(text(), '" + table + "')]/ancestor::div[3]" +
                        "//div[contains(@class, 'dealer-card')]//div[contains(@class,'sicbo_line_statistics')]//div//span[@class='number']"
        );
    }

    public Locator getLatestResult(String table) {
        return new Locator(
                "Latest Result in " + table + " Dealer Table",
                "Label",
                "Jump Table Window",
                "//p[contains(text(), '" + table + "')]/ancestor::div[3]//li//div[contains(@class,'sicbo_line_result') and contains(@class,'active')]//div"
        );
    }

    public Locator getPreviousResult(String table) {
        return new Locator(
                "Previous Result in " + table + " Dealer Table",
                "Label",
                "Jump Table Window",
                "//p[contains(text(), '" + table + "')]/ancestor::div[3]//li//div[contains(@class,'sicbo_line_result') and contains(@class,'active')]/preceding::div[contains(@class,'sicbo_line_result')][1]//div"
        );
    }

}
