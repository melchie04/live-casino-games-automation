package utilities.objects;

import org.junit.Assert;

import java.util.Objects;

/* ? *******************************************************************************************************************
? These object class is customized to manage the verification process by handling the assertion for each condition.
? It adds printing of success messages or error messages in the console for each assertion.
? THESE ARE THE LIST OF METHODS:
? - public static void assertTrue
? - public static void assertFalse
? - public static void assertEquals
? - public static void assertNotEquals
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class CustomAssert extends Assert {

    public static void assertTrue(String testCase, boolean condition, String successMessage, String errorMessage) {
        if (!condition) Printer.printError("** " + errorMessage);
        assertTrue(testCase + ": " + errorMessage, condition);
        Printer.printSuccess("** " + successMessage);
    }

    public static void assertFalse(String testCase, boolean condition, String successMessage, String errorMessage) {
        if (condition) Printer.printError("** " + errorMessage);
        assertFalse(testCase + ": " + errorMessage, condition);
        Printer.printSuccess("** " + successMessage);
    }

    public static void assertEquals(String testCase, String expected, String actual, String successMessage, String errorMessage) {
        if (!Objects.equals(expected, actual)) Printer.printError("** " + errorMessage);
        assertEquals(testCase + ": " + errorMessage, expected, actual);
        Printer.printSuccess("** " + successMessage);
    }

    public static void assertNotEquals(String testCase, String expected, String actual, String successMessage, String errorMessage) {
        if (Objects.equals(expected, actual)) Printer.printError("** " + errorMessage);
        assertNotEquals(testCase + ": " + errorMessage, expected, actual);
        Printer.printSuccess("** " + successMessage);
    }

    public static void assertEquals(String testCase, double expected, double actual, String successMessage, String errorMessage) {
        if (expected != actual) Printer.printError("** " + errorMessage);
        assertEquals(testCase + ": " + errorMessage, expected, actual, 0.0);
        Printer.printSuccess("** " + successMessage);
    }

    public static void assertNotEquals(String testCase, double expected, double actual, String successMessage, String errorMessage) {
        if (expected == actual) Printer.printError("** " + errorMessage);
        assertNotEquals(testCase + ": " + errorMessage, expected, actual, 0.0);
        Printer.printSuccess("** " + successMessage);
    }

    public static void assertEquals(String testCase, int expected, int actual, String successMessage, String errorMessage) {
        if (expected != actual) Printer.printError("** " + errorMessage);
        assertEquals(testCase + ": " + errorMessage, expected, actual);
        Printer.printSuccess("** " + successMessage);
    }

    public static void assertNotEquals(String testCase, int expected, int actual, String successMessage, String errorMessage) {
        if (expected == actual) Printer.printError("** " + errorMessage);
        assertNotEquals(testCase + ": " + errorMessage, expected, actual);
        Printer.printSuccess("** " + successMessage);
    }

}
