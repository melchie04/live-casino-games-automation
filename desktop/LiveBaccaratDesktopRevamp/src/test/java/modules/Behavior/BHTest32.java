package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class BHTest32 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 32");
        System.out.println("Actual Results: ");

        String actualTableName = GetHandler.getText(XPath.GameTable.JumpTable.ActiveProductName);

        CustomAssert.assertEquals(
                "BH Test 32",
                Variables.tableName.split(" ")[0],
                actualTableName,
                "The selected " + actualTableName + " product is highlighted.",
                "The selected " + actualTableName + " product is not highlighted."
        );

        EventHandler.scroll(XPath.GameTable.JumpTable.YouAreHere);
        String tableInitial = Variables.tableName.split(" ")[1];

        CustomAssert.assertEquals(
                "BH Test 32",
                "Table " + tableInitial,
                GetHandler.getText(XPath.GameTable.JumpTable.ActiveTableName),
                "The selected table " + tableInitial + " is highlighted.",
                "The selected table " + tableInitial + " is not highlighted."
        );

        VerificationHandler.verifyIfDisplayed(
                "BE Test 32",
                XPath.GameTable.JumpTable.getBetIndicator("Table " + tableInitial),
                5,
                "displayed when there is a confirmed bet"
        );

        System.out.println();
    }

}
