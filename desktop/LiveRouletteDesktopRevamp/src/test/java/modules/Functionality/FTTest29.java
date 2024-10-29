package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest29 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 29");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 29",
                XPath.GameTable.TableLimit.AllTableLimits,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 29",
                XPath.GameTable.TableLimit.ActiveTableLimit,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 29",
                XPath.GameTable.TableLimit.InactiveTableLimits,
                5
        );

        System.out.println();
    }

}
