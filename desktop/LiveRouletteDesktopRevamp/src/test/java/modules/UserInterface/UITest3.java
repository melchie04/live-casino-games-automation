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
                XPath.GameTable.GameStatistics.GameStatistics,
                5
        );

        VerificationHandler. verifyIfDisplayed(
                "UI Test 4",
                XPath.GameTable.HotColdNumbers.HotColdNumbers,
                5
        );

        for (String side : Variables.SIDE_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getSide(side),
                    5
            );

        for (String dozen : Variables.DOZEN_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getDozen(dozen),
                    5
            );

        for (int column : Variables.COLUMN_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getColumn(column),
                    5
            );

        for (int number = 0; number < 37; number++)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getStraightUp(number),
                    5
            );

        for (int[][] split : Variables.SPLIT_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getSplit(split),
                    5
            );

        for (int[][] street : Variables.STREET_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getStreet(street),
                    5
            );

        for (int[][] corner : Variables.CORNER_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getCorner(corner),
                    5
            );

        for (int[][] sixLine : Variables.SIX_LINE_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getSixLine(sixLine),
                    5
            );

        for (int[][] zeroSection : Variables.ZERO_SECTION_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getZeroSection(zeroSection),
                    5
            );

        for (int[][] zeroCorner : Variables.ZERO_CORNER_LIST)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 4",
                    XPath.GameTable.BettingOption.Option.getZeroCorner(zeroCorner),
                    5
            );

        System.out.println();
    }

}
