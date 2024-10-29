package modules.Functionality;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class FTTest30 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 30");
        System.out.println("Actual Results: ");

        String newTableLimit = GetHandler.getText(XPath.GameTable.NavBar.TableLimit);

        CustomAssert.assertNotEquals(
                "FT Test 30",
                Variables.tableLimit,
                newTableLimit,
                "The table limit is changed: " + Variables.tableLimit + " --> " + newTableLimit,
                "The table limit is not changed: " + Variables.tableLimit + " --> " + newTableLimit
        );

        String newTableName = GetHandler.getText(XPath.GameTable.NavBar.TableName);

        CustomAssert.assertNotEquals(
                "FT Test 30",
                Variables.tableName,
                newTableName,
                "The table name is changed: " + Variables.tableName + " --> " + newTableName,
                "The table name is not changed: " + Variables.tableName + " --> " + newTableName
        );

        String newRoundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);

        CustomAssert.assertEquals(
                "FT Test 30",
                Variables.roundID,
                newRoundID,
                "The round ID is remained: " + Variables.roundID + " --> " + newRoundID,
                "The round ID is not remained: " + Variables.roundID + " --> " + newRoundID
        );

        EventHandler.click(XPath.GameTable.NavBar.LimitsAndPayout);

        CustomAssert.assertEquals(
                "FT Test 30",
                Variables.MINIMUM_BET_LIMIT,
                Integer.parseInt(GetHandler.getText(XPath.GameTable.LimitsAndPayout.MinimumBetLimit).split("-")[0].replaceAll(" ", "")),
                "The selected table limit is applied in the bet limit of the Limits & Payout Panel.",
                "The selected table limit is not applied in the bet limit of the Limits & Payout Panel."
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
