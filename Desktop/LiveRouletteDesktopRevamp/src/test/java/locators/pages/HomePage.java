package locators.pages;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class HomePage {

    /*!*******************************************************************************************************************
     !* DO NOT EDIT BELOW THIS COMMENT
     !* It includes all the common components of this live casino.
     !********************************************************************************************************************/

    public Locator Captcha = new Locator(
            "Captcha",
            "Label",
            "Home Page",
            "//p[normalize-space()='After completing the CAPTCHA below, you will immediately regain access to the site again.']"
    );

    public Locator LiveCasino = new Locator(
            "Live Casino",
            "Tab",
            "Home Page",
            "//a[normalize-space()='Live Casino']"
    );

}
