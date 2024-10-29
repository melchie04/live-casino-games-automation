package locators.roulette;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class RouletteBettingOption {

    public Locator BettingOption = new Locator(
            "Betting Option",
            "Panel",
            "Game Table Page",
            "//div[contains(@class,'bet_options')]"
    );

    public Locator WinBettingOptions = new Locator(
            "Win Betting Options",
            "Container",
            "Game Table Page",
            "//div[contains(@class,'bet_options')]//div[contains(@class, 'win')]"
    );

    public Option Option = new Option();

    public static class Option {

        public Locator getSide(String side) {
            return new Locator(
                    switch (side) {
                        case "red" -> "Red Betting Option";
                        case "black" -> "Black Betting Option";
                        case "EVEN" -> "Even Betting Option";
                        case "ODD" -> "Odd Betting Option";
                        case "1-18" -> "Low Betting Option";
                        case "19-36" -> "High Betting Option";
                        default -> "";
                    },
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + side + "']/ancestor::div[1]"
            );
        }

        public Locator getDozen(String dozen) {
            return new Locator(
                    switch (dozen) {
                        case "1ST 12" -> "1st Dozen Betting Option";
                        case "2ND 12" -> "2nd Dozen Betting Option";
                        case "3RD 12" -> "3rd Dozen Betting Option";
                        default -> "";
                    },
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + dozen + "']/ancestor::div[1]"
            );
        }

        public Locator getColumn(int column) {
            return new Locator(
                    switch (column) {
                        case 1 -> "1st Column Betting Option";
                        case 2 -> "2nd Column Betting Option";
                        case 3 -> "3rd Column Betting Option";
                        default -> "";
                    },
                    "Button",
                    "Game Table Page",
                    switch (column) {
                        case 1 -> "//div[contains(@class,'option_box') and contains(@class,'right radius_right_bottom')]";
                        case 2 -> "//div[contains(@class,'option_box') and contains(@class,'right') and not(contains(@class,'radius'))]";
                        case 3 -> "//div[contains(@class,'option_box') and contains(@class,'right radius_right_top')]";
                        default -> "";
                    }
            );
        }

        public Locator getStraightUp(int number) {
            return new Locator(
                    "Straight Up #" + number + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + number + "']/ancestor::div[1]"
            );
        }

        public Locator getSplit(int[][] split) {
            int[] position = split[0];
            int[] numbers = split[1];
            return new Locator(
                    "Split #" + numbers[0] + " & #" + numbers[1] + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]"
            );
        }

        public Locator getStreet(int[][] street) {
            int[] position = street[0];
            int[] numbers = street[1];
            return new Locator(
                    "Street #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]"
            );
        }

        public Locator getCorner(int[][] corner) {
            int[] position = corner[0];
            int[] numbers = corner[1];
            return new Locator(
                    "Corner #" + numbers[0] + ", #" + numbers[1] + ", #" + numbers[2] + ", & #" + numbers[3] + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]"
            );
        }

        public Locator getSixLine(int[][] sixLine) {
            int[] position = sixLine[0];
            int[] numbers = sixLine[1];
            return new Locator(
                    "Six Line #" + numbers[0] + ", #" + numbers[1] + ", #" + numbers[2] + ", & #" + numbers[3] + ", #" +
                            numbers[4] + ", #" + numbers[5] + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]"
            );
        }

        public Locator getZeroSection(int[][] zeroSection) {
            int[] position = zeroSection[0];
            int[] numbers = zeroSection[1];
            return new Locator(
                    "Zero Section #" + numbers[0] + ", #" + numbers[1] + ", #" + numbers[2] + ", & #" + numbers[3] + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]"
            );
        }

        public Locator getZeroCorner(int[][] zeroCorner) {
            int[] position = zeroCorner[0];
            int[] numbers = zeroCorner[1];
            return new Locator(
                    "Zero Corner #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Option",
                    "Button",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]"
            );
        }

    }

    public Chip Chip = new Chip();

    public static class Chip {

        private final String chipPath = "//div[contains(@class,'chip myself')]";

        public Locator getSide(String side) {
            return new Locator(
                    switch (side) {
                        case "red" -> "Red Betting Chip";
                        case "black" -> "Black Betting Chip";
                        case "EVEN" -> "Even Betting Chip";
                        case "ODD" -> "Odd Betting Chip";
                        case "1-18" -> "Low Betting Chip";
                        case "19-36" -> "High Betting Chip";
                        default -> "";
                    },
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + side + "']/ancestor::div[1]" + chipPath
            );
        }

        public Locator getDozen(String dozen) {
            return new Locator(
                    switch (dozen) {
                        case "1ST 12" -> "1st Dozen Betting Chip";
                        case "2ND 12" -> "2nd Dozen Betting Chip";
                        case "3RD 12" -> "3rd Dozen Betting Chip";
                        default -> "";
                    },
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + dozen + "']/ancestor::div[1]" + chipPath
            );
        }

        public Locator getColumn(int column) {
            return new Locator(
                    switch (column) {
                        case 1 -> "1st Column Betting Chip";
                        case 2 -> "2nd Column Betting Chip";
                        case 3 -> "3rd Column Betting Chip";
                        default -> "";
                    },
                    "Container",
                    "Game Table Page",
                    switch (column) {
                        case 1 -> "//div[contains(@class,'option_box') and contains(@class,'right radius_right_bottom')]/ancestor::div[1]";
                        case 2 -> "//div[contains(@class,'option_box') and contains(@class,'right') and not(contains(@class,'radius'))]/ancestor::div[1]";
                        case 3 -> "//div[contains(@class,'option_box') and contains(@class,'right radius_right_top')]/ancestor::div[1]";
                        default -> "";
                    } + chipPath
            );
        }

        public Locator getStraightUp(int number) {
            return new Locator(
                    "Straight Up #" + number + " Betting Chip",
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + number + "']/ancestor::div[1]" + chipPath
            );
        }

        public Locator getSplit(int[][] split) {
            int[] position = split[0];
            int[] numbers = split[1];
            return new Locator(
                    "Split #" + numbers[0] + " & #" + numbers[1] + " Betting Chip",
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]" + chipPath
            );
        }

        public Locator getStreet(int[][] street) {
            int[] position = street[0];
            int[] numbers = street[1];
            return new Locator(
                    "Street #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Chip",
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]" + chipPath
            );
        }

        public Locator getCorner(int[][] corner) {
            int[] position = corner[0];
            int[] numbers = corner[1];
            return new Locator(
                    "Corner #" + numbers[0] + ", #" + numbers[1] + ", #" + numbers[2] + ", & #" + numbers[3] + " Betting Chip",
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]" + chipPath
            );
        }

        public Locator getSixLine(int[][] sixLine) {
            int[] position = sixLine[0];
            int[] numbers = sixLine[1];
            return new Locator(
                    "Six Line #" + numbers[0] + ", #" + numbers[1] + ", #" + numbers[2] + ", & #" + numbers[3] + ", #" +
                            numbers[4] + ", #" + numbers[5] + " Betting Chip",
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]" + chipPath
            );
        }

        public Locator getZeroSection(int[][] zeroSection) {
            int[] position = zeroSection[0];
            int[] numbers = zeroSection[1];
            return new Locator(
                    "Zero Section #" + numbers[0] + ", #" + numbers[1] + ", #" + numbers[2] + ", & #" + numbers[3] + " Betting Chip",
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]" + chipPath
            );
        }

        public Locator getZeroCorner(int[][] zeroCorner) {
            int[] position = zeroCorner[0];
            int[] numbers = zeroCorner[1];
            return new Locator(
                    "Zero Corner #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Chip",
                    "Container",
                    "Game Table Page",
                    "//div[contains(@class,'option_text')][normalize-space()='" + position[0] + "']/ancestor::div[1]" +
                            "//div[contains(@class,'bet_option_chip_position pos_" + position[1] + "')]" + chipPath
            );
        }

    }

}
