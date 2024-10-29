package modules.Behavior;

import globals.Variables;
import locators.XPath;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BHTest13 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: BEHAVIOR");
        System.out.println("Test Case: 13");
        System.out.println("Actual Results: ");

        WaitHandler.wait(3);

        CustomAssert.assertNotEquals(
                "BH Test 13",
                Variables.datetime,
                GetHandler.getText(XPath.GameLobby.Header.getDateTime(Variables.productName)),
                "The datetime is running.",
                "The datetime is not running."
        );

        CustomAssert.assertEquals(
                "BH Test 13",
                LocalDate.parse(Variables.datetime, DateTimeFormatter.ofPattern("MM / dd / yyyy HH:mm:ss 'CT(GMT+08:00)'")).toString(),
                LocalDate.now().toString(),
                "The date is correct.",
                "The date is not correct."
        );

        System.out.println();
    }

}

