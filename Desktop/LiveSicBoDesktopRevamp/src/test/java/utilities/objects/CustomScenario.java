package utilities.objects;

import io.cucumber.java.Scenario;

import java.net.URI;
import java.nio.file.Paths;

/* ? *******************************************************************************************************************
? This object class is customized to manage the information for each scenario.
? THESE ARE THE LIST OF METHODS:
? - public String getName
? - public String getFeature
? - public boolean isFailed
? - public void attach
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class CustomScenario {

    private final Scenario scenario;

    public CustomScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public String getName() {
        return this.scenario.getName().replace(":", "").replace("/", "");
    }

    public String getFeature() { return Paths.get(URI.create(String.valueOf(this.scenario.getUri()))).getFileName().toString().replace(".feature", ""); }

    public boolean isFailed() { return this.scenario.isFailed(); }

    public void attach(byte[] data, String mediaType, String name) {
        this.scenario.attach(data, mediaType, name);
    }

}