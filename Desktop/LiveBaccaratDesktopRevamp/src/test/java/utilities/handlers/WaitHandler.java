package utilities.handlers;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utilities;
import utilities.objects.Locator;
import utilities.objects.Printer;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static void wait
? - public static void waitUrlToBe
? - public static void waitUrlContains
? - public static void waitVisibility
? - public static void waitInvisibility
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class WaitHandler extends Utilities {

    /*********************************************************************************************************************
     ** The 'wait' method handles waiting for a particular number of seconds.
     *********************************************************************************************************************/

    public static void wait(int seconds) {
        int millis = seconds * 1000;
        try { Thread.sleep(millis); }
        catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    /*********************************************************************************************************************
     ** The 'waitUrlToBe' method handles waiting for a specific URL.
     *********************************************************************************************************************/

    public static void waitUrlToBe(String url, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.urlToBe(url));
        } catch (Exception e) {
            String message = "Failed to wait the URL of " + url;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'waitUrlContains' method handles waiting for a particular text in the current URL.
     *********************************************************************************************************************/

    public static void waitUrlContains(String text, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.urlContains(text));
        } catch (Exception e) {
            String message = "Failed to wait \"" + text + "\" in the URL of " + driver.getCurrentUrl();
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'waitVisibility' method handles waiting for the visibility of a particular element.
     *********************************************************************************************************************/

    public static void waitVisibility(Locator locator, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath()));
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to wait the visibility of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'waitInvisibility' method handles waiting for the invisibility of a particular element.
     *********************************************************************************************************************/

    public static void waitInvisibility(Locator locator, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator.getPath()));
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to wait the invisibility of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

}
