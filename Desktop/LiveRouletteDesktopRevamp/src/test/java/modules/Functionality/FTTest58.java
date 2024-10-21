package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest58 {

    private static boolean isClose = true;

    public static void verify() {
        if (isClose) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 58");
            System.out.println("Actual Results: ");

            VerificationHandler.verifyIfNotContained(
                    "FT Test 58",
                    XPath.GameTable.GameStatistics.GameStatistics,
                    "class",
                    "openBox",
                    "hidden when the Close Button is clicked"
            );

            isClose = false;

        } else {

            VerificationHandler.verifyIfContained(
                    "FT Test 58",
                    XPath.GameTable.GameStatistics.GameStatistics,
                    "class",
                    "openBox",
                    "displayed when the Open Button is clicked"
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

}
