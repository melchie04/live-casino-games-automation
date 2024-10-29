package modules.Functionality;

import globals.Variables;
import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class FTTest20 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 20");
        System.out.println("Actual Results: ");

        for (WebElement tableLimit : GetHandler.getElements(XPath.GameLobby.Header.getTableLimits(Variables.productName))) {
            EventHandler.click(tableLimit);
            int tableCount = GetHandler.getElements(XPath.GameLobby.Content.getTables(Variables.productName)).size();
            String message = "** The table limit " + tableLimit.getText() + " has " + tableCount + " table/s available.";
            CustomAssert.assertNotEquals(
                    "FT Test 20",
                    0,
                    tableCount,
                    message,
                    message
            );
        }

        System.out.println();
    }

}
