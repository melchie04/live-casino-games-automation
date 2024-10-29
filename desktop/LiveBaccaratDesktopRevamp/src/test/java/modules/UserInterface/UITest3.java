package modules.UserInterface;

import locators.XPath;
import utilities.handlers.VerificationHandler;
import utilities.objects.Locator;

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
                XPath.GameTable.Content.PlayerSeats,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.Content.Commission,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.Predictions.Blue,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.Predictions.Red,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 3",
                XPath.GameTable.BettingOption.BettingOption,
                5
        );


        for (Locator counters : XPath.GameTable.Counters.AllCounters)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 3",
                    counters,
                    5
            );

        for (Locator roadMaps : XPath.GameTable.RoadMaps.AllRoadMaps)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 3",
                    roadMaps,
                    5
            );

        for (Locator bettingOption : XPath.GameTable.BettingOption.Option.AllBettingOptions)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 3",
                    bettingOption,
                    5
            );

        System.out.println();
    }

}
