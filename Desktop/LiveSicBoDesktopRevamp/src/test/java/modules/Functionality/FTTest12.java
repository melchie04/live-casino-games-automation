package modules.Functionality;

import globals.Variables;
import locators.XPath;
import org.testng.SkipException;
import utilities.handlers.VerificationHandler;

public class FTTest12 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 12");
        System.out.println("Actual Results: ");

        if (Variables.hasSettledRounds) {

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.BetDetails,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.Stake,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.WinLoss,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.DiceResult,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.TotalResult,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.BigEvenResult,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.BettingOption,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.BettingChips,
                    5
            );

            VerificationHandler.verifyIfDisplayed(
                    "FT Test 12",
                    XPath.GameLobby.BetDetails.WinBettingOptions,
                    5
            );

        } else throw new SkipException("There Is No Settled Rounds.");

        System.out.println();
    }

}
