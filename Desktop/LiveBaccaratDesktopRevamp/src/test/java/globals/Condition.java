package globals;

import utilities.handlers.GetHandler;
import utilities.objects.Helper;
import utilities.objects.Locator;

public class Condition {

    public static boolean isWin(Locator locator) {
        return GetHandler.getAttribute(locator, "class").contains("win");
    }

    public static boolean isTieWin(String[] result) {
        return Helper.find(Variables.TIE, result);
    }

    public static boolean isNaturalTie(String[] result) {
        return Helper.find(Variables.NATURAL_TIE, result);
    }

    public static boolean isPlayerWin(String[] result) {
        return Helper.find(Variables.PLAYER, result);
    }

    public static boolean isPlayerPairWin(String[] result) {
        return Helper.find(Variables.PLAYER_PAIR, result);
    }

    public static boolean isPlayerDragonBonusNaturalWin(String[] result) {
        return Helper.contains(Variables.PLAYER_DRAGON_BONUS, result) && Helper.find(Variables.NATURAL_WIN, result);
    }

    public static boolean isBankerWin(String[] result) {
        return Helper.find(Variables.BANKER, result);
    }

    public static boolean isBankerPairWin(String[] result) {
        return Helper.find(Variables.BANKER_PAIR, result);
    }

    public static boolean isBankerDragonBonusNaturalWin(String[] result) {
        return Helper.contains(Variables.BANKER_DRAGON_BONUS, result) && Helper.find(Variables.NATURAL_WIN, result);
    }

    public static boolean isBankerDragonBonusDifferenceWin(String[] result, int difference) {
        if (Helper.find(Variables.NATURAL_WIN, result)) return false;
        if (Helper.contains(Variables.BANKER_DRAGON_BONUS, result))
            for (String res : result)
                if (res.contains(Variables.BANKER_DRAGON_BONUS))
                    if  (Integer.parseInt(Helper.getLastChar(res)) == difference) return true;
        return false;
    }

    public static boolean isPlayerDragonBonusDifferenceWin(String[] result, int difference) {
        if (Helper.find(Variables.NATURAL_WIN, result)) return false;
        if (Helper.contains(Variables.PLAYER_DRAGON_BONUS, result))
            for (String res : result)
                if (res.contains(Variables.PLAYER_DRAGON_BONUS))
                    if  (Integer.parseInt(Helper.getLastChar(res)) == difference) return true;
        return false;
    }

    public static boolean isFortuneSixWin(String[] result) {
        return Helper.contains(Variables.FORTUNE_SIX, result);
    }

    public static boolean isFortuneSixCardsWin(String[] result, int cards) {
        if (Helper.contains(Variables.FORTUNE_SIX, result))
            for (String res : result)
                if (res.contains(Variables.FORTUNE_SIX))
                    if (Integer.parseInt(Helper.getLastChar(res)) == cards) return true;
        return false;
    }

}
