package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class BHTest16 {

    private static boolean insideGameLobby = true;

    public static void verify() {
        if (insideGameLobby) {
            System.out.println();
            System.out.println("Module: BEHAVIOR");
            System.out.println("Test Case: 16");
            System.out.println("Actual Results: ");

            int actualNumberOfDeals = GetHandler.getInt(XPath.GameLobby.Content.getNumberOfDeals(Variables.tableName));

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

            Variables.numberOfDeals = actualNumberOfDeals;
            insideGameLobby = false;

        } else {

            WaitHandler.wait(3);
            int actualTotalCounter = GetHandler.getInt(XPath.GameTable.Counters.Total);

            CustomAssert.assertEquals(
                    "BH Test 16",
                    Variables.numberOfDeals,
                    actualTotalCounter,
                    "The number of deals displayed in the Game Lobby is the same as the total counter in the Game Table: " + Variables.numberOfDeals + " == " + actualTotalCounter,
                    "The number of deals displayed in the Game Lobby is not the same as the total counter in the Game Table: " + Variables.numberOfDeals + " != " + actualTotalCounter
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }

    }

}
