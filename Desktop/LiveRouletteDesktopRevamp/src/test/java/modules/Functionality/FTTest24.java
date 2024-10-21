package modules.Functionality;

import utilities.handlers.ConditionHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FTTest24 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 24");
        System.out.println("Actual Results: ");

        WaitHandler.wait(3);
        CustomAssert.assertTrue(
                "FT Test 24",
                ConditionHandler.isUrlContains("/gameLobby", 5),
                "The player went back to the Game Lobby Page.",
                "The player did not go back to the Game Lobby Page."
        );

        System.out.println();
    }

}
