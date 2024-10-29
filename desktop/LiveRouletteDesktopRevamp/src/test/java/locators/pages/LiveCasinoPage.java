package locators.pages;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class LiveCasinoPage {

    /*!*******************************************************************************************************************
     !* DO NOT EDIT BELOW THIS COMMENT
     !* It includes all the common components of this live casino.
     !********************************************************************************************************************/

    public Locator LiveBaccaratDesktopRevamp = new Locator(
            "Live Baccarat Desktop Revamp",
            "Thumbnail",
            "Live Casino Page",
            "//p[normalize-space()='SBO Live Deluxe Baccarat']/ancestor::div[1]"
    );

    public Locator LiveRouletteDesktopRevamp = new Locator(
            "Live Roulette Desktop Revamp",
            "Thumbnail",
            "Live Casino Page",
            "//p[normalize-space()='SBO Live Deluxe Roulette']/ancestor::div[1]"
    );

    public Locator LiveSicBoDesktopRevamp = new Locator(
            "Live Sic Bo Desktop Revamp",
            "Thumbnail",
            "Live Casino Page",
            "//p[normalize-space()='SBO Live Deluxe Sic Bo']/ancestor::div[1]"
    );

    public Locator AllLiveCasinoGames = new Locator(
            "All Live Casino Games",
            "Thumbnail",
            "Live Casino Page",
            "//p[contains(normalize-space(),'SBO Live Deluxe')]/ancestor::div[1]"
    );

}
