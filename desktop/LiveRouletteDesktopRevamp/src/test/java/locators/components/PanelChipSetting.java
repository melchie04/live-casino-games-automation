package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class PanelChipSetting {

    public Locator MyChips = new Locator(
            "My Chips",
            "Container",
            "Chip Setting Panel",
            "//ul[@class='chips']//li[not(contains(@class,'empty'))]"
    );

    public Locator ChipSelections = new Locator(
            "Chip Selections",
            "Container",
            "Chip Setting Panel",
            "//ul[@class='chips chips_selections']//li[not(contains(@style, 'display: none'))]"
    );

    public Locator PreviousChip = new Locator(
            "Previous Chip",
            "Container",
            "Chip Setting Panel",
            "//ul[@class='chips chips_selections']//li[5]"
    );

    public Locator NextChip = new Locator(
            "Next Chip",
            "Container",
            "Chip Setting Panel",
            "//ul[@class='chips chips_selections']//li[15]"
    );

    public Locator Close = new Locator(
            "Close",
            "Button",
            "Chip Setting Panel",
            "//button[@class='close_btn']"
    );

    public Locator Save = new Locator(
            "Save",
            "Button",
            "Chip Setting Panel",
            "//button[normalize-space()='Save']"
    );

    public Locator PreviousArrow = new Locator(
            "Previous Arrow",
            "Button",
            "Chip Setting Panel",
            "//button[@class='arr_btn arr_left_btn']//*[name()='svg']"
    );

    public Locator NextArrow = new Locator(
            "Next Arrow",
            "Button",
            "Chip Setting Panel",
            "//button[@class='arr_btn arr_right_btn']//*[name()='svg']"
    );

    public Locator getChipSelection(String chipValue) {
        return new Locator(
                "#" + chipValue + " Chip Selection",
                "Button",
                "Chip Setting Panel",
                "//div[@class='top_section']//div[@class='chip_text'][normalize-space()='" + chipValue + "']/ancestor::div[1]"
        );
    }

    public Locator getMyChip(String chipValue) {
        return new Locator(
                "#" + chipValue + " My Chip",
                "Button",
                "Chip Setting Panel",
                "//div[@class='bottom_section']//div[@class='chip_text'][normalize-space()='" + chipValue + "']/ancestor::div[1]"
        );
    }

}
