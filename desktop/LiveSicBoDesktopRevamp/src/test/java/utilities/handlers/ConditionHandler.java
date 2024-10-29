package utilities.handlers;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utilities;
import utilities.objects.Locator;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static boolean isUrlContains
? - public static boolean isDisplayed
? - public static boolean isPresent
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class ConditionHandler extends Utilities {

    /*********************************************************************************************************************
     ** The 'isUrlContains' method checks if the URL contains a specific text.
     *********************************************************************************************************************/

    public static boolean isUrlContains(String text, int seconds) {
        try {
            new WebDriverWait(driver, seconds).until(ExpectedConditions.urlContains(text));
            return true;
        } catch (Exception e) { return false; }
    }

    /*********************************************************************************************************************
     ** The 'isDisplayed' method checks if the element is visible.
     *********************************************************************************************************************/

    public static boolean isDisplayed(Locator locator, int seconds) {
        try {
            new WebDriverWait(driver, seconds)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator.getPath()));
            return true;
        } catch (Exception e) { return false; }
    }

    /*********************************************************************************************************************
     ** The 'isEnabled' method checks if the element is enabled.
     *********************************************************************************************************************/

    public static boolean isEnabled(Locator locator, int seconds) {
        try {
            new WebDriverWait(driver, seconds)
                    .until(ExpectedConditions.elementToBeClickable(locator.getPath()));
            return true;
        } catch (Exception e) { return false; }
    }

    /*********************************************************************************************************************
     ** The 'isPresent' method checks if the element is present.
     *********************************************************************************************************************/

    public static boolean isPresent(Locator locator, int seconds) {
        try {
            new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
            return true;
        } catch (Exception e) { return false; }
    }

}
