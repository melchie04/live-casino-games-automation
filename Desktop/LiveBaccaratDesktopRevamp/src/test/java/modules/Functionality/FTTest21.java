package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class FTTest21 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 21");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 21",
                XPath.GameTable.Notification.WelcomeAndGoodLuck,
                5
        );

        String actualTable = Methods.getTableName();

        CustomAssert.assertEquals(
                "FT Test 21",
                Variables.tableName,
                actualTable,
                "The selected table is correct: " + Variables.tableName + " == " + actualTable,
                "The selected table is not correct: " + Variables.tableName + " != " + actualTable
        );

        String actualDisplayName = GetHandler.getElements(XPath.GameTable.Content.PlayerSeats).get(3).getText();

        CustomAssert.assertEquals(
                "FT Test 21",
                Variables.username,
                actualDisplayName,
                "The display name is correct: " + Variables.username + " == " + actualDisplayName,
                "The display name is not correct: " + Variables.username + " != " + actualDisplayName
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
