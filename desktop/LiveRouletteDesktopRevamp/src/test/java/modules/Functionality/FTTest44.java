package modules.Functionality;

import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Locator;

public class FTTest44 {

    private static boolean isClick = true;

    public static void verify() {
        if (isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 44");
            System.out.println("Actual Results: ");

            verifyHelpDisplay(XPath.GameTable.Help.TabMenu.Basics, XPath.GameTable.Help.Basics);
            verifyHelpDisplay(XPath.GameTable.Help.TabMenu.BetOptions, XPath.GameTable.Help.BetOptions);
            verifyHelpDisplay(XPath.GameTable.Help.TabMenu.GameControls, XPath.GameTable.Help.GameControls);
            verifyHelpDisplay(XPath.GameTable.Help.TabMenu.Likelihood, XPath.GameTable.Help.Likelihood);

            isClick = false;

        } else {

            verifyHelpHidden(XPath.GameTable.Help.TabMenu.Basics, XPath.GameTable.Help.Basics);
            verifyHelpHidden(XPath.GameTable.Help.TabMenu.BetOptions, XPath.GameTable.Help.BetOptions);
            verifyHelpHidden(XPath.GameTable.Help.TabMenu.GameControls, XPath.GameTable.Help.GameControls);
            verifyHelpHidden(XPath.GameTable.Help.TabMenu.Likelihood, XPath.GameTable.Help.Likelihood);

            System.out.println();

        }
    }

    private static void verifyHelpDisplay(Locator button, Locator container) {
        EventHandler.click(button, HandleCollection.WithScroll);

        VerificationHandler.verifyIfContained(
                "FT Test 44",
                container,
                "data-gtm",
                "Off",
                "displayed when it's clicked"
        );
    }

    private static void verifyHelpHidden(Locator button, Locator container) {
        EventHandler.click(button, HandleCollection.WithScroll);

        VerificationHandler.verifyIfNotContained(
                "FT Test 44",
                container,
                "data-gtm",
                "Off",
                "hidden when it's re-clicked"
        );
    }

}
