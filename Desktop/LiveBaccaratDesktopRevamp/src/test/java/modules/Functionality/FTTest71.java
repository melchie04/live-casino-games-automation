package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FTTest71 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 71");
        System.out.println("Actual Results: ");

        double expectedBet = Variables.placedBet * 2;
        double actualBet = Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP);

        CustomAssert.assertEquals(
                "FT Test 71",
                expectedBet,
                actualBet,
                "The placed bet is doubled: " + Variables.placedBet + " --> " + actualBet,
                "The placed bet is not doubled: " + Variables.placedBet + " --> " + actualBet
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
