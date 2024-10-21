package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Locator;

public class FTTest78 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 78");
        System.out.println("Actual Results: ");

        Methods.waitBettingPhase(45, true);
        WaitHandler.wait(3);

        for (int number = 0; number < 37; number++)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getStraightUp(number), XPath.GameTable.BettingOption.Chip.getStraightUp(number));

        for (int[][] split : Variables.SPLIT_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getSplit(split), XPath.GameTable.BettingOption.Chip.getSplit(split));

        for (String side : Variables.SIDE_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getSide(side), XPath.GameTable.BettingOption.Chip.getSide(side));

        Methods.waitBettingPhase(45, true);
        WaitHandler.wait(3);

        for (String dozen : Variables.DOZEN_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getDozen(dozen), XPath.GameTable.BettingOption.Chip.getDozen(dozen));

        for (int column : Variables.COLUMN_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getColumn(column), XPath.GameTable.BettingOption.Chip.getColumn(column));

        for (int[][] street : Variables.STREET_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getStreet(street), XPath.GameTable.BettingOption.Option.getStreet(street));

        for (int[][] corner : Variables.CORNER_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getCorner(corner), XPath.GameTable.BettingOption.Chip.getCorner(corner));

        for (int[][] sixLine : Variables.SIX_LINE_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getSixLine(sixLine), XPath.GameTable.BettingOption.Chip.getSixLine(sixLine));

        for (int[][] zeroSection : Variables.ZERO_SECTION_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getZeroSection(zeroSection), XPath.GameTable.BettingOption.Chip.getZeroSection(zeroSection));

        for (int[][] zeroCorner : Variables.ZERO_CORNER_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getZeroCorner(zeroCorner), XPath.GameTable.BettingOption.Chip.getZeroCorner(zeroCorner));

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static void verifyIfPlacedBet(Locator bettingOption, Locator bettingChip) {
        EventHandler.click(bettingOption);
        VerificationHandler.verifyIfDisplayed(
                "FT Test 78",
                bettingChip,
                5,
                "placed"
        );
    }

}
