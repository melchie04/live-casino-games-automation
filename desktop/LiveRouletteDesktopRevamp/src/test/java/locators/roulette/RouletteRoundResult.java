package locators.roulette;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class RouletteRoundResult {

    public Locator RoundResult = new Locator(
            "Round Result",
            "Container",
            "Game Table Page",
            "//div[@class='bet_result_roulette']"
    );

    public Locator ResultNumber = new Locator(
            "Result Number",
            "Label",
            "Game Table Page",
            "//div[@class='bet_result_roulette']//li[3]"
    );

    public Locator LeftSideResultNumber = new Locator(
            "Left Side Result Number",
            "Label",
            "Game Table Page",
            "//div[@class='bet_result_roulette']//li[2]"
    );

    public Locator RightSideResultNumber = new Locator(
            "Right Side Result Number",
            "Label",
            "Game Table Page",
            "//div[@class='bet_result_roulette']//li[4]"
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
