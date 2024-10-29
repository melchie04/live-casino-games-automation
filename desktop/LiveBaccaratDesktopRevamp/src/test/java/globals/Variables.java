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
    public static int totalCounter = 0;
    public static double totalBet = 0.0;
    public static double placedBet = 0.0;
    public static double balanceBeforeBetting = 0.0;
    public static double balanceAfterBetting = 0.0;
    public static boolean hasNewAnnouncement = false;
    public static boolean hasSettledRounds = false;
    public static final String TABLE_LIMIT = "50 / 10K";
    public static final String REMOVED_CHIP = "25";
    public static final String ADDED_CHIP = "100";
    public static final String PLAYER = "PLA";
    public static final String PLAYER_PAIR = "PPR";
    public static final String PLAYER_DRAGON_BONUS = "PDB";
    public static final String BANKER = "BAN";
    public static final String BANKER_PAIR = "BPR";
    public static final String BANKER_DRAGON_BONUS = "BDB";
    public static final String NATURAL_WIN = "NWN";
    public static final String NATURAL_TIE = "NTE";
    public static final String TIE = "TIE";
    public static final String FORTUNE_SIX = "FSX";
    public static final int WAIT_PHASE_SECONDS = 900;
    public static final int MINIMUM_BET_LIMIT = 50;
    public static final Locator MINIMUM_BETTING_CHIP = XPath.GameTable.ToolBar.getChip("10");
    public static final Locator DEFAULT_BETTING_OPTION = XPath.GameTable.BettingOption.Option.Player;
    public static final Locator DEFAULT_BETTING_CHIP = XPath.GameTable.BettingOption.Chip.Player;
    public static final Locator[] DEFAULT_BETTING_OPTIONS = {
            XPath.GameTable.BettingOption.Option.Tie,
            XPath.GameTable.BettingOption.Option.PlayerPair,
            XPath.GameTable.BettingOption.Option.BankerPair,
            XPath.GameTable.BettingOption.Option.PlayerDragonBonus
    };
    public static final Locator[] DEFAULT_BETTING_CHIPS = {
            XPath.GameTable.BettingOption.Chip.Tie,
            XPath.GameTable.BettingOption.Chip.PlayerPair,
            XPath.GameTable.BettingOption.Chip.BankerPair,
            XPath.GameTable.BettingOption.Chip.PlayerDragonBonus
    };

}
