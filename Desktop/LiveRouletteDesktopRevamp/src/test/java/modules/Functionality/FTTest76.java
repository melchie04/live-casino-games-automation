package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class FTTest76 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 76");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 76",
                Variables.DEFAULT_BETTING_CHIP,
                5,
                "placed again"
        );

        VerificationHandler.verifyIfNotContained(
                "FT Test 76",
                Variables.DEFAULT_BETTING_CHIP,
                "class",
                "confirm",
                "placed with light color"
        );

        double actualBet = Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP);

        CustomAssert.assertEquals(
                "FT Test 76",
                Variables.placedBet,
                actualBet,
                "The placed bet is the same as the previous bet: " + Variables.placedBet + " --> " + actualBet,
                "The placed bet is not the same as the previous bet: " + Variables.placedBet + " --> " + actualBet
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
