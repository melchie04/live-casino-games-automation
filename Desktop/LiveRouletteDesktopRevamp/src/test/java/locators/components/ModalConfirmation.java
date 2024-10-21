package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class ModalConfirmation {

    public Locator ConfirmNow = new Locator(
            "Confirm now?",
            "Label",
            "Confirmation Modal",
            "//p[@class='popUp_title']"
    );

    public Locator Confirm = new Locator(
            "Confirm",
            "Button",
            "Confirmation Modal",
            "//div[@class='popUp']//button[@class='confirm']"
    );

    public Locator NotNow = new Locator(
            "Not Now",
            "Button",
            "Confirmation Modal",
            "//div[@class='popUp']//button[normalize-space()='Not Now']"
    );

}
