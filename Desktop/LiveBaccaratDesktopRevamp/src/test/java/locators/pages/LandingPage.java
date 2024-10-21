package locators.pages;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class LandingPage {

    /*!*******************************************************************************************************************
     !* DO NOT EDIT BELOW THIS COMMENT
     !* It includes all the common components of this live casino.
     !********************************************************************************************************************/

    public Locator SignIn = new Locator(
            "Sign In",
            "Button",
            "Login Page",
            "//li[contains(@class,'sign-in')]"
    );

    public Locator Username = new Locator(
            "Username",
            "TextBox",
            "Login Page",
            "//input[@id='username']"
    );

    public Locator Password = new Locator(
            "Password",
            "TextBox",
            "Login Page",
            "//input[@id='password']"
    );

    public Locator Language = new Locator(
            "Language",
            "Dropdown Menu",
            "Login Page",
            "//div[@class='lang-selection']"
    );

    public Locator English = new Locator(
            "English",
            "Dropdown Option",
            "Login Page",
            "//ul[contains(@class,'lang-drop-down-ul')]//a[normalize-space()='English']/ancestor::li[1]"
    );

    public Locator Next = new Locator(
            "Next",
            "Button",
            "Login Page",
            "//div[@class='buttonGroup']//button[@type='button']"
    );

    public Locator GotIt = new Locator(
            "Got It",
            "Button",
            "Login Page",
            "//span[normalize-space()='Got it']/ancestor::button"
    );

}
