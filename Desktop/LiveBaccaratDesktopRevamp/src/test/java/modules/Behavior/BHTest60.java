package modules.Behavior;

import globals.Methods;
import globals.Variables;
import utilities.handlers.ConditionHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Printer;

public class BHTest60 {

    public static void verify() {
        System.out.println();
        Printer.printInfo("#9 Round Result: " + Helper.toString(Methods.getRoundResult()));

        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 60");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(
                "BE Test 60",
                ConditionHandler.isUrlContains("/gameLobby", Variables.WAIT_PHASE_SECONDS),
                "The player did go back to the Game Lobby Page.",
                "The player did not go back to the Game Lobby Page."
        );

        System.out.println();
    }

}