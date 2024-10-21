package engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class DesktopBrowser {

    public static WebDriver driver;

    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new GoogleChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void end() {
        driver.quit();
    }

}
