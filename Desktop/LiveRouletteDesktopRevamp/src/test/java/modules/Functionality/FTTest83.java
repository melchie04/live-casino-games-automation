package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FTTest83 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 83");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 83",
                XPath.GameTable.RoundResult.WonMessage,
                1
        );

        VerificationHandler.verifyIfNotDisplayed(
                "FT Test 83",
                XPath.GameTable.RoundResult.WonAmount,
                1
        );

        WaitHandler.waitVisibility(XPath.GameTable.Notification.PlaceYourBetsPlease, Variables.WAIT_PHASE_SECONDS);
        double balanceAfterDealing = Methods.getUpdatedBalance();

        CustomAssert.assertFalse(
                "FT Test 83",
                balanceAfterDealing > Variables.balanceAfterBetting,
                "The balance has not increased: " + Variables.balanceAfterBetting + " --> " + balanceAfterDealing,
                "The balance has increased: " + Variables.balanceAfterBetting + " --> " + balanceAfterDealing
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
