package modules.Functionality;

import utilities.Utilities;
import utilities.objects.CustomAssert;

public class FTTest8 extends Utilities {

    private static boolean isClick = true;

    public static void verify() {
        if (isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 8");
            System.out.println("Actual Results: ");

            CustomAssert.assertTrue(
                    "FT Test 8",
                    jsExecutor.executeScript("return document.fullscreenElement;") != null,
                    "The Game Lobby Page is in full-screen mode when the Fullscreen Button is clicked.",
                    "The Game Lobby Page is not in full-screen mode when the Fullscreen Button is clicked."
            );

            isClick = false;

        } else {

            CustomAssert.assertTrue(
                    "FT Test 8",
                    jsExecutor.executeScript("return document.fullscreenElement;") == null,
                    "The Game Lobby Page is in normal screen mode when the Fullscreen Button is re-clicked.",
                    "The Game Lobby Page is not in normal screen mode when the Fullscreen Button is re-clicked."
            );

            System.out.println();

        }
    }

}
