package modules.Behavior;

import globals.Condition;
import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Locator;

import java.util.ArrayList;
import java.util.List;

public class BHTest37 {

    static int[] rouletteNumbers = new int[]
            {0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6, 27, 13, 36, 11, 30, 8, 23, 10, 5, 24, 16, 33, 1, 20, 14, 31, 9, 22, 18, 29, 7, 28, 12, 35, 3, 26};

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 37");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(XPath.GameTable.RoundResult.RoundResult, 150);
        int actualNumberResult = GetHandler.getInt(XPath.GameTable.RoundResult.ResultNumber);
        int actualNumberLeft = GetHandler.getInt(XPath.GameTable.RoundResult.LeftSideResultNumber);
        int actualNumberRight = GetHandler.getInt(XPath.GameTable.RoundResult.RightSideResultNumber);
        String[] roundResult = Methods.getRoundResult();
        int expectedNumberResult = Integer.parseInt(roundResult[0]);
        int expectedNumberLeft = getNumberToLeft(expectedNumberResult);
        int expectedNumberRight = getNumberToRight(expectedNumberResult);

        CustomAssert.assertEquals(
                "BE Test 37",
                expectedNumberResult,
                actualNumberResult,
                "The result number is correct: " + expectedNumberResult + " == " + actualNumberResult,
                "The result number is not correct" + expectedNumberResult + " != " + actualNumberResult
        );

        CustomAssert.assertEquals(
                "BE Test 37",
                expectedNumberLeft,
                actualNumberLeft,
                "The result number in the left side is correct: " + expectedNumberLeft + " == " + actualNumberLeft,
                "The result number in the left side is not correct: " + expectedNumberLeft + " != " + actualNumberLeft
        );

        CustomAssert.assertEquals(
                "BE Test 37",
                expectedNumberRight,
                actualNumberRight,
                "The result number in the right side is correct: " + expectedNumberRight + " == " + actualNumberRight,
                "The result number in the right side is not correct: " + expectedNumberRight + " != " + actualNumberRight
        );

        CustomAssert.assertTrue(
                "BE Test 37",
                isHighLighted(roundResult),
                "All winning betting options is highlighted.",
                "All winning betting options is not highlighted."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    public static int getNumberToLeft(int targetNumber) {
        int targetIndex = findIndex(targetNumber);
        int leftIndex = (targetIndex + rouletteNumbers.length - 1) % rouletteNumbers.length;
        return rouletteNumbers[leftIndex];
    }

    public static int getNumberToRight(int targetNumber) {
        int targetIndex = findIndex(targetNumber);
        int rightIndex = (targetIndex + 1) % rouletteNumbers.length;
        return rouletteNumbers[rightIndex];
    }

    private static int findIndex(int targetNumber) {
        for (int i = 0; i < rouletteNumbers.length; i++) if (rouletteNumbers[i] == targetNumber) return i;
        return -1;
    }

    private static boolean isHighLighted(String[] roundResult) {
        for (Locator locator : getBettingOptions(roundResult))
            if(!GetHandler.getAttribute(locator, "class").contains("win")) return false;
        return true;
    }

    private static List<Locator> getBettingOptions(String[] roundResult) {
        List<Locator> bettingOptions = new ArrayList<>();
        if(Condition.isRedWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getSide(Variables.RED));
        if(Condition.isBlackWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getSide(Variables.BLACK));
        if(Condition.isEvenWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getSide(Variables.EVEN));
        if(Condition.isOddWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getSide(Variables.ODD));
        if(Condition.isLowWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getSide(Variables.LOW));
        if(Condition.isHighWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getSide(Variables.HIGH));
        if(Condition.is1stDozenWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getDozen(Variables.FIRST_DOZEN));
        if(Condition.is2ndDozenWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getDozen(Variables.SECOND_DOZEN));
        if(Condition.is3rdDozenWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getDozen(Variables.THIRD_DOZEN));
        if(Condition.is1stColumnWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getColumn(Variables.FIRST_COLUMN));
        if(Condition.is2ndColumnWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getColumn(Variables.SECOND_COLUMN));
        if(Condition.is3rdColumnWin(roundResult)) bettingOptions.add(XPath.GameTable.BettingOption.Option.getColumn(Variables.THIRD_COLUMN));
        return bettingOptions;
    }

}
