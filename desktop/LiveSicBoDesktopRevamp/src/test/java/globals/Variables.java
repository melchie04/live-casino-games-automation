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
    public static String[] latestResult;
    public static int pinnedAnnouncementCards = 0;
    public static int newAnnouncementCards = 0;
    public static int allAnnouncementCards = 0;
    public static int numberOfDeals = 0;
    public static double totalBet = 0.0;
    public static double placedBet = 0.0;
    public static double balanceBeforeBetting = 0.0;
    public static double balanceAfterBetting = 0.0;
    public static boolean hasNewAnnouncement = false;
    public static boolean hasSettledRounds = false;
    public static final String TABLE_LIMIT = "10 / 100K";
    public static final String REMOVED_CHIP = "25";
    public static final String ADDED_CHIP = "100";
    public static final String SMALL = "small";
    public static final String BIG = "big";
    public static final String ODD = "odd";
    public static final String EVEN = "even";
    public static final String ANY_TRIPLE = "any_triple";
    public static final String[] MAIN_LIST = {
            SMALL,
            BIG,
            ODD,
            EVEN,
            ANY_TRIPLE
    };
    public static final int WAIT_PHASE_SECONDS = 150;
    public static final int MINIMUM_BET_LIMIT = 10;
    public static final Locator MINIMUM_BETTING_CHIP = XPath.GameTable.ToolBar.getChip("10");
    public static final Locator DEFAULT_BETTING_OPTION = XPath.GameTable.BettingOption.Option.getMain(BIG);
    public static final Locator DEFAULT_BETTING_CHIP = XPath.GameTable.BettingOption.Chip.getMain(BIG);
    public static final Locator[] DEFAULT_BETTING_OPTIONS = {
            XPath.GameTable.BettingOption.Option.getMain(SMALL),
            XPath.GameTable.BettingOption.Option.getMain(ODD),
            XPath.GameTable.BettingOption.Option.getMain(EVEN),
            XPath.GameTable.BettingOption.Option.getMain(ANY_TRIPLE)
    };
    public static final Locator[] DEFAULT_BETTING_CHIPS = {
            XPath.GameTable.BettingOption.Chip.getMain(SMALL),
            XPath.GameTable.BettingOption.Chip.getMain(ODD),
            XPath.GameTable.BettingOption.Chip.getMain(EVEN),
            XPath.GameTable.BettingOption.Chip.getMain(ANY_TRIPLE)
    };
    public static final Locator[] MULTIPLE_BETTING_OPTIONS = {
            XPath.GameTable.BettingOption.Option.getSingleDice(4),
            XPath.GameTable.BettingOption.Option.getSpecificDouble(3),
            XPath.GameTable.BettingOption.Option.getSpecificTriple(2),
            XPath.GameTable.BettingOption.Option.getThreeDiceTotal(14),
            XPath.GameTable.BettingOption.Option.getTwoDiceCombo(1, 2),
            XPath.GameTable.BettingOption.Option.getMain(SMALL),
            XPath.GameTable.BettingOption.Option.getMain(ODD),
            XPath.GameTable.BettingOption.Option.getMain(ANY_TRIPLE),
    };
    public static final Locator[] MULTIPLE_BETTING_CHIPS = {
            XPath.GameTable.BettingOption.Chip.getSingleDice(4),
            XPath.GameTable.BettingOption.Chip.getSpecificDouble(3),
            XPath.GameTable.BettingOption.Chip.getSpecificTriple(2),
            XPath.GameTable.BettingOption.Chip.getThreeDiceTotal(14),
            XPath.GameTable.BettingOption.Chip.getTwoDiceCombo(1, 2),
            XPath.GameTable.BettingOption.Chip.getMain(SMALL),
            XPath.GameTable.BettingOption.Chip.getMain(ODD),
            XPath.GameTable.BettingOption.Chip.getMain(ANY_TRIPLE),
    };

}
