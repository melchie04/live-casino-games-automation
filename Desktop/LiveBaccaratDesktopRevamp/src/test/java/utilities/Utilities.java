package utilities;

import engine.DesktopBrowser;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.features.ScreenshotFeature;
import utilities.objects.CustomScenario;
import utilities.objects.Printer;

@SuppressWarnings("unused")
public class Utilities extends DesktopBrowser {

    /*********************************************************************************************************************
     ** These variables and tools are used for automation test scripts.
     *********************************************************************************************************************/

    protected static CustomScenario customScenario;
    protected static WebDriverWait wait;
    protected static JavascriptExecutor jsExecutor;
    protected static Actions actions;
    protected static String originalWindowHandle;

    /*********************************************************************************************************************
     ** The 'start' method initializes all tools and executes all utility methods before beginning each scenario.
     *********************************************************************************************************************/

    public static void start(Scenario scenario) {
        Printer.printInfo("***************************** START SCENARIO *****************************");
        driver.switchTo().window(driver.getWindowHandle());
        wait = new WebDriverWait(driver, 5);
        jsExecutor = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        originalWindowHandle = driver.getWindowHandle();
        customScenario = new CustomScenario(scenario);
    }

    /*********************************************************************************************************************
     ** The 'end' method executes all cleanup methods in utilities after completing each scenario.
     *********************************************************************************************************************/

    public static void end(Scenario scenario) {
        if (scenario.isFailed())
            ScreenshotFeature.capture("errors");
        Printer.printInfo("***************************** END SCENARIO *******************************");
    }

}
