package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class PanelToolBar {

    public Locator ToolBar = new Locator(
            "Tool Bar",
            "Panel",
            "Game Table Page",
            "//div[contains(@class,'tool_bar')]"
    );

    public Locator EditChips = new Locator(
            "Edit Chips",
            "Button",
            "Tool Bar Panel",
            "//div[@class='chip_set']//li[contains(@data-gtm, 'Btn_ClickChipCustomize')]"
    );

    public Locator DefaultChips = new Locator(
            "Default Chips",
            "Button",
            "Tool Bar Panel",
            "//div[@class='chip_set']//li[not(contains(@data-gtm, 'Btn_ClickChipCustomize'))]"
    );

    public Locator Undo = new Locator(
            "Undo",
            "Button",
            "Tool Bar Panel",
            "//div[@class='pattern']//button[contains(@class, 'btn_undo')]"
    );

    public Locator Cancel = new Locator(
            "Cancel",
            "Button",
            "Tool Bar Panel",
            "//div[@class='pattern']//button[contains(@class, 'btn_cancel')]"
    );

    public Locator Double = new Locator(
            "Double",
            "Button",
            "Tool Bar Panel",
            "//button[contains(@class, 'btn_double')]"
    );

    public Locator Confirm = new Locator(
            "Confirm",
            "Button",
            "Tool Bar Panel",
            "//button[contains(@class, 'btn_') and contains(@class, 'confirm')]"
    );

    public Locator ReBet = new Locator(
            "Re-bet",
            "Button",
            "Tool Bar Panel",
            "//button[@class='btn_rebet']"
    );

    public Locator[] AllActionButtons = {
            Undo,
            Cancel,
            Double,
            Confirm
    };

    public Locator getChip(String value) {
        return new Locator(
                "#" + value + " Chip",
                "Button",
                "Tool Bar Panel",
                "//div[@class='chip_set']//div[@class='chip_text'][normalize-space()='" + value + "']/ancestor::div[1]"
        );
    }

}
