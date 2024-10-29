package globals;

import utilities.objects.Helper;

import java.util.Arrays;
import java.util.Objects;

public class Condition {

    public static boolean isSingleDiceWin(String[] result, int dice) {
        return Helper.find(Integer.toString(dice), result);
    }

    public static boolean isSpecificDoubleWin(String[] result, int dice) {
        return Arrays.stream(result).filter(value -> Objects.equals(value, Integer.toString(dice))).count() >= 2;
    }

    public static boolean isAnyDoubleWin(String[] result) {
        return Arrays.stream(result).anyMatch(value -> Arrays.stream(result).filter(v -> Objects.equals(v, value)).count() >= 2);
    }

    public static boolean isTwoDiceComboWin(String[] result, int firstDice, int secondDice) {
        return Arrays.stream(result).anyMatch(value -> Objects.equals(value, Integer.toString(firstDice))) &&
                Arrays.stream(result).anyMatch(value -> Objects.equals(value, Integer.toString(secondDice)));
    }

    public static boolean isSpecificTripleWin(String[] result, int dice) {
        return Arrays.stream(result).filter(value -> Objects.equals(value, Integer.toString(dice))).count() == 3;
    }

    public static boolean isThreeDiceTotalWin(String[] result, int number) {
        int[] intArray = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        return Helper.sum(intArray) == number;
    }

    public static boolean isAnyTripleWin(String[] result) {
        for (int i = 1; i < result.length; i++) if (!Objects.equals(result[i], result[0])) return false;
        return true;
    }

    public static boolean isBigWin(String[] result) {
        if (isAnyTripleWin(result)) return false;
        int[] intArray = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        int total = Helper.sum(intArray);
        return total >= 11 && total <= 17;
    }

    public static boolean isSmallWin(String[] result) {
        if (isAnyTripleWin(result)) return false;
        int[] intArray = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        int total = Helper.sum(intArray);
        return total >= 4 && total <= 10;
    }

    public static boolean isOddWin(String[] result) {
        if (isAnyTripleWin(result)) return false;
        int[] intArray = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        return Helper.sum(intArray) % 2 != 0;
    }

    public static boolean isEvenWin(String[] result) {
        if (isAnyTripleWin(result)) return false;
        int[] intArray = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        return Helper.sum(intArray) % 2 == 0;
    }

}
