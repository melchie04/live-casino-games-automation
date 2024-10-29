package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest63 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 63");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 63",
                XPath.GameTable.ChipSetting.PreviousChip,
                5
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.ChipSetting.Close);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
