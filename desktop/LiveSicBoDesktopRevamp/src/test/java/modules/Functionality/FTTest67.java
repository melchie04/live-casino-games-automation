package modules.Functionality;

import globals.Methods;
import globals.Variables;
import locators.XPath;
import org.openqa.selenium.WebElement;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FTTest67 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 67");
        System.out.println("Actual Results: ");

        Methods.waitBettingPhase(20, false);
        WaitHandler.wait(3);
        int expectedBet = 0;
        for (WebElement chipOption : GetHandler.getElements(XPath.GameTable.ToolBar.DefaultChips)) {
            EventHandler.click(chipOption);
            EventHandler.click(Variables.DEFAULT_BETTING_OPTION);
            int chipValue = getChipValue(chipOption);
            expectedBet += chipValue;
            int actualBet = Methods.getChipValue(Variables.DEFAULT_BETTING_CHIP);
            CustomAssert.assertEquals(
                    "FT Test 67",
                    expectedBet,
                    actualBet,
                    "The " + chipValue + " placed bet is added to the " + Variables.DEFAULT_BETTING_OPTION.getName() + ": " + actualBet,
                    "The " + chipValue + " placed bet is not added to the " + Variables.DEFAULT_BETTING_OPTION.getName() + ": " + actualBet
            );
        }

        System.out.println();
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }
    
    public static int getChipValue(WebElement chip) {
        String chipText = chip.getText().toLowerCase().replace("+","");
        if (chipText.endsWith("k")) {
            return (int) (Double.parseDouble(chipText.replace("k", "")) * 1000);
        } else if (chipText.endsWith("m")) {
            return (int) (Double.parseDouble(chipText.replace("m", "")) * 1000000);
        }
        return switch (chipText) {
            case "1" -> 1;
            case "5" -> 5;
            case "10" -> 10;
            case "25" -> 25;
            case "100" -> 100;
            case "500" -> 500;
            default -> Integer.parseInt(chipText.replaceAll("[^0-9.-]+", ""));
        };
    }

}
