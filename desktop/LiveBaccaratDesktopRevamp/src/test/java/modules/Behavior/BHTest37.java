package modules.Behavior;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest37 {

    private static boolean isClick = true;

    public static void verify() {
        if (isClick) {

            System.out.println();
            System.out.println("Module: BEHAVIOR");
            System.out.println("Test Case: 37");
            System.out.println("Actual Results: ");

            CustomAssert.assertEquals(
                    "BH Test 37",
                    "Non Comm",
                    GetHandler.getText(XPath.GameTable.Content.CommissionText),
                    "The toggle button is changed to \"Non Comm\" when it's clicked.",
                    "The toggle button is not changed to \"Non Comm\" when it's clicked.");

            VerificationHandler.verifyIfContained(
                    "BH Test 37",
                    XPath.GameTable.Content.CommissionToggle,
                    "data-gtm",
                    "CommOff",
                    "in the right side when it's clicked"
            );

            isClick = false;

        } else {

            CustomAssert.assertEquals(
                    "BH Test 37",
                    "Comm",
                    GetHandler.getText(XPath.GameTable.Content.CommissionText),
                    "The toggle button is changed to \"Comm\" when it's re-clicked.",
                    "The toggle button is not changed to \"Comm\" when it's re-clicked.");

            VerificationHandler.verifyIfContained(
                    "BH Test 37",
                    XPath.GameTable.Content.CommissionToggle,
                    "data-gtm",
                    "CommOn",
                    "in the left side when it's re-clicked"
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

}
