package modules.Functionality;

import locators.XPath;
import utilities.Utilities;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FTTest35 extends Utilities {

    private static boolean isClick = true;

    public static void verify() {
        if (isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 35");
            System.out.println("Actual Results: ");

            CustomAssert.assertTrue(
                    "FT Test 35",
                    jsExecutor.executeScript("return document.fullscreenElement;") != null,
                    "The Game Table Page is in full-screen mode when the Fullscreen Button is clicked.",
                    "The Game Table Page is not in full-screen mode when the Fullscreen Button is clicked."
            );

            isClick = false;

        } else {

            CustomAssert.assertTrue(
                    "FT Test 35",
                    jsExecutor.executeScript("return document.fullscreenElement;") == null,
                    "The Game Table Page is in normal screen mode when the Fullscreen Button is re-clicked.",
                    "The Game Table Page is not in normal screen mode when the Fullscreen Button is re-clicked."
            );

            System.out.println();
            EventHandler.click(XPath.GameTable.NavBar.Back);

        }
    }

}
