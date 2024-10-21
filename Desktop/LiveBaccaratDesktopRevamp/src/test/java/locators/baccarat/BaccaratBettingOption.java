package locators.baccarat;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class BaccaratBettingOption {

    public Locator BettingOption = new Locator(
            "Betting Option",
            "Panel",
            "Game Table Page",
            "//div[@class='baccarat_betting_area']"
    );

    public Locator WinBettingOptions = new Locator(
            "Win Betting Options",
            "Container",
            "Game Table Page",
            "//div[@class='baccarat_betting_area']//li[contains(@class,'_bet') and contains(@class,'win')]"
    );

    public Locator PlayerBettingChip = new Locator(
            "Player Betting Chip",
            "Container",
            "Game Table Page",
            "//div[@class='chip_locate player_chip_locate_user']//div[contains(@class, 'chip chip_') and contains(@class, '_solid solid')]"
    );

    public Locator NonCommIndicators = new Locator(
            "Non-commission Indicators",
            "Label",
            "Game Table Page",
            "//p[normalize-space()='Banker']/following-sibling::span"
    );

    public Option Option = new Option();

    public static class Option {

        public Locator Player = new Locator(
                "Player Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Player')]/ancestor::li[contains(@class, 'main_bet blue')]"
        );

        public Locator Tie = new Locator(
                "Tie Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Tie')]/ancestor::li[contains(@class, 'main_bet green')]"
        );

        public Locator Banker = new Locator(
                "Banker Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Banker')]/ancestor::li[contains(@class, 'main_bet red')]"
        );

        public Locator PlayerDragonBonus = new Locator(
                "Player Dragon Bonus Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet blue')]"
        );

        public Locator PlayerPair = new Locator(
                "Player Pair Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Player Pair')]/ancestor::li[contains(@class, 'side_bet blue')]"
        );

        public Locator FortuneSix = new Locator(
                "Fortune Six Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Fortune 6')]/ancestor::li[contains(@class, 'side_bet yellow')]"
        );

        public Locator BankerPair = new Locator(
                "Banker Pair Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Banker Pair')]/ancestor::li[contains(@class, 'side_bet red')]"
        );

        public Locator BankerDragonBonus = new Locator(
                "Banker Dragon Bonus Betting Option",
                "Button",
                "Game Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet red')]"
        );

        public Locator[] AllBettingOptions = {
                Player,
                Tie,
                Banker,
                PlayerDragonBonus,
                PlayerPair,
                FortuneSix,
                BankerPair,
                BankerDragonBonus
        };

    }

    public Chip Chip = new Chip();

    public static class Chip {

        private final String chipPath = "//div[contains(@class, 'chip_locate_user')]//div[contains(@class, 'chip_text')]";

        public Locator Player = new Locator(
                "Player Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Player')]/ancestor::li[contains(@class, 'main_bet blue')]" + chipPath
        );

        public Locator Tie = new Locator(
                "Tie Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Tie')]/ancestor::li[contains(@class, 'main_bet green')]" + chipPath
        );

        public Locator Banker = new Locator(
                "Banker Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Banker')]/ancestor::li[contains(@class, 'main_bet red')]" + chipPath
        );

        public Locator PlayerDragonBonus = new Locator(
                "Player Dragon Bonus Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet blue')]" + chipPath
        );

        public Locator PlayerPair = new Locator(
                "Player Pair Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Player Pair')]/ancestor::li[contains(@class, 'side_bet blue')]" + chipPath
        );

        public Locator FortuneSix = new Locator(
                "Fortune Six Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Fortune 6')]/ancestor::li[contains(@class, 'side_bet yellow')]" + chipPath
        );

        public Locator BankerPair = new Locator(
                "Banker Pair Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Banker Pair')]/ancestor::li[contains(@class, 'side_bet red')]" + chipPath
        );

        public Locator BankerDragonBonus = new Locator(
                "Banker Dragon Bonus Betting Chip",
                "Container",
                "Game Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet red')]" + chipPath
        );

        public Locator[] AllBettingChips = {
                Player,
                Tie,
                Banker,
                PlayerDragonBonus,
                PlayerPair,
                FortuneSix,
                BankerPair,
                BankerDragonBonus
        };

    }

}
