package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest41 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 41");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.BetDetails,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.Stake,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.WinLoss,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.PlayerCards,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.PlayerTotalPoints,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.BankerCards,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.BankerTotalPoints,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.BettingOption,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                XPath.GameTable.BetDetails.WinBettingOptions,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 41",
                Variables.DEFAULT_BETTING_CHIP,
                5
        );

        System.out.println();
    }

}
