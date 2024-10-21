package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FTTest57 {

    private static boolean isClick = true;

    public static void verify() {
        String[] nonCommText = GetHandler.getTextArray(XPath.GameTable.BettingOption.NonCommIndicators);

        if (isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 57");
            System.out.println("Actual Results: ");

            CustomAssert.assertTrue(
                    "FT Test 57",
                    Helper.find("1 : 1", nonCommText),
                    "The \"1 : 1\" is displayed when it's commission.",
                    "The \"1 : 1\" is not displayed when it's commission."
            );

            CustomAssert.assertTrue(
                    "FT Test 57",
                    Helper.find("Non Comm", nonCommText),
                    "The \"Non Comm\" is displayed when it's commission.",
                    "The \"Non Comm\" is not displayed when it's commission."
            );

            CustomAssert.assertTrue(
                    "FT Test 57",
                    Helper.find("Banker wins 6 pay half", nonCommText),
                    "The \"Banker wins 6 pay half\" is displayed when it's commission.",
                    "The \"Banker wins 6 pay half\" is not displayed when it's commission.");

            CustomAssert.assertFalse(
                    "FT Test 57",
                    Helper.find("0.95 : 1", nonCommText),
                    "The \"0.95 : 1\" is hidden when it's commission.",
                    "The \"0.95 : 1\" is not hidden when it's commission.");

            isClick = false;

        } else {

            CustomAssert.assertFalse(
                    "FT Test 57",
                    Helper.find("1 : 1", nonCommText),
                    "The \"1 : 1\" is hidden when it's non-commission.",
                    "The \"1 : 1\" is not hidden when it's non-commission."
            );

            CustomAssert.assertFalse(
                    "FT Test 57",
                    Helper.find("Non Comm", nonCommText),
                    "The \"Non Comm\" is hidden when it's non-commission .",
                    "The \"Non Comm\" is not hidden when it's non-commission."
            );

            CustomAssert.assertFalse(
                    "FT Test 57",
                    Helper.find("Banker wins 6 pay half", nonCommText),
                    "The \"Banker wins 6 pay half\" is hidden when it's non-commission.",
                    "The \"Banker wins 6 pay half\" is not hidden when it's non-commission.");

            CustomAssert.assertTrue(
                    "FT Test 57",
                    Helper.find("0.95 : 1", nonCommText),
                    "The \"0.95 : 1\" is displayed when it's non-commission.",
                    "The \"0.95 : 1\" is not displayed when it's non-commission.");

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

}
