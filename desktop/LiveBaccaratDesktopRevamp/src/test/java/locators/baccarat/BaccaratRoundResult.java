package locators.baccarat;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class BaccaratRoundResult {

    public Locator RoundResult = new Locator(
            "Round Result",
            "Container",
            "Game Table Page",
            "//div[@class='bet_result']"
    );

    public Locator WinResult = new Locator(
            "Win Result",
            "Container",
            "Game Table Page",
            "//div[contains(@class, 'result') and contains(@class, 'Win')]"
    );

    public Locator PlayerCards = new Locator(
            "Player Cards",
            "Container",
            "Game Table Page",
            "//div[contains(@class, 'player')]//div[contains(@class, 'front')]"
    );

    public Locator BankerCards = new Locator(
            "Banker Cards",
            "Container",
            "Game Table Page",
            "//div[contains(@class, 'banker')]//div[contains(@class, 'front')]"
    );

    public Locator PlayerTotalPoints = new Locator(
            "Player Total Points",
            "Label",
            "Game Table Page",
            "//div[contains(@class, 'player')]//div[@class='total_points']//p"
    );

    public Locator BankerTotalPoints = new Locator(
            "Banker Total Points",
            "Label",
            "Game Table Page",
            "//div[contains(@class, 'banker')]//div[@class='total_points']//p"
    );

    public Locator WonAmount = new Locator(
            "Won Amount",
            "Label",
            "Game Table Page",
            "//p[@class='you_won_amount_text']"
    );

    public Locator WonMessage = new Locator(
            "Won Message",
            "Label",
            "Game Table Page",
            "//p[@class='you_won_title']"
    );

}
