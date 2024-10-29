package utilities.objects;

import org.openqa.selenium.By;

/* ? *******************************************************************************************************************
? This object class is utilized to create a component that encompasses all details of a web element on the website.
? THESE ARE THE LIST OF METHODS:
? - public String getName
? - public String getType
? - public String getPage
? - public By getPath
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class Locator {

    private final String Name; // The name of the web element.
    private final String Type; // The element type, such as Container, Button, TextBox, etc.
    private final String Location; // The location (component & page) of the web element.
    private final By Path; // The xpath used to locate the web element on the website.

    public Locator(String Name, String Type, String Location, String Path) {
        this.Name = Name;
        this.Type = Type;
        this.Location = Location;
        this.Path = By.xpath(Path);
    }

    public String getName() { return Name; }

    public String getType() { return Type; }

    public String getLocation() { return Location; }

    public By getPath() { return Path; }

}
