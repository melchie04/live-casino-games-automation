package modules.Functionality;

import globals.Variables;
import locators.XPath;
import org.testng.SkipException;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class FTTest53 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 53");
        System.out.println("Actual Results: ");

        if (!ConditionHandler.isDisplayed(XPath.GameTable.Notification.AllSeatsAreOccupied, 1)) {

            WaitHandler.wait(3);
            String actualTableName = GetHandler.getText(XPath.GameTable.NavBar.TableName);

            CustomAssert.assertTrue(
                    "FT Test 53",
                    actualTableName.contains(Variables.tableName),
                    "The selected table is correct: " + Variables.tableName + " --> " + actualTableName,
                    "The selected table is not correct: " + Variables.tableName + " --> " + actualTableName
            );

            VerificationHandler.verifyIfNotDisplayed(
                    "FT Test 53",
                    XPath.GameTable.JumpTable.JumpTable,
                    1,
                    "closed"
            );

        } else throw new SkipException("All Seats Are Occupied in the " + Variables.tableName);

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
