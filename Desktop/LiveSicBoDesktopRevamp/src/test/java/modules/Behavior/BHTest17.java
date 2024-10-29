package modules.Behavior;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest17 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 17");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "BH Test 17",
                XPath.GameTable.Notification.YourBetsAreBeingSettled,
                5
        );

        CustomAssert.assertTrue(
                "BE Test 17",
                ConditionHandler.isUrlContains("/sicboDesktop", 5),
                "The player stayed on the Game Table Page.",
                "The player did not stay on the Game Table Page."
        );

        System.out.println();
    }

}
