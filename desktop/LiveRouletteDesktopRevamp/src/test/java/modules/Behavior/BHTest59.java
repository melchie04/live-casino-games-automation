package modules.Behavior;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Printer;

public class BHTest59 {

    public static void verify() {
        System.out.println();
        byte count = 0;
        do {
            WaitHandler.waitVisibility(XPath.GameTable.Content.ShowDealing, Variables.WAIT_PHASE_SECONDS);
            Printer.printInfo("#" + (++count) + " Round Result: " + Helper.toString(Methods.getRoundResult()));
            WaitHandler.waitVisibility(XPath.GameTable.Notification.PlaceYourBetsPlease, Variables.WAIT_PHASE_SECONDS);
        } while (count < 8);

        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 59");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 59",
                XPath.GameTable.Notification.GiveItATry,
                5
        );

        CustomAssert.assertTrue(
                "BH Test 59",
                ConditionHandler.isUrlContains("/rouletteDesktop", 5),
                "The player is still seated in the Game Table Page of the selected table.",
                "The player is not seated in the Game Table Page of the selected table."
        );

        System.out.println();
    }

}
