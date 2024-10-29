package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class FTTest46 {

    private static boolean isClick = true;

    public static void verify() {
        String actualBalance = GetHandler.getText(XPath.GameTable.NavBar.Balance);

        if (isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 46");
            System.out.println("Actual Results: ");

            CustomAssert.assertTrue(
                    "FT Test 46",
                    actualBalance.contains("THB"),
                    "The currency is correct.",
                    "The currency is not correct."
            );

            CustomAssert.assertEquals(
                    "FT Test 46",
                    "THB",
                    actualBalance,
                    "The balance is hidden when the Balance Button is clicked: " + actualBalance,
                    "The balance is not hidden when the Balance Button is clicked: " + actualBalance
            );

            isClick = false;

        } else {

            CustomAssert.assertNotEquals(
                    "FT Test 46",
                    "THB",
                    actualBalance,
                    "The balance is displayed when the Balance Button re-clicked: " + actualBalance,
                    "The balance is not displayed when the Balance Button re-clicked: " + actualBalance
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

}
