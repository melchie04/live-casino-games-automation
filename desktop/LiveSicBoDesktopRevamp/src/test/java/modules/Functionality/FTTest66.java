package modules.Functionality;

import globals.Variables;
import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FTTest66 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 66");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(
                "FT Test 66",
                XPath.GameTable.Notification.RememberedChipSettings,
                5
        );

        String[] actualChipOptions = GetHandler.getTextArray(XPath.GameTable.ToolBar.DefaultChips);

        CustomAssert.assertTrue(
                "FT Test 66",
                Helper.contains(Variables.ADDED_CHIP, actualChipOptions),
                "The " + Variables.REMOVED_CHIP + " chip is changed to " + Variables.ADDED_CHIP + ": " + Helper.toString(actualChipOptions),
                "The " + Variables.REMOVED_CHIP + " chip is not changed to " + Variables.ADDED_CHIP + ": " + Helper.toString(actualChipOptions)
        );

        System.out.println();
        setDefaultChips();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    private static void setDefaultChips() {
        EventHandler.click(3, XPath.GameTable.ToolBar.EditChips);
        for (WebElement myChip : GetHandler.getElements(XPath.GameTable.ChipSetting.MyChips))
            EventHandler.click(myChip);
        EventHandler.click(XPath.GameTable.ChipSetting.getChipSelection("1"));
        EventHandler.click(XPath.GameTable.ChipSetting.getChipSelection("5"));
        EventHandler.click(XPath.GameTable.ChipSetting.getChipSelection("10"));
        EventHandler.click(XPath.GameTable.ChipSetting.getChipSelection("25"));
        EventHandler.click(XPath.GameTable.ChipSetting.Save);
    }

}
