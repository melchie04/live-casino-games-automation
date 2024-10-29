package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest64 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 64");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 64",
                XPath.GameTable.ChipSetting.PreviousChip,
                5
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.ChipSetting.Close);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
