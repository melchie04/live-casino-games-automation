package globals;

import locators.XPath;
import utilities.objects.Locator;

public class Variables {

    public static String productName;
    public static String tableName;
    public static String tableLimit;
    public static String roundID;
    public static String datetime;
    public static String username;
    public static String[] roundResult;
    public static int pinnedAnnouncementCards = 0;
    public static int newAnnouncementCards = 0;
    public static int allAnnouncementCards = 0;
    public static int numberOfDeals = 0;
    public static int[] allCounters;
    public static double totalBet = 0.0;
    public static double placedBet = 0.0;
    public static double balanceBeforeBetting = 0.0;
    public static double balanceAfterBetting = 0.0;
    public static boolean hasNewAnnouncement = false;
    public static boolean hasSettledRounds = false;
    public static final String TABLE_LIMIT = "10 / 100K";
    public static final String REMOVED_CHIP = "25";
    public static final String ADDED_CHIP = "100";
    public static final String RED = "red";
    public static final String BLACK = "black";
    public static final String EVEN = "EVEN";
    public static final String ODD = "ODD";
    public static final String LOW = "1-18";
    public static final String HIGH = "19-36";
    public static final String FIRST_DOZEN = "1ST 12";
    public static final String SECOND_DOZEN = "2ND 12";
    public static final String THIRD_DOZEN = "3RD 12";
    public static final int WAIT_PHASE_SECONDS = 150;
    public static final int MINIMUM_BET_LIMIT = 10;
    public static final int FIRST_COLUMN = 1;
    public static final int SECOND_COLUMN = 2;
    public static final int THIRD_COLUMN = 3;
    public static final String[] SIDE_LIST = {
            RED,
            BLACK,
            EVEN,
            ODD,
            LOW,
            HIGH
    };
    public static final String[] DOZEN_LIST = {
            FIRST_DOZEN,
            SECOND_DOZEN,
            THIRD_DOZEN
    };
    public static final int[] COLUMN_LIST = {
            FIRST_COLUMN,
            SECOND_COLUMN,
            THIRD_COLUMN
    };
    public static final int[] FIRST_COLUMN_NUMBERS = new int[]{1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
    public static final int[] SECOND_COLUMN_NUMBERS = new int[]{2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
    public static final int[] THIRD_COLUMN_NUMBERS = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
    public static final int[][][] SPLIT_LIST = {
            {{1, 3}, {0, 1}},
            {{2, 3}, {0, 2}},
            {{3, 3}, {0, 3}},
            {{4, 3}, {1, 4}},
            {{5, 3}, {2, 5}},
            {{6, 3}, {3, 6}},
            {{7, 3}, {4, 7}},
            {{8, 3}, {5, 8}},
            {{9, 3}, {6, 9}},
            {{10, 3}, {7, 10}},
            {{11, 3}, {8, 11}},
            {{12, 3}, {9, 12}},
            {{13, 3}, {10, 13}},
            {{14, 3}, {11, 14}},
            {{15, 3}, {12, 15}},
            {{16, 3}, {13, 16}},
            {{17, 3}, {14, 17}},
            {{18, 3}, {15, 18}},
            {{19, 3}, {16, 19}},
            {{20, 3}, {17, 20}},
            {{21, 3}, {18, 21}},
            {{22, 3}, {19, 22}},
            {{23, 3}, {20, 23}},
            {{24, 3}, {21, 24}},
            {{25, 3}, {22, 25}},
            {{26, 3}, {23, 26}},
            {{27, 3}, {24, 27}},
            {{28, 3}, {25, 28}},
            {{29, 3}, {26, 29}},
            {{30, 3}, {27, 30}},
            {{31, 3}, {28, 31}},
            {{32, 3}, {29, 32}},
            {{33, 3}, {30, 33}},
            {{34, 3}, {31, 34}},
            {{35, 3}, {32, 35}},
            {{36, 3}, {33, 36}},
            {{2, 2}, {1, 2}},
            {{3, 2}, {2, 3}},
            {{5, 2}, {4, 5}},
            {{6, 2}, {5, 6}},
            {{8, 2}, {7, 8}},
            {{9, 2}, {8, 9}},
            {{11, 2}, {10, 11}},
            {{12, 2}, {11, 12}},
            {{14, 2}, {13, 14}},
            {{15, 2}, {14, 15}},
            {{17, 2}, {16, 17}},
            {{18, 2}, {17, 18}},
            {{20, 2}, {19, 20}},
            {{21, 2}, {20, 21}},
            {{23, 2}, {22, 23}},
            {{24, 2}, {23, 24}},
            {{26, 2}, {25, 26}},
            {{27, 2}, {26, 27}},
            {{29, 2}, {28, 29}},
            {{30, 2}, {29, 30}},
            {{32, 2}, {31, 32}},
            {{33, 2}, {32, 33}},
            {{35, 2}, {34, 35}},
            {{36, 2}, {35, 36}}
    };
    public static final int[][][] STREET_LIST = {
            {{1, 2}, {1, 2, 3}},
            {{4, 2}, {4, 5, 6}},
            {{7, 2}, {7, 8, 9}},
            {{10, 2}, {10, 11, 12}},
            {{13, 2}, {13, 14, 15}},
            {{16, 2}, {16, 17, 18}},
            {{19, 2}, {19, 20, 21}},
            {{22, 2}, {22, 23, 24}},
            {{25, 2}, {25, 26, 27}},
            {{28, 2}, {28, 29, 30}},
            {{31, 2}, {31, 32, 33}},
            {{34, 2}, {34, 35, 36}}
    };
    public static final int[][][] CORNER_LIST = {
            {{5, 1}, {1, 2, 4, 5}},
            {{6, 1}, {2, 3, 5, 6}},
            {{8, 1}, {4, 5, 7, 8}},
            {{9, 1}, {5, 6, 8, 9}},
            {{11, 1}, {7, 8, 10, 11}},
            {{12, 1}, {8, 9, 11, 12}},
            {{14, 1}, {10, 11, 13, 14}},
            {{15, 1}, {11, 12, 14, 15}},
            {{17, 1}, {13, 14, 16, 17}},
            {{18, 1}, {14, 15, 17, 18}},
            {{20, 1}, {16, 17, 19, 20}},
            {{21, 1}, {17, 18, 20, 21}},
            {{23, 1}, {19, 20, 22, 23}},
            {{24, 1}, {20, 21, 23, 24}},
            {{26, 1}, {22, 23, 25, 26}},
            {{27, 1}, {23, 24, 26, 27}},
            {{29, 1}, {25, 26, 28, 29}},
            {{30, 1}, {26, 27, 29, 30}},
            {{32, 1}, {28, 29, 31, 32}},
            {{33, 1}, {29, 30, 32, 33}},
            {{35, 1}, {31, 32, 34, 35}},
            {{36, 1}, {32, 33, 35, 36}}
    };
    public static final int[][][] SIX_LINE_LIST = {
            {{4, 1}, {1, 2, 3, 4, 5, 6}},
            {{7, 1}, {4, 5, 6, 7, 8, 9}},
            {{10, 1}, {7, 8, 9, 10, 11, 12}},
            {{13, 1}, {10, 11, 12, 13, 14, 15}},
            {{16, 1}, {13, 14, 15, 16, 17, 18}},
            {{19, 1}, {16, 17, 18, 19, 20, 21}},
            {{22, 1}, {19, 20, 21, 22, 23, 24}},
            {{25, 1}, {22, 23, 24, 25, 26, 27}},
            {{28, 1}, {25, 26, 27, 28, 29, 30}},
            {{31, 1}, {28, 29, 30, 31, 32, 33}},
            {{34, 1}, {31, 32, 33, 34, 35, 36}}
    };
    public static final int[][][] ZERO_SECTION_LIST = {{{1, 1}, {0, 1, 2, 3}}};
    public static final int[][][] ZERO_CORNER_LIST = {{{2, 1}, {0, 1, 2}}, {{3, 1}, {0, 2, 3}}};
    public static final Locator MINIMUM_BETTING_CHIP = XPath.GameTable.ToolBar.getChip("10");
    public static final Locator DEFAULT_BETTING_OPTION = XPath.GameTable.BettingOption.Option.getSide(RED);
    public static final Locator DEFAULT_BETTING_CHIP = XPath.GameTable.BettingOption.Chip.getSide(RED);
    public static final Locator[] DEFAULT_BETTING_OPTIONS = {
            XPath.GameTable.BettingOption.Option.getSide(BLACK),
            XPath.GameTable.BettingOption.Option.getSide(ODD),
            XPath.GameTable.BettingOption.Option.getSide(EVEN),
            XPath.GameTable.BettingOption.Option.getSide(LOW)
    };
    public static final Locator[] DEFAULT_BETTING_CHIPS = {
            XPath.GameTable.BettingOption.Chip.getSide(BLACK),
            XPath.GameTable.BettingOption.Chip.getSide(ODD),
            XPath.GameTable.BettingOption.Chip.getSide(EVEN),
            XPath.GameTable.BettingOption.Chip.getSide(LOW)
    };
    public static final Locator[] MULTIPLE_BETTING_OPTIONS = {
            XPath.GameTable.BettingOption.Option.getStraightUp(4),
            XPath.GameTable.BettingOption.Option.getSixLine(SIX_LINE_LIST[0]),
            XPath.GameTable.BettingOption.Option.getSplit(SPLIT_LIST[3]),
            XPath.GameTable.BettingOption.Option.getStreet(STREET_LIST[1]),
            XPath.GameTable.BettingOption.Option.getSide(BLACK),
            XPath.GameTable.BettingOption.Option.getSide(EVEN),
            XPath.GameTable.BettingOption.Option.getSide(HIGH),
            XPath.GameTable.BettingOption.Option.getDozen(FIRST_DOZEN),
            XPath.GameTable.BettingOption.Option.getColumn(FIRST_COLUMN),
    };
    public static final Locator[] MULTIPLE_BETTING_CHIPS = {
            XPath.GameTable.BettingOption.Chip.getStraightUp(4),
            XPath.GameTable.BettingOption.Chip.getSixLine(SIX_LINE_LIST[0]),
            XPath.GameTable.BettingOption.Chip.getSplit(SPLIT_LIST[3]),
            XPath.GameTable.BettingOption.Chip.getStreet(STREET_LIST[1]),
            XPath.GameTable.BettingOption.Chip.getSide(BLACK),
            XPath.GameTable.BettingOption.Chip.getSide(EVEN),
            XPath.GameTable.BettingOption.Chip.getSide(HIGH),
            XPath.GameTable.BettingOption.Chip.getDozen(FIRST_DOZEN),
            XPath.GameTable.BettingOption.Chip.getColumn(FIRST_COLUMN),
    };

}
