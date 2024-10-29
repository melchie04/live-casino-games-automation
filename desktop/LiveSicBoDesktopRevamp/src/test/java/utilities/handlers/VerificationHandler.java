package utilities.handlers;

import utilities.objects.CustomAssert;
import utilities.objects.Locator;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static void verifyIfDisplayed
? - public static void verifyIfNotDisplayed
? - public static void verifyIfContained
? - public static void verifyIfNotContained
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class VerificationHandler {

    /*********************************************************************************************************************
     ** The 'verifyIfDisplayed' method is used to confirm the visibility of an element
     *********************************************************************************************************************/

    public static void verifyIfDisplayed(String testCase, Locator locator, int seconds) {
        String name = locator.getName();
        String type = locator.getType();
        String location = locator.getLocation();
        CustomAssert.assertTrue(
                testCase,
                ConditionHandler.isDisplayed(locator, seconds),
                "The \"" + name + "\" " + type + " in the " + location + " is displayed.",
                "The \"" + name + "\" " + type + " in the " + location + " is not displayed."
        );
    }

    public static void verifyIfDisplayed(String testCase, Locator locator, int seconds, String message) {
        String name = locator.getName();
        String type = locator.getType();
        String location = locator.getLocation();
        CustomAssert.assertTrue(
                testCase,
                ConditionHandler.isDisplayed(locator, seconds),
                "The \"" + name + "\" " + type + " in the " + location + " is " + message + ".",
                "The \"" + name + "\" " + type + " in the " + location + " is not " + message + "."
        );
    }

    /*********************************************************************************************************************
     ** The 'verifyIfNotDisplayed' method is used to confirm the invisibility of an element
     *********************************************************************************************************************/

    public static void verifyIfNotDisplayed(String testCase, Locator locator, int seconds) {
        String name = locator.getName();
        String type = locator.getType();
        String location = locator.getLocation();
        CustomAssert.assertFalse(
                testCase,
                ConditionHandler.isDisplayed(locator, seconds),
                "The \"" + name + "\" " + type + " in the " + location + " is hidden.",
                "The \"" + name + "\" " + type + " in the " + location + " is not hidden."
        );
    }

    public static void verifyIfNotDisplayed(String testCase, Locator locator, int seconds, String message) {
        String name = locator.getName();
        String type = locator.getType();
        String page = locator.getLocation();
        CustomAssert.assertFalse(
                testCase,
                ConditionHandler.isDisplayed(locator, seconds),
                "The \"" + name + "\" " + type + " in the " + page + " is " + message + ".",
                "The \"" + name + "\" " + type + " in the " + page + " is not " + message + "."
        );
    }

    /*********************************************************************************************************************
     ** The 'verifyIfContained' method confirms the presence of text in an element's displayed text
     *********************************************************************************************************************/

    public static void verifyIfContained(String testCase, Locator locator, String target, String message) {
        String name = locator.getName();
        String type = locator.getType();
        String location = locator.getLocation();
        CustomAssert.assertTrue(
                testCase,
                GetHandler.getText(locator).contains(target),
                "The \"" + name + "\" " + type + " in the " + location + " is " + message + ".",
                "The \"" + name + "\" " + type + " in the " + location + " is not " + message + "."
        );
    }

    /*********************************************************************************************************************
     ** The 'verifyIfNotContained' method confirms the absence of text in an element's displayed text
     *********************************************************************************************************************/

    public static void verifyIfNotContained(String testCase, Locator locator, String target, String message) {
        String name = locator.getName();
        String type = locator.getType();
        String location = locator.getLocation();
        CustomAssert.assertFalse(
                testCase,
                GetHandler.getText(locator).contains(target),
                "The \"" + name + "\" " + type + " in the " + location + " is " + message + ".",
                "The \"" + name + "\" " + type + " in the " + location + " is not " + message + "."
        );
    }

    /*********************************************************************************************************************
     ** The 'verifyIfContained' method confirms the presence of text in an element's attribute
     *********************************************************************************************************************/

    public static void verifyIfContained(String testCase, Locator locator, String attribute, String target, String message) {
        String name = locator.getName();
        String type = locator.getType();
        String location = locator.getLocation();
        CustomAssert.assertTrue(
                testCase,
                GetHandler.getAttribute(locator, attribute).contains(target),
                "The \"" + name + "\" " + type + " in the " + location + " is " + message + ".",
                "The \"" + name + "\" " + type + " in the " + location + " is not " + message + "."
        );
    }

    /*********************************************************************************************************************
     ** The 'verifyIfNotContained' method confirms the absence of text in an element's attribute
     *********************************************************************************************************************/

    public static void verifyIfNotContained(String testCase, Locator locator, String attribute, String target, String message) {
        String name = locator.getName();
        String type = locator.getType();
        String location = locator.getLocation();
        CustomAssert.assertFalse(
                testCase,
                GetHandler.getAttribute(locator, attribute).contains(target),
                "The \"" + name + "\" " + type + " in the " + location + " is " + message + ".",
                "The \"" + name + "\" " + type + " in the " + location + " is not " + message + "."
        );
    }

}
