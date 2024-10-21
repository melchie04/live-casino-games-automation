package modules.Functionality;

import globals.Methods;
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

        Methods.waitBettingPhase(25, true);
        WaitHandler.wait(3);

        for (byte i = 0; i < 8; i++) {
            verifyIfPlacedBet(XPath.GameTable.BettingOption.Option.AllBettingOptions[i], XPath.GameTable.BettingOption.Chip.AllBettingChips[i]);
            if (i < 7) EventHandler.click(XPath.GameTable.ToolBar.Undo);
        }

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
