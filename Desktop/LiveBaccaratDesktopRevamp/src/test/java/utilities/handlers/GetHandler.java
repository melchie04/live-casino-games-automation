package utilities.handlers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Utilities;
import utilities.enums.HandleCollection;
import utilities.objects.Locator;
import utilities.objects.Printer;

import java.util.List;
import java.util.Random;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static WebElement getElementByRandom
? - public static List<WebElement> getElements
? - public static String getAttribute
? - public static String getText
? - public static String[] getTextArray
? - public static double getDouble
? - public static double[] getDoubleArray
? - public static int getInt
? - public static int[] getIntArray
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class GetHandler extends Utilities {

    /*********************************************************************************************************************
     ** The 'getElementByRandom' method handles the retrieval of a random element from the located elements.
     *********************************************************************************************************************/

    public static WebElement getElementByRandom(Locator locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
            List<WebElement> elements = driver.findElements(locator.getPath());
            return elements.get(new Random().nextInt(elements.size()));
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get random element of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getElementByRandom' method handles the retrieval of a random element from the located elements
     **                 with exception or with scroll.
     *********************************************************************************************************************/

    public static WebElement getElementByRandom(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    return elements.get(new Random().nextInt(elements.size()));
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    WebElement element = elements.get(new Random().nextInt(elements.size()));
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return element;
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get random element of \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getElements' method handles the retrieval of the located elements.
     *********************************************************************************************************************/

    public static List<WebElement> getElements(Locator locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
            return driver.findElements(locator.getPath());
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the elements of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getElements' method handles the retrieval of the located elements with exception or with scroll.
     *********************************************************************************************************************/

    public static List<WebElement> getElements(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    return driver.findElements(locator.getPath());
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    for (WebElement element : elements)
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return elements;
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the elements of \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getAttribute' method handles the retrieval of the attribute of the located element.
     *********************************************************************************************************************/

    public static String getAttribute(Locator locator, String attribute) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath())).getAttribute(attribute);
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the attribute of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getAttribute' method handles the retrieval of the attribute of the located element
     **             with exception or with scroll.
     *********************************************************************************************************************/

    public static String getAttribute(Locator locator, String attribute, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    return wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath())).getAttribute(attribute);
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    WebElement element = driver.findElement(locator.getPath());
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return element.getAttribute(attribute);
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the attribute of \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getText' method handles the retrieval of the text of the located element.
     *********************************************************************************************************************/

    public static String getText(Locator locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath())).getText();
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the text of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getText' method handles the retrieval of the text of the located element with exception or with scroll.
     *********************************************************************************************************************/

    public static String getText(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath())).getText();
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    WebElement element = driver.findElement(locator.getPath());
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return element.getText();
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the text of \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getTextArray' method handles the retrieval of the list of text from each located element.
     *********************************************************************************************************************/

    public static String[] getTextArray(Locator locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
            List<WebElement> elements = driver.findElements(locator.getPath());
            return elements.parallelStream().map(WebElement::getText).toArray(String[]::new);
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the text of \"" + name + "\" " + type + " on " + page + " with scroll";
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getTextArray' method handles the retrieval of the list of text from each located element
     **             with exception or with scroll.
     *********************************************************************************************************************/

    public static String[] getTextArray(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    return elements.parallelStream().map(WebElement::getText).toArray(String[]::new);
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    String[] textArray = new String[elements.size()];
                    for (int i = 0; i < elements.size(); i++) {
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
                        textArray[i] = elements.get(i).getText();
                    }
                    return textArray;
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the list of text from \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getDouble' method handles the retrieval of the double of the located element.
     *********************************************************************************************************************/

    public static double getDouble(Locator locator) {
        try {
            return Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath()))
                    .getText().replaceAll("[^0-9.-]+", ""));
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the double of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getDouble' method handles the retrieval of the double of the located element with exception or with scroll.
     *********************************************************************************************************************/

    public static double getDouble(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    return Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath()))
                            .getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) { return 0.0; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    WebElement element = driver.findElement(locator.getPath());
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return Double.parseDouble(element.getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the double of \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getDoubleArray' method handles the retrieval of the list of double from each located element.
     *********************************************************************************************************************/

    public static double[] getDoubleArray(Locator locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
            List<WebElement> elements = driver.findElements(locator.getPath());
            return elements.parallelStream().map(WebElement::getText).map(s -> s.replaceAll("[^0-9.-]+", ""))
                    .filter(s -> !s.isEmpty()).mapToDouble(Double::parseDouble).toArray();
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the list of double from \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getDoubleArray' method handles the retrieval of the list of double from each located element
     **             with exception or with scroll.
     *********************************************************************************************************************/

    public static double[] getDoubleArray(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    return elements.parallelStream().map(WebElement::getText).map(s -> s.replaceAll("[^0-9.-]+", ""))
                            .filter(s -> !s.isEmpty()).mapToDouble(Double::parseDouble).toArray();
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    double[] doubleArray = new double[elements.size()];
                    for (int i = 0; i < elements.size(); i++) {
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
                        doubleArray[i] = Double.parseDouble(elements.get(i).getText().replaceAll("[^0-9.-]+", ""));
                    }
                    return doubleArray;
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the list of double from \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getInt' method handles the retrieval of the integer of the located element
     *********************************************************************************************************************/

    public static int getInt(Locator locator) {
        try {
            return Integer.parseInt(wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath()))
                    .getText().replaceAll("[^0-9.-]+", ""));
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the integer of \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getInt' method handles the retrieval of the integer of the located element with exception or with scroll.
     *********************************************************************************************************************/

    public static int getInt(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    return Integer.parseInt(wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getPath()))
                            .getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) { return 0; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    WebElement element = driver.findElement(locator.getPath());
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return Integer.parseInt(element.getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the integer of \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getIntArray' method handles the retrieval of the list of integer from each located element.
     *********************************************************************************************************************/

    public static int[] getIntArray(Locator locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
            List<WebElement> elements = driver.findElements(locator.getPath());
            return elements.parallelStream().map(WebElement::getText).map(s -> s.replaceAll("[^0-9.-]+", ""))
                    .filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).toArray();
        } catch (Exception e) {
            String name = locator.getName();
            String type = locator.getType();
            String page = locator.getLocation();
            String message = "Failed to get the list of integer from \"" + name + "\" " + type + " on " + page;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'getIntArray' method handles the retrieval of the list of integer from each located element
     **             with exception or with scroll.
     *********************************************************************************************************************/

    public static int[] getIntArray(Locator locator, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    return elements.parallelStream().map(WebElement::getText).map(s -> s.replaceAll("[^0-9.-]+", ""))
                            .filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).toArray();
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
                    List<WebElement> elements = driver.findElements(locator.getPath());
                    int[] intArray = new int[elements.size()];
                    for (int i = 0; i < elements.size(); i++) {
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
                        intArray[i] = Integer.parseInt(elements.get(i).getText().replaceAll("[^0-9.-]+", ""));
                    }
                    return intArray;
                } catch (Exception e) {
                    String name = locator.getName();
                    String type = locator.getType();
                    String page = locator.getLocation();
                    String message = "Failed to get the list of integer from \"" + name + "\" " + type + " on " + page + " with scroll";
                    Printer.printError(message);
                    throw new RuntimeException(message, e);
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

}
