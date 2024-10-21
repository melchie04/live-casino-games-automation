package modules.Behavior;

import locators.XPath;
import utilities.handlers.ConditionHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest26 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 26");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(
                "BH Test 26",
                ConditionHandler.isDisplayed(XPath.GameTable.MyBets.DefaultTab, 5),
                "The Settled tab is highlighted as a default tab.",
                "The Settled tab is not highlighted as a default tab."
        );

        if (ConditionHandler.isDisplayed(XPath.GameTable.MyBets.Settled.HistoryCards, 5)) {
            VerificationHandler.verifyIfDisplayed(
                    "BH Test 26",
                    XPath.GameTable.MyBets.Settled.Total,
                    5,
                    "displayed when there is settled rounds"
            );
        } else {
            VerificationHandler.verifyIfDisplayed(
                    "BH Test 26",
                    XPath.GameTable.MyBets.Settled.DefaultTotal,
                    5,
                    "displayed when there is no settled rounds"
            );
        }

        System.out.println();
    }

}
