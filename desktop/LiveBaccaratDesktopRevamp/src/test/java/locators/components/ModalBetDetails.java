package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class ModalBetDetails {

    public Locator Back = new Locator(
            "Back",
            "Button",
            "Bet Details Modal",
            "//div[@class='bet_detail']//button[@class='back_btn']"
    );

    public Locator BetDetails = new Locator(
            "Bet Details",
            "Label",
            "Bet Details Modal",
            "//h2[normalize-space()='Bet Details']"
    );

    public Locator Stake = new Locator(
            "Stake",
            "Label",
            "Bet Details Modal",
            "//h3[normalize-space()='Stake']/ancestor::div[1]//p"
    );

    public Locator WinLoss = new Locator(
            "Win/Loss",
            "Label",
            "Bet Details Modal",
            "//h3[normalize-space()='Win/Loss']/ancestor::div[1]//p"
    );

}
