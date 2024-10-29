package modules.Behavior;

import globals.Methods;
import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class BHTest41 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 41");
        System.out.println("Actual Results: ");

        Methods.waitBettingPhase(20, false);
        WaitHandler.wait(3);
        for (WebElement chipOption : GetHandler.getElements(XPath.GameTable.ToolBar.DefaultChips)) {
            EventHandler.click(chipOption);
            CustomAssert.assertTrue(
                    "BH Test 41",
                    chipOption.getAttribute("class").contains("active"),
                    "The " + chipOption.getText() + " chip is highlighted.",
                    "The " + chipOption.getText() + " chip is not highlighted."
            );
        }

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
