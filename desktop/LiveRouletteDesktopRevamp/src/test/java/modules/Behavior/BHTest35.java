package modules.Behavior;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest35 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 35");
        System.out.println("Actual Results: ");

        Methods.waitBettingPhase(25, true);
        int timer = GetHandler.getInt(XPath.GameTable.Content.ShowTimer);

        CustomAssert.assertTrue(
                "BH Test 35",
                25 == timer || 24 == timer,
                "The Show Timer Of The " + Variables.tableName + " is displayed and started on 25 seconds.",
                "The Show Timer Of The " + Variables.tableName + " is not displayed and started on 25 seconds."
        );

        VerificationHandler.verifyIfNotContained(
                "BH Test 35",
                XPath.GameTable.Content.Timer,
                "class",
                "red",
                "started in green color"
        );

        Methods.waitBettingPhase(10, true);

        VerificationHandler.verifyIfContained(
                "BH Test 35",
                XPath.GameTable.Content.Timer,
                "class",
                "red",
                "changed to a red color when it reaches 10 seconds"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
