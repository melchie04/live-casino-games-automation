package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class PanelNotification {

    public Locator WelcomeAndGoodLuck = new Locator(
            "Welcome and good luck.",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'Welcome and good luck')]"
    );

    public Locator PlaceYourBetsPlease = new Locator(
            "Place your bets please",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'Place your bets please')]"
    );

    public Locator NoMoreBets = new Locator(
            "No more bets",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'No more bets')]"
    );

    public Locator BetsAccepted = new Locator(
            "Bets accepted.",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'Bets accepted.')]"
    );

    public Locator RememberedChipSettings = new Locator(
            "We've remembered your chip settings.",
            "Label",
            "Notification Panel",
            "//p[contains(text(),'remembered your chip settings.')]"
    );

    public Locator GiveItATry = new Locator(
            "You haven't bet for a long time. Give it a try?",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'Give it a try?')]"
    );

    public Locator FindATable = new Locator(
            "Let's find a table and start betting.",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'find a table and start betting')]"
    );

    public Locator RemoveOne = new Locator(
            "Can only select 4 chips. Remove one?",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'Can only select 4 chips. Remove one?')]"
    );

    public Locator AddMore = new Locator(
            "Must select 4 chips. Add more?",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'Must select 4 chips. Add more?')]"
    );

    public Locator ExceededTheMaxBet = new Locator(
            "You've exceeded the max bet amount.",
            "Label",
            "Notification Panel",
            "//p[contains(normalize-space(), 'exceeded the max bet amount.')]"
    );

    public Locator YourBetsAreBeingSettled = new Locator(
            "Your bets are being settled right now. Please wait.",
            "Label",
            "Notification Panel",
            "//p[contains(text(),'Your bets are being settled right now. Please wait.')]"
    );

    public Locator AllSeatsAreOccupied = new Locator(
            "All seats are occupied at the moment. Try again to let us make room for you.",
            "Label",
            "Notification Panel",
            "//p[contains(text(),'All seats are occupied at the moment. Try again to let us make room for you.')]"
    );

}
