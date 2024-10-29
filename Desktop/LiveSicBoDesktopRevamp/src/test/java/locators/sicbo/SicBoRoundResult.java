package locators.sicbo;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class SicBoRoundResult {

    public Locator RoundResult = new Locator(
            "Round Result",
            "Container",
            "Game Table Page",
            "//div[@class='bet_result_content']"
    );

    public Locator DiceResult = new Locator(
            "Dice Result",
            "Label",
            "Game Table Page",
            "//div[contains(@class, 'bet_result_content')]//div[contains(@class, 'dice dice')]"
    );

    public Locator TotalResult = new Locator(
            "Total Result",
            "Label",
            "Game Table Page",
            "//div[contains(@class, 'bet_result_content')]//div[contains(@class, 'bet_result_total')]"
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
            "//div[@class='you_won_title']"
    );

}
