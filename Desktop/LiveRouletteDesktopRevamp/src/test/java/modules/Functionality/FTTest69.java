package modules.Functionality;

import globals.Variables;
import utilities.handlers.VerificationHandler;
import utilities.objects.Locator;

public class FTTest69 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 69");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 69",
                Variables.DEFAULT_BETTING_CHIP,
                5,
                "placed"
        );

        for (Locator bettingChip : Variables.DEFAULT_BETTING_CHIPS) {
            if (bettingChip == Variables.DEFAULT_BETTING_CHIPS[Variables.DEFAULT_BETTING_CHIPS.length - 1]) {
                VerificationHandler.verifyIfNotDisplayed(
                        "FT Test 69",
                        bettingChip,
                        1,
                        "removed"
                );
            } else {
                VerificationHandler.verifyIfDisplayed(
                        "FT Test 69",
                        bettingChip,
                        5,
                        "placed"
                );
            }
        }

        System.out.println();
    }

}
