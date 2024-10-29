package steps;

import globals.Variables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locators.XPath;
import utilities.enums.HandleCollection;
import utilities.handlers.*;
import utilities.interfaces.Navigator;
import utilities.objects.Printer;

import java.util.Objects;

public class NavigationSteps {

    @Given("I Have Logged In To The Website")
    public void iHaveLoggedInToTheWebsite() {
        Navigator navigator = () -> {
            // Go to website
            NavigationHandler.goToWebsite();
            // Change language to English
            if (!Objects.equals(GetHandler.getText(XPath.Landing.Language), "English")) {
                EventHandler.click(XPath.Landing.Language, 2);
                EventHandler.click(XPath.Landing.English);
            }
            // Login username and password
            if (ConditionHandler.isUrlContains(AccountHandler.getUrl(), 5)) {
                EventHandler.sendKeys(XPath.Landing.Username, AccountHandler.getUsername());
                EventHandler.sendKeys(XPath.Landing.Password, AccountHandler.getPassword());
                EventHandler.click(XPath.Landing.SignIn, 5);
            }
            // Remove pop-up notifications
            EventHandler.click(XPath.Landing.Next, HandleCollection.WithException);
            EventHandler.click(XPath.Landing.GotIt, HandleCollection.WithException);
            // Verify if the live casino tab is displayed
            WaitHandler.waitUrlContains("https://sportsbook.sbobet.com/", 5);
            WaitHandler.waitVisibility(XPath.Home.LiveCasino, 5);
        };
        retrySteps(navigator, "Login To The Website.");
    }

    @When("I Navigate To The Live Casino Page")
    public void iNavigateToTheLiveCasinoPage() {
        Navigator navigator = () -> {
            if (!ConditionHandler.isUrlContains("royalcasino.sbobet.com/", 5)) iHaveLoggedInToTheWebsite();
            // Go to live casino page
            EventHandler.click(XPath.Home.LiveCasino);
            // Verify if the all live casino games is displayed
            WaitHandler.waitUrlContains("royalcasino.sbobet.com/", 5);
            WaitHandler.waitVisibility(XPath.LiveCasino.AllLiveCasinoGames, 5);
        };
        retrySteps(navigator, "Navigate To The Live Casino Page.");
    }

    @When("I Enter The Live Sic Bo Desktop Revamp Thumbnail")
    public void iEnterTheLiveSicBoDesktopRevampThumbnail() {
        Navigator navigator = () -> {
            Variables.productName = "Sic Bo";
            // Go to game lobby page
            if (ConditionHandler.isDisplayed(XPath.LiveCasino.LiveSicBoDesktopRevamp, 5)) {
                EventHandler.click(XPath.LiveCasino.LiveSicBoDesktopRevamp);
                NavigationHandler.switchToAnotherWindow();
            }
            // Go back to the game lobby page if there is a previous session
            if (ConditionHandler.isUrlContains("/sicboDesktop", 5))
                EventHandler.click(XPath.GameTable.NavBar.Back);
            // Verify if the all game tables is displayed
            WaitHandler.waitUrlContains("/gameLobby", 5);
            WaitHandler.waitVisibility(XPath.GameLobby.Content.getTables(Variables.productName), 5);
        };
        retrySteps(navigator, "Enter The Live Sic Bo Desktop Revamp Thumbnail.");
    }

    @When("I Enter Any Game Table")
    public void iEnterAnyTable() {
        // Go to game table page
        Navigator navigator = () -> {
            Variables.tableName = GetHandler.getElementByRandom(XPath.GameLobby.Content.getTableNames(Variables.productName)).getText();
            EventHandler.click(XPath.GameLobby.Content.getTable(Variables.tableName), 1);
            WaitHandler.waitUrlContains("/sicboDesktop", 5);
            WaitHandler.waitVisibility(XPath.GameTable.NavBar.TableName, 5);
        };
        retrySteps(navigator, "Enter Any Game Table.");
    }

    @And("I Enter The Selected Game Table")
    public void iEnterTheSelectedGameTable() {
        // Go to game table page
        Navigator navigator = () -> {
            EventHandler.click(XPath.GameLobby.Content.getTable(Variables.tableName), 1);
            WaitHandler.waitUrlContains("/sicboDesktop", 5);
            WaitHandler.waitVisibility(XPath.GameTable.NavBar.TableName, 5);
        };
        retrySteps(navigator, "Enter The Selected Game Table.");
    }

    @When("I Check The Round Result")
    public void iCheckTheRoundResult() {
        NavigationHandler.goToWebsite();
    }

    private void retrySteps(Navigator navigator, String description) {
        byte count = 0;
        boolean isError = true;
        do {
            try {
                if (count > 0) NavigationHandler.reload();
                navigator.execute();
                isError = false;
            } catch (Exception e) {
                Printer.printWarning((++count) + " Failed Attempt To " + description);
                if (count == 5) throw e;
            }
        } while (isError);
    }

}
