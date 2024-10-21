package utilities.handlers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Utilities;
import utilities.objects.Printer;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Set;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static void goToWebsite
? - private static int getStatus
? - public static void refresh
? - public static void switchToAnotherWindow
? - public static void switchBackToMainWindow
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class NavigationHandler extends Utilities {

    /*********************************************************************************************************************
     ** The 'capture' method is used to capture a screenshot in case of failure in every test scenario.
     *********************************************************************************************************************/

    public static void goToWebsite() {
        try {
            driver.get(AccountHandler.getUrl());
            if (getStatus() == 404) throw new RuntimeException("404 not found error");
        } catch (Exception e) {
            String message = "Failed to go to the URL of " + AccountHandler.getUrl();
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getStatus' method is used to get the status of navigating to the website.
     *********************************************************************************************************************/

    private static int getStatus() {
        try {
            URL url = new URI(driver.getCurrentUrl()).toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            return connection.getResponseCode();
        } catch (Exception e) { return -1; }
    }

    /*********************************************************************************************************************
     ** The 'reload' method is used for reloading the website.
     *********************************************************************************************************************/

    public static void reload() {
        try {
            jsExecutor.executeScript("location.reload();");
            if (getStatus() == 404) throw new RuntimeException("404 not found error");
        } catch (Exception e) {
            String message = "Failed to reload the website";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'switchToAnotherWindow' method is used for switching to another window.
     *********************************************************************************************************************/

    public static void switchToAnotherWindow() {
        try {
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            Set<String> windowHandles = driver.getWindowHandles();
            String newWindowHandle = "";
            for (String windowHandle : windowHandles) {
                if (!windowHandle.equals(originalWindowHandle)) {
                    newWindowHandle = windowHandle;
                    break;
                }
            }
            driver.switchTo().window(newWindowHandle);
            driver.manage().window().setSize(new Dimension(1600, 1000));
            WaitHandler.wait(5);
        } catch (Exception e) {
            String message = "Failed to switch to another window";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'switchBackToMainWindow' method is used for switching to main window.
     *********************************************************************************************************************/

    public static void switchBackToMainWindow() {
        try {
            driver.switchTo().window(originalWindowHandle);
            WaitHandler.wait(5);
        } catch (Exception e) {
            String message = "Failed to switch to main window";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

}
