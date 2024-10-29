package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FTTest39 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 39");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(
                "FT Test 39",
                Helper.contains(Variables.roundID, GetHandler.getTextArray(XPath.GameTable.MyBets.Running.RoundID)),
                "The running game with a round ID of " + Variables.roundID + " is displayed.",
                "The running game with a round ID of " + Variables.roundID + " is not displayed."
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 39",
                XPath.GameTable.MyBets.Running.TableName,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 39",
                XPath.GameTable.MyBets.Running.StakeTurnover,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 39",
                XPath.GameTable.MyBets.Running.ReferenceNumber,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 39",
                XPath.GameTable.MyBets.Running.BetDate,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 39",
                XPath.GameTable.MyBets.Running.Status,
                5
        );

        System.out.println();
    }

}
