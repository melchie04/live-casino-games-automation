package modules.Functionality;

import utilities.handlers.ConditionHandler;
import utilities.handlers.NavigationHandler;
import utilities.objects.CustomAssert;

public class FTTest3 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 3");
        System.out.println("Actual Results: ");

        NavigationHandler.switchBackToMainWindow();

        CustomAssert.assertFalse(
                "FT Test 1",
                ConditionHandler.isUrlContains("/gameLobby", 1) ||
                        ConditionHandler.isUrlContains("/rouletteDesktop", 1),
                "The Live Roulette Desktop Revamp is closed.",
                "The Live Roulette Desktop Revamp is not closed."
        );

        CustomAssert.assertTrue(
                "FT Test 1",
                ConditionHandler.isUrlContains("royalcasino.sbobet.com", 5),
                "The player went back to the Live Casino Page.",
                "The player did not go back to the Live Casino Page."
        );

        System.out.println();
    }

}
