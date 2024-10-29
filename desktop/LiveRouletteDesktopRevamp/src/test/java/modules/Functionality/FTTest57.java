package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest57 {

    private static boolean isClick = true;

    public static void verify() {
        if (isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 57");
            System.out.println("Actual Results: ");

            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 57",
                    XPath.GameTable.ToolBar.ToolBar,
                    1,
                    "hidden when it's clicked"
            );

            isClick = false;

        } else {

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 57",
                    XPath.GameTable.ToolBar.ToolBar,
                    5,
                    "displayed when it's re-clicked"
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

}
