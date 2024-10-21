package modules.Functionality;

import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FTTest59 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 59");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 59",
                XPath.GameTable.RoadMaps.Predictions,
                5,
                "displayed when the Banker Prediction is clicked"
        );

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

}
