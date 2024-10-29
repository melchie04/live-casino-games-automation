package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FTTest19 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 19");
        System.out.println("Actual Results: ");

        WaitHandler.wait(3);
        String expectedTableLimit = Variables.TABLE_LIMIT.replace(" ", "");
        String actualTableLimit = GetHandler.getText(XPath.GameTable.NavBar.TableLimit).replace("\n", "").replace("\r", "");
        int[] expectedLimit = getTableLimitValue(Variables.TABLE_LIMIT);
        int[] actualLimit = getTableLimitValue(GetHandler.getText(XPath.GameTable.NavBar.TableLimit));

        CustomAssert.assertTrue(
                "FT Test 19",
                actualLimit[0] == expectedLimit[0] && expectedLimit[1] >= actualLimit[1],
                "The selected table limit is correct: " + actualTableLimit + " == " + expectedTableLimit,
                "The selected table limit is not correct: " + actualTableLimit + " != " + expectedTableLimit
        );

        EventHandler.click(XPath.GameTable.NavBar.LimitsAndPayout);

        CustomAssert.assertEquals(
                "FT Test 19",
                Variables.MINIMUM_BET_LIMIT,
                Integer.parseInt(GetHandler.getText(XPath.GameTable.LimitsAndPayout.MinimumBetLimit).split("-")[0].replaceAll(" ", "")),
                "The selected table limit is applied in the bet limit of the Limits & Payout Panel.",
                "The selected table limit is not applied in the bet limit of the Limits & Payout Panel."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static int[] getTableLimitValue(String tableLimit) {
        String[] array = tableLimit.replaceAll("\\n", "")
                .replaceAll(" ", "")
                .split("/");
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            String text = array[i].replace("+", "");
            if (text.endsWith("K")) {
                result[i] = (int) Double.parseDouble(text.substring(0, text.length() - 1)) * 1000;
            } else {
                result[i] = Integer.parseInt(text);
            }
        }
        return result;
    }

}
