package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest52 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 52");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 52",
                XPath.GameTable.JumpTable.JumpTable,
                1,
                "closed when it's clicked outside of window."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
