package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

import java.util.Objects;

public class BHTest16 {

    private static boolean insideGameLobby = true;

    public static void verify() {
        if (insideGameLobby) {
            System.out.println();
            System.out.println("Module: BEHAVIOR");
            System.out.println("Test Case: 16");
            System.out.println("Actual Results: ");

            int actualNumberOfDeals = GetHandler.getInt(XPath.GameLobby.Content.getNumberOfDeals(Variables.tableName));
            int actualTotalCounter = GetHandler.getInt(XPath.GameLobby.ResultHistory.getTotalCounter(Variables.tableName));

            if (Variables.numberOfDeals == 300) {
                CustomAssert.assertTrue(
                        "BH Test 16",
                        Variables.numberOfDeals == actualNumberOfDeals,
                        "The number of deals in the Game Lobby remained at 300 after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals,
                        "The number of deals in the Game Lobby did not remain at 300 after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals
                );
            } else {
                CustomAssert.assertTrue(
                        "BH Test 16",
                        Variables.numberOfDeals < actualNumberOfDeals,
                        "The number of deals in the Game Lobby increased after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals,
                        "The number of deals in the Game Lobby did not increase after the round settled: " + Variables.numberOfDeals + " --> " + actualNumberOfDeals
                );
            }

            CustomAssert.assertTrue(
                    "BH Test 16",
                    actualNumberOfDeals == actualTotalCounter,
                    "The number of deals and the total counter in the Game Lobby is the same: " + actualNumberOfDeals + " --> " + actualNumberOfDeals,
                    "The number of deals and the total counter in the Game Lobby is not the same: " + actualNumberOfDeals + " --> " + actualNumberOfDeals
            );

            Variables.numberOfDeals = actualNumberOfDeals;
            insideGameLobby = false;

        } else {

            WaitHandler.wait(3);
            int[] actualAllRoundCounters = Objects.requireNonNull(GetHandler.getIntArray(XPath.GameTable.JumpTable.getAllCounters("Table " + Helper.getLastChar(Variables.tableName)), HandleCollection.WithScroll));
            verifyCounter("Red Counter", Variables.allCounters[0], actualAllRoundCounters[0]);
            verifyCounter("Black Counter", Variables.allCounters[1], actualAllRoundCounters[1]);
            verifyCounter("Zero Counter", Variables.allCounters[2], actualAllRoundCounters[2]);
            verifyCounter("Total Counter", Variables.allCounters[3], actualAllRoundCounters[3]);

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

    private static void verifyCounter(String counter, int expected, int actual) {
        CustomAssert.assertEquals(
                "BH Test 16",
                expected,
                actual,
                "The " + counter + " within the Jump Table Panel of the Game Table and the Game Lobby is the same: " + expected + " == " + actual,
                "The " + counter + " within the Jump Table Panel of the Game Table and the Game Lobby is not the same: " + expected + " != " + actual
        );
    }

}
