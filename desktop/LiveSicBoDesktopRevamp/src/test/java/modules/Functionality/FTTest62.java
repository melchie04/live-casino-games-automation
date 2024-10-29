package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest62 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 62");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 62",
                XPath.GameTable.ChipSetting.NextChip,
                5
        );

        System.out.println();
    }

}
