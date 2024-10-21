package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class BHTest18 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 18");
        System.out.println("Actual Results: ");

        String newRoundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);

        CustomAssert.assertNotEquals(
                "BH Test 18",
                Variables.roundID,
                newRoundID,
                "A new round ID is generated after the new round starts: " + Variables.roundID + " --> " + newRoundID,
                "A new round ID is not generated after the new round starts: " + Variables.roundID + " --> " + newRoundID
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
