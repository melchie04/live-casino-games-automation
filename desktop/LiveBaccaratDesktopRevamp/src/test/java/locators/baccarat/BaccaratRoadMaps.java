package locators.baccarat;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class BaccaratRoadMaps {

    public Locator ResultHistoryTheme = new Locator(
            "Result History Theme",
            "Container",
            "Game Lobby Page",
            "//div[contains(@class,'lobby_layout')]"
    );

    public Locator RoadMapFullscreen = new Locator(
            "Road Map Fullscreen",
            "Button",
            "Game Lobby Page",
            "//div[@class='roadmap_expand_btn']"
    );

    public Locator Bead = new Locator(
            "Bead Road Map",
            "Container",
            "Game Lobby Page",
            "//div[@class='roadmap-content roadmap-content--bead']"
    );

    public Locator Big = new Locator(
            "Big Road Map",
            "Container",
            "Game Lobby Page",
            "//div[@class='roadmap-content roadmap-content--big']"
    );

    public Locator BigEye = new Locator(
            "Big Eye Road Map",
            "Container",
            "Game Lobby Page",
            "//div[@class='roadmap-content roadmap-content--big-eye']"
    );

    public Locator Small = new Locator(
            "Small Road Map",
            "Container",
            "Game Lobby Page",
            "//div[@class='roadmap-content roadmap-content--small']"
    );

    public Locator Cockroach = new Locator(
            "Cockroach Road Map",
            "Container",
            "Game Lobby Page",
            "//div[@class='roadmap-content roadmap-content--cockroach']"
    );

    public Locator[] AllMaps = {
            Bead,
            Big,
            BigEye,
            Small,
            Cockroach,
    };

}
