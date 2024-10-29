package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class ModalMyBets {

    public TabMenu TabMenu = new TabMenu();

    public static class TabMenu {

        public Locator Running = new Locator(
                "Running",
                "Tab",
                "My Bets Modal",
                "//div[normalize-space()='Running']"
        );

        public Locator Settled = new Locator(
                "Settled",
                "Tab",
                "My Bets Modal",
                "//div[normalize-space()='Settled']"
        );

    }

    public Running Running = new Running();

    public static class Running {

        public Locator TableName = new Locator(
                "Table Name",
                "Label",
                "My Bets Modal",
                "//div[@class='running_history']//div[@class='name']"
        );

        public Locator StakeTurnover = new Locator(
                "Stake (Turnover)",
                "Label",
                "My Bets Modal",
                "//div[@class='running_history']//h3[contains(text(),'Stake (Turnover)')]/following-sibling::p"
        );

        public Locator ReferenceNumber = new Locator(
                "Reference Number",
                "Label",
                "My Bets Modal",
                "//div[@class='running_history']//div[@class='bottom']//p[1]"
        );

        public Locator BetDate = new Locator(
                "Bet Date",
                "Label",
                "My Bets Modal",
                "//div[@class='running_history']//div[@class='bottom']//p[2]"
        );

        public Locator Status = new Locator(
                "Running Status",
                "Label",
                "My Bets Modal",
                "//div[@class='status running']"
        );

        public Locator RoundID = new Locator(
                "Round ID",
                "Label",
                "My Bets Modal",
                "//div[@class='running_history']//div[@class='id']"
        );

        public Locator HistoryCards = new Locator(
                "History Cards",
                "Container",
                "My Bets Modal",
                "//div[@class='running_history']//div[@class='history_card']"
        );

    }

    public Settled Settled = new Settled();

    public static class Settled {

        public Locator DefaultTotal = new Locator(
                "Total 0.00 (0.00)",
                "Label",
                "My Bets Modal",
                "//div[normalize-space()='Total0.00(0.00)']"
        );

        public Locator Message = new Locator(
                "All transactions are time stamped at GMT-4.",
                "Label",
                "My Bets Modal",
                "//div[@id='Settled_history']//p[@class='time_stamped'][normalize-space()='All transactions are time stamped at GMT-4.']"
        );

        public Locator Total = new Locator(
                "Total",
                "Label",
                "My Bets Modal",
                "//div[@class='total']"
        );

        public Locator TableName = new Locator(
                "Table Name",
                "Label",
                "My Bets Modal",
                "//div[@class='settled_history']//div[@class='name']"
        );

        public Locator StakeTurnover = new Locator(
                "Stake (Turnover)",
                "Label",
                "My Bets Modal",
                "//div[@class='settled_history']//h3[contains(text(),'Stake (Turnover)')]/following-sibling::p"
        );

        public Locator WinLossComm = new Locator(
                "Win/Loss (Comm)",
                "Label",
                "My Bets Modal",
                "//div[@class='settled_history']//h3[contains(text(),'Win/Loss (Comm)')]/following-sibling::p"
        );

        public Locator ReferenceNumber = new Locator(
                "Reference Number",
                "Label",
                "My Bets Modal",
                "//div[@class='settled_history']//div[@class='bottom']//p[1]"
        );

        public Locator BetDate = new Locator(
                "Bet Date",
                "Label",
                "My Bets Modal",
                "//div[@class='settled_history']//div[@class='bottom']//p[2]"
        );

        public Locator Status = new Locator(
                "Status",
                "Label",
                "My Bets Modal",
                "//div[contains(@class,'status')]"
        );

        public Locator RoundID = new Locator(
                "Round ID",
                "Label",
                "My Bets Modal",
                "//div[@class='settled_history']//div[@class='id']"
        );

        public Locator HistoryCards = new Locator(
                "History Cards",
                "Container",
                "My Bets Modal",
                "//div[@class='settled_history']//div[@class='history_card']"
        );

        public Locator getDetails(String roundID) {
            return new Locator(
                    "Round ID " + roundID + " Details",
                    "Button",
                    "My Bets Modal",
                    "//div[contains(normalize-space(),'" + roundID + "')]/ancestor::div[contains(@class,'history_card')]//div[contains(@data-gtm,'BetDetail')]"
            );
        }

    }

    public Locator DefaultTab = new Locator(
            "Default Tab",
            "Button",
            "My Bets Modal",
            "//div[@class='tab Settled']"
    );

    public Locator Close = new Locator(
            "Close",
            "Button",
            "My Bets Modal",
            "//div[@class='close']"
    );

    public Locator MyBets = new Locator(
            "My Bets",
            "Label",
            "My Bets Modal",
            "//div[normalize-space()='My Bets']"
    );

}
