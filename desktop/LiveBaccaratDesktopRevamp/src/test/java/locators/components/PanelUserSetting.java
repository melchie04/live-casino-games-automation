package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class PanelUserSetting {

    public Locator UserName = new Locator(
            "User Name",
            "Label",
            "User Setting Panel",
            "//div[@class='user_info']//div[not(@class='icon')]"
    );

    public Locator LightMode = new Locator(
            "Light Mode",
            "Button",
            "User Setting Panel",
            "//img[contains(@src,'light')]/ancestor::div[1]"
    );

    public Locator DarkMode = new Locator(
            "Dark Mode",
            "Button",
            "User Setting Panel",
            "//img[contains(@src,'dark')]/ancestor::div[1]"
    );

}
