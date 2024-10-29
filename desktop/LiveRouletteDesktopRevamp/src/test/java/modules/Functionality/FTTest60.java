package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest60 {

    private static boolean isOpen = true;

    public static void verify() {
        if (isOpen) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 60");
            System.out.println("Actual Results: ");

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 60",
                    XPath.GameTable.HotColdNumbers.HotNumbersInformation,
                    5,
                    "displayed when the Open Information Button is clicked"
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 60",
                    XPath.GameTable.HotColdNumbers.ColdNumbersInformation,
                    5,
                    "displayed when the Open Information Button is clicked"
            );

            isOpen = false;

        } else {

            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 60",
                    XPath.GameTable.HotColdNumbers.HotNumbersInformation,
                    1,
                    "hidden when the Close Information Button is clicked"
            );

            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 60",
                    XPath.GameTable.HotColdNumbers.ColdNumbersInformation,
                    1,
                    "hidden when the Close Information Button is clicked"
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

}
