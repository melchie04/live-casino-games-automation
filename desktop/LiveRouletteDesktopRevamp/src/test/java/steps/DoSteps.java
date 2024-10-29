package steps;

import io.cucumber.java.en.When;
import locators.XPath;
import utilities.handlers.EventHandler;
import utilities.objects.Printer;

public class DoSteps {

    @When("I Do {string}")
    public void iDo(String step) {
        switch (step) {
            case "Press And Hold The Undo Button In The Game Table" -> EventHandler.pressAndHold(XPath.GameTable.ToolBar.Undo, 3);
            case "Not Bet For 8 Consecutive Rounds",
                 "Not Bet For 9 Consecutive Rounds" -> Printer.printInfo("Do Step Is Included In Next Step");
        }
    }

}
