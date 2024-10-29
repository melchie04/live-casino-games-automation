package modules.Behavior;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest6 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 6");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(
                "BH Test 6",
                ConditionHandler.isDisplayed(XPath.GameLobby.MyBets.DefaultTab, 5),
                "The Settled tab is highlighted as a default tab.",
                "The Settled tab is not highlighted as a default tab."
        );

        if (ConditionHandler.isDisplayed(XPath.GameLobby.MyBets.Settled.HistoryCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "BH Test 6",
                    XPath.GameLobby.MyBets.Settled.Total,
                    5,
                    "displayed when there is settled rounds"
            );
        } else {
            VerificationHandler.verifyIfDisplayed(
                    "BH Test 6",
                    XPath.GameLobby.MyBets.Settled.DefaultTotal,
                    5,
                    "displayed when there is no settled rounds"
            );
        }

        System.out.println();
    }

}
