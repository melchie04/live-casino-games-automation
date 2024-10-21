package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class BHTest36 {

    private static boolean insideGameTable = true;

    public static void verify() {
        if (insideGameTable) {
            System.out.println();
            System.out.println("Module: BEHAVIOR");
            System.out.println("Test Case: 36");
            System.out.println("Actual Results: ");

            int actualTotalCounter = GetHandler.getInt(XPath.GameTable.Counters.Total);

            if (Variables.totalCounter == 300) {
                CustomAssert.assertTrue(
                        "BH Test 36",
                        Variables.totalCounter == actualTotalCounter,
                        "The total counter in the Game Table remained at 300 after the round settled: " + Variables.totalCounter + " --> " + actualTotalCounter,
                        "The total counter in the Game Table did not remain at 300 after the round settled: " + Variables.totalCounter + " --> " + actualTotalCounter
                );
            } else {
                CustomAssert.assertTrue(
                        "BH Test 36",
                        Variables.totalCounter < actualTotalCounter,
                        "The total counter in the Game Table increased after the round settled: " + Variables.totalCounter + " --> " + actualTotalCounter,
                        "The total counter in the Game Table did not increase after the round settled: " + Variables.totalCounter + " --> " + actualTotalCounter
                );
            }

            Variables.totalCounter = actualTotalCounter;
            insideGameTable = false;

        } else {

            int actualNumberOfDeals = GetHandler.getInt(XPath.GameLobby.Content.getNumberOfDeals(Variables.tableName));

            CustomAssert.assertEquals(
                    "BH Test 36",
                    Variables.totalCounter,
                    actualNumberOfDeals,
                    "The total counter displayed in the Game Table is the same as the number of deals in the Game Lobby: " + Variables.totalCounter + " == " + actualNumberOfDeals,
                    "The total counter displayed in the Game Table is not the same as the number of deals in the Game Lobby: " + Variables.totalCounter + " != " + actualNumberOfDeals
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }

    }

}
