package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

import java.util.Objects;

public class FTTest40 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 40");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(
                "FT Test 40",
                Helper.contains(Variables.roundID, Objects.requireNonNull(GetHandler.getTextArray(XPath.GameTable.MyBets.Settled.RoundID, HandleCollection.WithScroll))),
                "The settled game with a round ID of " + Variables.roundID + " is displayed.",
                "The settled game with a round ID of " + Variables.roundID + " is not displayed."
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 40",
                XPath.GameTable.MyBets.Settled.TableName,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 40",
                XPath.GameTable.MyBets.Settled.StakeTurnover,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 40",
                XPath.GameTable.MyBets.Settled.WinLossComm,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 40",
                XPath.GameTable.MyBets.Settled.ReferenceNumber,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 40",
                XPath.GameTable.MyBets.Settled.BetDate,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 40",
                XPath.GameTable.MyBets.Settled.Status,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 40",
                XPath.GameTable.MyBets.Settled.Message,
                5
        );

        System.out.println();
    }

}
