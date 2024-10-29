package steps;

import engine.DesktopBrowser;
import io.cucumber.java.*;
import utilities.Utilities;

@SuppressWarnings("unused")
public class Hooks {

    private final DesktopBrowser desktopBrowser;

    public Hooks(DesktopBrowser desktopBrowser) {
        this.desktopBrowser = desktopBrowser;
    }

    @Before()
    public void before(Scenario scenario) {
        desktopBrowser.start();
        Utilities.start(scenario);
    }

    @After()
    public void after(Scenario scenario) {
        Utilities.end(scenario);
        desktopBrowser.end();
    }

}
