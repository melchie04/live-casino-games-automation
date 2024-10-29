package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest60 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 60");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 60",
                XPath.GameTable.ChipSetting.MyChips,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 60",
                XPath.GameTable.ChipSetting.ChipSelections,
                5
        );

        System.out.println();
    }

}
