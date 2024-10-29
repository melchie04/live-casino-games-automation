package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest59 {

    private static boolean isClose = true;

    public static void verify() {
        if (isClose) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 59");
            System.out.println("Actual Results: ");

            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 59",
                    XPath.GameTable.HotColdNumbers.HotColdNumbers,
                    1,
                    "hidden when the Close Button is clicked"
            );

            isClose = false;

        } else {

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 59",
                    XPath.GameTable.HotColdNumbers.HotColdNumbers,
                    5,
                    "displayed when the Open Button is clicked"
            );

            System.out.println();

        }
    }

}
