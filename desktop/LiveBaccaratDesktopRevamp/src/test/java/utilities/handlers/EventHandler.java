package utilities.handlers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.Utilities;
import utilities.enums.HandleCollection;
import utilities.objects.Locator;
import utilities.objects.Printer;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static void sendKeys
? - public static void select
? - public static void click
? - public static void scroll
? - public static void pressAndHold
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class EventHandler extends Utilities {

    /*********************************************************************************************************************
     ** The 'sendKeys' method is used for inputting data into the located element.
     *********************************************************************************************************************/

    public static void sendKeys(Locator locator, String input) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath())).sendKeys(input);
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to input \"" + input + "\" in \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'select' method is used for selecting an option within the located element.
     *********************************************************************************************************************/

    public static void select(Locator locator, String value) {
        try {
            new Select(wait.until(ExpectedConditions.elementToBeClickable(locator.getPath()))).selectByVisibleText(value);
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to select \"" + value + "\" in \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the located element.
     *********************************************************************************************************************/

    public static void click(Locator locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator.getPath())).click();
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to click \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the located element with exception or with scroll.
     *********************************************************************************************************************/

    public static void click(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(locator.getPath())).click();
                } catch (Exception e) { /* Exclude the exception. */ }
                break;
            case WithScroll:
                try {
                    WebElement element = driver.findElement(locator.getPath());
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to click \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
                break;
            case WithJavaScript:
                try {
                    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator.getPath()));
                    jsExecutor.executeScript("arguments[0].click();", element);
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to click \"" + name + "\" " + type + " on " + page + " with JavaScript";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
                break;
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the located element after waiting a few seconds.
     *********************************************************************************************************************/

    public static void click(int seconds, Locator locator) {
        try {
            WaitHandler.wait(seconds);
            wait.until(ExpectedConditions.elementToBeClickable(locator.getPath())).click();
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to wait " + seconds + " seconds then click \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the located element before waiting a few seconds.
     *********************************************************************************************************************/

    public static void click(Locator locator, int seconds) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator.getPath())).click();
            WaitHandler.wait(seconds);
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to click \"" + name + "\" " + type + " on " + page + " then wait " + seconds + " seconds";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the element directly.
     *********************************************************************************************************************/

    public static void click(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            String message = "Failed to click \"" + element.getText() + "\" web element";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the element directly with exception or with scroll.
     *********************************************************************************************************************/

    public static void click(WebElement element, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                } catch (Exception e) { /* Exclude the exception. */ }
                break;
            case WithScroll:
                try {
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                } catch (Exception e) {
                    String message = "Failed to click \"" + element.getText() + "\" web element with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
                break;
            case WithJavaScript:
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(element));
                    jsExecutor.executeScript("arguments[0].click();", element);
                } catch (Exception e) {
                    String message = "Failed to click \"" + element.getText() + "\" web element with JavaScript";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
                break;
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the element directly before waiting a few seconds.
     *********************************************************************************************************************/

    public static void click(int seconds, WebElement element) {
        try {
            WaitHandler.wait(seconds);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            String message = "Failed to click \"" + element.getText() + "\" web element" + " then wait " + seconds + " seconds";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the element directly before waiting a few seconds.
     *********************************************************************************************************************/

    public static void click(WebElement element, int seconds) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            WaitHandler.wait(seconds);
        } catch (Exception e) {
            String message = "Failed to click \"" + element.getText() + "\" web element" + " then wait " + seconds + " seconds";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking a specific coordinates on a web page.
     *********************************************************************************************************************/

    public static void click(int xCoordinate, int yCoordinate) {
        try {
            actions.moveByOffset(xCoordinate, yCoordinate).click().perform();
        } catch (Exception e) {
            String message = "Failed to click in location of {" + xCoordinate + ", " + yCoordinate + "}";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'scroll' method is used to navigate and view the located element.
     *********************************************************************************************************************/

    public static void scroll(Locator locator) {
        try {
            WebElement element = driver.findElement(locator.getPath());
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to scroll \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'scroll' method is used to navigate and view the element directly.
     *********************************************************************************************************************/

    public static void scroll(WebElement element) {
        try {
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            String message = "Failed to scroll \"" + element.getText() + "\" web element";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'pressAndHold' method is used to press and hold the located element for a specific duration.
     *********************************************************************************************************************/

    public static void pressAndHold(Locator locator, int seconds) {
        try {
            int millis = seconds * 1000;
            actions.clickAndHold(wait.until(ExpectedConditions.elementToBeClickable(locator.getPath()))).perform();
            actions.pause(millis).perform();
            actions.release().perform();
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to press and hold \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

}
