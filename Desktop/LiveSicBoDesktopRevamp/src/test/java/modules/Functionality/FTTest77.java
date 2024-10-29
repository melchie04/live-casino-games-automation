package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Locator;

public class FTTest77 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 77");
        System.out.println("Actual Results: ");

        Methods.waitBettingPhase(45, true);
        WaitHandler.wait(3);

        for (int singleDice = 1; singleDice <= 6; singleDice++)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getSingleDice(singleDice), XPath.GameTable.BettingOption.Chip.getSingleDice(singleDice));

        for (int i = 1; i <= 6; i++)
            for (int j = 1; j <= 6; j++)
                if (i < j) verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getTwoDiceCombo(i, j), XPath.GameTable.BettingOption.Chip.getTwoDiceCombo(i, j));

        for (int specificTriple = 1; specificTriple <= 6; specificTriple++)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getSpecificTriple(specificTriple), XPath.GameTable.BettingOption.Chip.getSpecificTriple(specificTriple));

        for (int specificDouble = 1; specificDouble <= 6; specificDouble++)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getSpecificDouble(specificDouble), XPath.GameTable.BettingOption.Chip.getSpecificDouble(specificDouble));

        for (int threeDiceTotal = 4; threeDiceTotal <= 17; threeDiceTotal++)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getThreeDiceTotal(threeDiceTotal), XPath.GameTable.BettingOption.Chip.getThreeDiceTotal(threeDiceTotal));

        for (String main : Variables.MAIN_LIST)
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.getMain(main), XPath.GameTable.BettingOption.Chip.getMain(main));

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static void verifyIfPlacedBet(Locator bettingOption, Locator bettingChip) {
        EventHandler.click(bettingOption);
        VerificationHandler.verifyIfDisplayed(
                "FT Test 77",
                bettingChip,
                5,
                "placed"
        );
    }

}
