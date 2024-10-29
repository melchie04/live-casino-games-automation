package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FTTest79 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 79");
        System.out.println("Actual Results: ");

        int actualBet = Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP);

        CustomAssert.assertEquals(
                "FT Test 79",
                Variables.placedBet * 2,
                actualBet,
                "The placed bet is added to the " + Variables.DEFAULT_BETTING_OPTION.getName() + ": " + actualBet,
                "The placed bet is added to the " + Variables.DEFAULT_BETTING_OPTION.getName() + ": " + actualBet
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
