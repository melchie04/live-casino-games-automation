package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class PanelTableLimit {

    public Locator AllTableLimits = new Locator(
            "All Table Limits",
            "Button",
            "Table Limit Panel",
            "//ul[@class='table_limits']//li"
    );

    public Locator InactiveTableLimits = new Locator(
            "Inactive Table Limits",
            "Button",
            "Table Limit Panel",
            "//ul[@class='table_limits']//li[not(contains(@class, 'active'))]"
    );

    public Locator ActiveTableLimit = new Locator(
            "Active Table Limit",
            "Button",
            "Table Limit Panel",
            "//ul[@class='table_limits']//li[contains(@class, 'active')]"
    );

    public Locator getTableLimit(String tableLimit) {
        return new Locator(
                tableLimit +" Table Limit",
                "Button",
                "Table Limit Panel",
                "//ul[@class='table_limits']//li[contains(normalize-space(), '" + tableLimit + "')]"
        );
    }

}
