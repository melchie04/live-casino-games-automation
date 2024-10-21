package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class WindowHelp {

    public TabMenu TabMenu = new TabMenu();

    public static class TabMenu {

        public Locator Basics = new Locator(
                "The Basics Information",
                "Tab",
                "Help Window",
                "//summary[normalize-space()='The Basics']"
        );

        public Locator BetOptions = new Locator(
                "Bet Options and How to Win Information",
                "Tab",
                "Help Window",
                "//summary[normalize-space()='Bet Options and How to Win']"
        );

        public Locator GameControls = new Locator(
                "What are the Game Controls Information",
                "Tab",
                "Help Window",
                "//summary[normalize-space()='What are the Game Controls']"
        );

        public Locator Likelihood = new Locator(
                "What is My Likelihood of Winning Information",
                "Tab",
                "Help Window",
                "//summary[normalize-space()='What is My Likelihood of Winning']"
        );

        public Locator[] AllTabs = {
                Basics,
                BetOptions,
                GameControls,
                Likelihood
        };

    }

    public Locator Back = new Locator(
            "Back",
            "Button",
            "Help Window",
            "//div[@class='nav_bar']//button[@class='back_btn']"
    );

    public Locator Basics = new Locator(
            "The Basics Information",
            "Container",
            "Help Window",
            "//details[contains(@data-gtm, 'Basics')]"
    );

    public Locator BetOptions = new Locator(
            "Bet Options and How to Win Information",
            "Container",
            "Help Window",
            "//details[contains(@data-gtm, 'BetOption')]"
    );

    public Locator GameControls = new Locator(
            "What are the Game Controls Information",
            "Container",
            "Help Window",
            "//details[contains(@data-gtm, 'GameControl')]"
    );

    public Locator Likelihood = new Locator(
            "What is My Likelihood of Winning Information",
            "Container",
            "Help Window",
            "//details[contains(@data-gtm, 'Likelihood')]"
    );

}
