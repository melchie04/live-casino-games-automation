package locators.sicbo;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class SicBoBettingOption {

    public Locator BettingOption = new Locator(
            "Betting Option",
            "Panel",
            "Game Table Page",
            "//div[contains(@class,'sic_bo_betting_options')]"
    );

    public Locator WinBettingOptions = new Locator(
            "Win Betting Options",
            "Container",
            "Game Table Page",
            "//div[contains(@class,'sic_bo_betting_options')]//div[contains(@class, 'win') and not(contains(@class, 'border'))]"
    );

    public Option Option = new Option();

    public static class Option {

        public Locator getSingleDice(int singleDice) {
            return new Locator(
                    "Single Dice #" + singleDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option single_dice_bet')]//div[@class='dice dice_" + singleDice + "']/ancestor::div[3]"
            );
        }

        public Locator getTwoDiceCombo(int firstDice, int secondDice) {
            return new Locator(
                    "Two Dice Combo #" + firstDice + " & #" + secondDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option combination_bet') and descendant::div[@class='dice dice_" + firstDice + "']" +
                            " and descendant::div[@class='dice dice_" + secondDice + "']]"
            );
        }

        public Locator getSpecificTriple(int tripleDice) {
            return new Locator(
                    "Specific Triple Dice #" + tripleDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option triple_bet')]//div[@class='dice dice_" + tripleDice + "']/ancestor::div[3]"
            );
        }

        public Locator getSpecificDouble(int doubleDice) {
            return new Locator(
                    "Specific Double Dice #" + doubleDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option double_bet')]//div[@class='dice dice_" + doubleDice + "']/ancestor::div[3]"
            );
        }

        public Locator getThreeDiceTotal(int threeDiceTotal) {
            return new Locator(
                    "Three Dice Total #" + threeDiceTotal + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option total_bet')]//div[normalize-space()='" + threeDiceTotal + "' and @class='bet_name EN_US']/ancestor::div[2]"
            );
        }

        public Locator getMain(String main) {
            return new Locator(
                    switch (main) {
                        case "small" -> "Small Betting Option";
                        case "big" -> "Big Betting Option";
                        case "odd" -> "Odd Betting Option";
                        case "even" -> "Even Betting Option";
                        case "any_triple" -> "Any Triple Betting Option";
                        default -> "";
                    },
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option main_bet_" + main + "')]"
            );
        }

    }

    public Chip Chip = new Chip();

    public static class Chip {

        private final String chipPath = "//div[contains(@class,'chip myself')]";

        public Locator getSingleDice(int singleDice) {
            return new Locator(
                    "Single Dice #" + singleDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option single_dice_bet')]//div[@class='dice dice_" + singleDice + "']/ancestor::div[3]" + chipPath
            );
        }

        public Locator getTwoDiceCombo(int firstDice, int secondDice) {
            return new Locator(
                    "Two Dice Combo #" + firstDice + " & #" + secondDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option combination_bet') and descendant::div[@class='dice dice_" + firstDice + "']" +
                            " and descendant::div[@class='dice dice_" + secondDice + "']]" + chipPath
            );
        }

        public Locator getSpecificTriple(int tripleDice) {
            return new Locator(
                    "Specific Triple Dice #" + tripleDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option triple_bet')]//div[@class='dice dice_" + tripleDice + "']/ancestor::div[3]" + chipPath
            );
        }

        public Locator getSpecificDouble(int doubleDice) {
            return new Locator(
                    "Specific Double Dice #" + doubleDice + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option double_bet')]//div[@class='dice dice_" + doubleDice + "']/ancestor::div[3]" + chipPath
            );
        }

        public Locator getThreeDiceTotal(int threeDiceTotal) {
            return new Locator(
                    "Three Dice Total #" + threeDiceTotal + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option total_bet')]//div[normalize-space()='" + threeDiceTotal + "' and @class='bet_name EN_US']/ancestor::div[2]" + chipPath
            );
        }

        public Locator getMain(String main) {
            return new Locator(
                    switch (main) {
                        case "small" -> "Small Betting Option";
                        case "big" -> "Big Betting Option";
                        case "odd" -> "Odd Betting Option";
                        case "even" -> "Even Betting Option";
                        case "any_triple" -> "Any Triple Betting Option";
                        default -> "";
                    },
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class, 'bet_option main_bet_" + main + "')]" + chipPath
            );
        }

    }

}
