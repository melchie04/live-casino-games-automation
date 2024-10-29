package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest14 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 14");
        System.out.println("Actual Results: ");

        waitBettingPhase(25);
        int timer = GetHandler.getInt(XPath.GameLobby.Content.getShowTimer(Variables.tableName));

        CustomAssert.assertTrue(
                "BH Test 14",
                25 == timer || 24 == timer,
                "The Show Timer Of The " + Variables.tableName + " is displayed and started on 25 seconds.",
                "The Show Timer Of The " + Variables.tableName + " is not displayed and started on 25 seconds."
        );

        VerificationHandler.verifyIfContained(
                "BH Test 14",
                XPath.GameLobby.Content.getShowTimer(Variables.tableName),
                "style",
                "rgb(38, 191, 55)",
                "started in green color"
        );

        waitBettingPhase(8);

        VerificationHandler.verifyIfContained(
                "BH Test 14",
                XPath.GameLobby.Content.getShowTimer(Variables.tableName),
                "style",
                "rgb(255, 204, 72)",
                "changed to a yellow color when it reaches 8 seconds"
        );

        waitBettingPhase(5);

        VerificationHandler.verifyIfContained(
                "BH Test 14",
                XPath.GameLobby.Content.getShowTimer(Variables.tableName),
                "style",
                "rgb(218, 7, 56)",
                "changed to a red color when it reaches 5 seconds"
        );

        System.out.println();
    }

    private static void waitBettingPhase(int specifiedTime) {
        int currentTimerValue = 100;
        long startTime = System.currentTimeMillis();
        long timeout = 600000; // Set a timeout of 10 minutes
        while (currentTimerValue != specifiedTime) {
            if ((System.currentTimeMillis() - startTime) > timeout) break;
            currentTimerValue = GetHandler.getInt(XPath.GameLobby.Content.getShowTimer(Variables.tableName), HandleCollection.WithException);
        }
    }

}
