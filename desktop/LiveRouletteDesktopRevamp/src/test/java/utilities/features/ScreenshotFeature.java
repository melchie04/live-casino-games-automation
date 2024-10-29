package utilities.features;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Utilities;
import utilities.handlers.DirectoryHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static void capture(String folderName, String fileName)
? - public static void capture(String folderName)
? - private static boolean ignoreScenario(String scenarioName)
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class ScreenshotFeature extends Utilities {

    /*********************************************************************************************************************
     ** The 'capture' method is used to capture a screenshot.
     *********************************************************************************************************************/

    public static void capture(String folderName, String fileName) {
        try {
            String path = DirectoryHandler.getScreenshotPath() + File.separator + folderName;
            DirectoryHandler.createDirectory(path);
            String name = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss")) + " " + fileName + ".png";
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            File file = new File(path + File.separator + name);
            FileUtils.writeByteArrayToFile(file, screenshot);
        } catch (IOException e) { /* Ignore IOException */ }
    }

    /*********************************************************************************************************************
     ** The 'capture' method is used to capture a screenshot in case of failure in every test scenario.
     *********************************************************************************************************************/

    public static void capture(String folderName) {
        try {
            if (!ignoreFeature(customScenario.getFeature())) {
                String path = DirectoryHandler.getScreenshotPath() + File.separator + "errors";
                DirectoryHandler.createDirectory(path);
                String name = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss")) + " " + customScenario.getName() + ".png";
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                File file = new File(path + File.separator + name);
                FileUtils.writeByteArrayToFile(file, screenshot);
                customScenario.attach(screenshot, "image/png", "image");
            }
        } catch (IOException e) { /* Ignore IOException */ }
    }

    /*********************************************************************************************************************
     ** The 'ignoreScenario' method determines whether a scenario needs to be excluded from screenshot capture.
     *********************************************************************************************************************/

    private static boolean ignoreFeature(String feature) {
        String[] ignoredScenarioList = new String[] { "Payout" };
        for (String ignoredScenario : ignoredScenarioList) if (feature.contains(ignoredScenario)) return true;
        return false;
    }

}
