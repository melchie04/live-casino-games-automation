package modules.UserInterface;

import globals.Variables;
import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Locator;

public class UITest2 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 2");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(
                "UI Test 2",
                ConditionHandler.isUrlContains("/gameLobby", 15) ||
                        ConditionHandler.isUrlContains("/rouletteDesktop", 15),
                "The Live Roulette Desktop Revamp is launched.",
                "The Live Roulette Desktop Revamp is not launched."
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.Back,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.Announcement,
                5
        );

        if (ConditionHandler.isDisplayed(XPath.GameLobby.NavBar.NewAnnouncementIndicator, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 2",
                    XPath.GameLobby.NavBar.AnnouncementMarquee,
                    5
            );
        }

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.FullScreen,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.MyBets,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.Help,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.HideShowBalance,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.Balance,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.NavBar.UserSetting,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Header.getProductName(Variables.productName),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Header.getTableLimits(Variables.productName),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Header.getDateTime(Variables.productName),
                5
        );

        for (Locator sideOption : XPath.GameLobby.SideMenu.AllSideMenuOptions)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 2",
                    sideOption,
                    5
            );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.SideMenu.ActiveSideMenuOption,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Content.getTables(Variables.productName),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Content.getNumberOfDeals(Variables.productName),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Content.getTableNames(Variables.productName),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Content.getDealerPhotos(Variables.productName),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Content.getDealerNames(Variables.productName),
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Content.getShowTimer(Variables.productName),
                Variables.WAIT_PHASE_SECONDS
        );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.Content.getShowDealing(Variables.productName),
                Variables.WAIT_PHASE_SECONDS
        );

        for (Locator counter : XPath.GameLobby.ResultHistory.AllCounters)
            VerificationHandler.verifyIfDisplayed(
                    "UI Test 2",
                    counter,
                    5
            );

        VerificationHandler.verifyIfDisplayed(
                "UI Test 2",
                XPath.GameLobby.ResultHistory.ResultHistory,
                5
        );

        System.out.println();
    }

}
