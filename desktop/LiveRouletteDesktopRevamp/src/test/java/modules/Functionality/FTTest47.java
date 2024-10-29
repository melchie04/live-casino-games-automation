package modules.Functionality;

import locators.XPath;
import utilities.handlers.VerificationHandler;

public class FTTest47 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 47");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 47",
                XPath.GameLobby.UserSetting.UserName,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 47",
                XPath.GameLobby.UserSetting.LightMode,
                5
        );

        VerificationHandler.verifyIfDisplayed(
                "FT Test 47",
                XPath.GameLobby.UserSetting.DarkMode,
                5
        );

        VerificationHandler.verifyIfContained(
                "FT Test 47",
                XPath.GameLobby.UserSetting.LightMode,
                "class",
                "active",
                "the default theme"
        );

        System.out.println();
    }

}
