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

public class BHTest34 {

    private static boolean insideGameTable = true;

    public static void verify() {
        if (insideGameTable) {
            System.out.println();
            System.out.println("Module: BEHAVIOR");
            System.out.println("Test Case: 34");
            System.out.println("Actual Results: ");

            int[] actualCounters = Objects.requireNonNull(GetHandler.getIntArray(XPath.GameTable.JumpTable.getAllCounters("Table " + Helper.getLastChar(Variables.tableName)), HandleCollection.WithScroll));

            if (Variables.allCounters[3] == 300) {
                CustomAssert.assertTrue(
                        "BH Test 34",
                        Variables.allCounters[3] == actualCounters[3],
                        "The total counter in the Game Table remained at 300 after the round settled: " + Variables.allCounters[3] + " --> " + actualCounters[3],
                        "The total counter in the Game Table did not remain at 300 after the round settled: " + Variables.allCounters[3] + " --> " + actualCounters[3]
                );
            } else {
                CustomAssert.assertTrue(
                        "BH Test 34",
                        Variables.allCounters[3] < actualCounters[3],
                        "The total counter in the Game Table increased after the round settled: " + Variables.allCounters[3] + " --> " + actualCounters[3],
                        "The total counter in the Game Table did not increase after the round settled: " + Variables.allCounters[3] + " --> " + actualCounters[3]
                );
            }

            Variables.allCounters = Objects.requireNonNull(GetHandler.getIntArray(XPath.GameTable.JumpTable.getAllCounters("Table " + Helper.getLastChar(Variables.tableName)), HandleCollection.WithScroll));
            insideGameTable = false;

        } else {

            WaitHandler.wait(2);
            int[] actualAllRoundCounters = GetHandler.getIntArray(XPath.GameLobby.ResultHistory.getAllCounters(Variables.tableName));

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
                "BH Test 34",
                expected,
                actual,
                "The " + counter + " within the Jump Table Panel of the Game Table and the Game Lobby is the same: " + expected + " == " + actual,
                "The " + counter + " within the Jump Table Panel of the Game Table and the Game Lobby is not the same: " + expected + " != " + actual
        );
    }

}
