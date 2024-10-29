package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class TableContent {

    public Locator JumpTable = new Locator(
            "Jump Table",
            "Button",
            "Game Table Page",
            "//button[contains(@class,'jump_table_btn')]"
    );

    public Locator ShowTimer = new Locator(
            "Show Timer",
            "Label",
            "Game Table Page",
            "//p[@id='showTimer']"
    );

    public Locator ShowDealing = new Locator(
            "Show Dealing",
            "Label",
            "Game Table Page",
            "//p[@id='showDealingWording']"
    );

    public Locator Timer = new Locator(
            "Timer",
            "Container",
            "Game Table Page",
            "//div[contains(@class, 'timer') and contains(@class,'EN_US')]"
    );

    public Locator Theme = new Locator(
            "Theme",
            "Container",
            "Game Table Page",
            "//div[contains(@class,'container container_desktop roadmap_')]"
    );

}
