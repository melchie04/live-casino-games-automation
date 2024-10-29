package modules.UserInterface;

import globals.Variables;
import locators.XPath;
import utilities.handlers.VerificationHandler;

public class UITest3 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 3");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.Notification.WelcomeAndGoodLuck,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.Back,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.TableName,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.RoundID,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.LimitsAndPayout,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.TableLimit,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.TotalBet,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.Announcement,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.FullScreen,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.Video,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.Music,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.Voice,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.MyBets,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.Help,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.HideShowBalance,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.Balance,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.NavBar.UserSetting,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.Content.JumpTable,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.Content.HideShowToolBar,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.Content.PlayerSeats,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.BettingOption.BettingOption,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 4",
                XPath.GameTable.GameResults.GameResults,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 4",
                XPath.GameTable.HotColdNumbers.HotColdNumbers,
                5
        );

        for (String main : Variables.MAIN_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getMain(main),
                    5
            );

        for (int threeDiceTotal = 4; threeDiceTotal <= 17; threeDiceTotal++)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getThreeDiceTotal(threeDiceTotal),
                    5
            );

        for (int specificDouble = 1; specificDouble <= 6; specificDouble++)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getSpecificDouble(specificDouble),
                    5
            );

        for (int specificTriple = 1; specificTriple <= 6; specificTriple++)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getSpecificTriple(specificTriple),
                    5
            );

        for (int singleDice = 1; singleDice <= 6; singleDice++)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getSingleDice(singleDice),
                    5
            );

        for (int i = 1; i <= 6; i++)
            for (int j = 1; j <= 6; j++)
                if (i < j)
                    VerificationHandler.verifyIfDisplayed(
                            "UI Test 4",
                            XPath.GameTable.BettingOption.Option.getTwoDiceCombo(i, j),
                            5
                    );

        System.out.println();
    }

}
