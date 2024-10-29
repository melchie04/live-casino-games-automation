package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;

public class FTTest28 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 28");
        System.out.println("Actual Results: ");

        WaitHandler.wait(1);

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 28",
                XPath.GameTable.LimitsAndPayout.LimitsAndPayout,
                1,
                "closed"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
