package steps;

import io.cucumber.java.en.Then;
import locators.XPath;
import modules.Behavior.*;
import modules.BetInformation.BITest1;
import modules.BetInformation.BITest2;
import modules.BetInformation.BITest3;
import modules.Functionality.*;
import modules.Payout.Payout;
import modules.UserInterface.*;
import utilities.handlers.EventHandler;

public class VerifySteps {

    @Then("I Verify The UI Of {string}")
    public void iVerifyTheUI(String step) {
        switch (step) {
            case "The Live Sic Bo Desktop Revamp Thumbnail" -> UITest1.verify();
            case "The Live Sic Bo Desktop Revamp After Entering The Game Lobby" -> UITest2.verify();
            case "The Live Sic Bo Desktop Revamp After Entering The Game Table" -> UITest3.verify();
            case "The Live Sic Bo Desktop Revamp During Betting Phase" -> UITest4.verify();
            case "The Live Sic Bo Desktop Revamp During Dealing Phase" -> UITest5.verify();
            case "The Live Sic Bo Desktop Revamp During Result Phase" -> UITest6.verify();
        }
    }

    @Then("I Verify The Behavior Of {string}")
    public void iVerifyTheBehaviorOf(String step) {
        switch (step) {
            // ? Side Menu of the Game Lobby Page
            case "The Other Tab Within The Side Menu In The Game Lobby" -> BHTest1.verify();
            // ? Navigation Bar of the Game Lobby Page
            case "The Announcement Button In The Game Lobby" -> BHTest2.verify();
            case "The Announcement Modal In The Game Lobby When There Is A Read / Unread Announcement" ->
                    BHTest3.verify();
            case "The Announcement Modal In The Game Lobby Is The Same As In The Game Table" -> BHTest4.verify();
            case "The Announcement Marquee In The Game Lobby When Entering The Game Lobby",
                 "The Announcement Marquee In The Game Lobby When Returning From The Game Table" -> BHTest5.verify();
            case "The My Bets Modal In The Game Lobby" -> BHTest6.verify();
            case "The Running Tab Within The My Bets Modal In The Game Lobby" -> BHTest7.verify();
            case "The Settled Tab Within The My Bets Modal In The Game Lobby" -> BHTest8.verify();
            case "The User Setting Panel In The Game Lobby" -> BHTest9.verify();
            case "The Dark Theme Button Within The User Setting Panel In The Game Lobby" -> BHTest10.verify();
            case "The Light Theme Button Within The User Setting Panel In The Game Lobby" -> BHTest11.verify();
            // ? Header of the Game Lobby Page
            case "Any Table Limit Button In The Game Lobby" -> BHTest12.verify();
            case "The Datetime In The Game Lobby" -> BHTest13.verify();
            case "The Betting Timer In The Game Lobby" -> BHTest14.verify();
            case "The Dealing Text In The Game Lobby" -> BHTest15.verify();
            case "The Number Of Deals And The Counters In The Game Lobby After The Round Is Settled" ->
                    BHTest16.verify();
            // ? Navigation Bar of the Game Table Page
            case "The Back Button In The Game Table When There Is A Confirmed Bet" -> BHTest17.verify();
            case "The Round ID In The Game Table After The New Round Starts" -> BHTest18.verify();
            case "The Limits & Payouts Panel In The Game Table" -> BHTest19.verify();
            case "The Payout Tab Within The Limits & Payouts Panel In The Game Table" -> BHTest20.verify();
            case "The Bet Limit Tab Within The Limits & Payouts Panel In The Game Table" -> BHTest21.verify();
            case "The Other Table Limit Within The Table Limit Panel In The Game Table" -> BHTest22.verify();
            case "The Announcement Button In The Game Table" -> BHTest23.verify();
            case "The Announcement Modal In The Game Table When There Is A Read / Unread Announcement" ->
                    BHTest24.verify();
            case "The Announcement Modal In The Game Table Is The Same As In The Game Lobby" -> BHTest25.verify();
            case "The My Bets Modal In The Game Table" -> BHTest26.verify();
            case "The Running Tab Within The My Bets Modal In The Game Table" -> BHTest27.verify();
            case "The Settled Tab Within The My Bets Modal In The Game Table" -> BHTest28.verify();
            case "The User Setting Panel In The Game Table" -> BHTest29.verify();
            case "The Dark Theme Button Within The User Setting Panel In The Game Table" -> BHTest30.verify();
            case "The Light Theme Button Within The User Setting Panel In The Game Table" -> BHTest31.verify();
            // ? Game Screen of the Game Table Page
            case "The Jump Table Window In The Game Table" -> BHTest32.verify();
            case "The Other Product Within The Jump Table Window In The Game Table" -> BHTest33.verify();
            case "The Latest Results Within The Jump Table Window In The Game Table Matches The Counters In The Game Lobby" ->
                    BHTest34.verify();
            case "The Betting Timer In The Game Table" -> BHTest35.verify();
            case "The Dealing Text In The Game Table" -> BHTest36.verify();
            case "The Result Panel In The Game Table" -> BHTest37.verify();
            // ? Tool Bar of the Game Table Page
            case "The Chip Settings Panel In The Game Table When Saving It With Nothing Changes" -> BHTest38.verify();
            case "The Chip Settings Panel In The Game Table When Adding Chip With Four Chips Already Present" ->
                    BHTest39.verify();
            case "The Chip Settings Panel In The Game Table When Saving It With Only Three Chips Present" ->
                    BHTest40.verify();
            case "Each Chip Within The Default Chips In The Game Table" -> BHTest41.verify();
            case "The Undo Button In The Game Table After Placing Bets" -> BHTest42.verify();
            case "The Undo Button In The Game Table After Clicked" -> BHTest43.verify();
            case "The Undo Button In The Game Table After Pressing And Holding" -> BHTest44.verify();
            case "The Cancel Button In The Game Table After Placing Bets" -> BHTest45.verify();
            case "The Cancel Button In The Game Table After Clicked" -> BHTest46.verify();
            case "The Double Button In The Game Table After Placing Bets" -> BHTest47.verify();
            case "The Double Button In The Game Table After Clicked" -> BHTest48.verify();
            case "The Double Button In The Game Table After Reaching The Maximum Bet Limit" -> BHTest49.verify();
            case "The Confirm Button In The Game Table After Placing Bets" -> BHTest50.verify();
            case "The Confirm Button In The Game Table After Placing Lower Than Minimum Bet Limit" -> BHTest51.verify();
            case "The Confirm Button In The Game Table After Reaching The Minimum Bet Limit" -> BHTest52.verify();
            case "The Confirm Button In The Game Table After Clicked" -> BHTest53.verify();
            case "The Confirm Button In The Game Table After The Round Is Settled" -> BHTest54.verify();
            case "The ReBet Button In The Game Table After Clicked" -> BHTest55.verify();
            // ? Betting Option Panel of the Game Table Page
            case "The Betting Option In The Game Table After Placing Higher Than Maximum Bet Limit" ->
                    BHTest56.verify();
            case "The Betting Option In The Game Table After Placing A Bet And The Betting Timer Is Less Than 10 Seconds" ->
                    BHTest57.verify();
            case "The Betting Option In The Game Table After Placing A Bet Without Confirming It" -> BHTest58.verify();
            case "The Betting Option In The Game Table After Not Placing A Bet For 8 Rounds" -> BHTest59.verify();
            case "The Betting Option In The Game Table After Not Placing A Bet For 9 Rounds" -> BHTest60.verify();
        }
    }

    @Then("I Verify The Functionality Of {string}")
    public void iVerifyTheFunctionalityOf(String step) {
        switch (step) {
            // ? Side Menu of the Game Lobby Page
            case "The Other Live Game Tab Within The Side Menu In The Game Lobby" -> FTTest1.verify();
            case "The All Games Tab Of The Side Menu In The Game Lobby" -> FTTest2.verify();
            // ? Navigation Bar of the Game Lobby Page
            case "The Back Button In The Game Lobby" -> FTTest3.verify();
            case "The Announcement Button In The Game Lobby" -> FTTest4.verify();
            case "The Close Button Within The Announcement Modal In The Game Lobby" -> FTTest5.verify();
            case "The Announcement Modal In The Game Lobby When It's Clicked Outside" -> FTTest6.verify();
            case "The Mark All As Read Button Within The Announcement Modal In The Game Lobby" -> FTTest7.verify();
            case "The Full Screen Button In The Game Lobby After Clicked",
                 "The Full Screen Button In The Game Lobby After Re-clicked" -> FTTest8.verify();
            case "The My Bets Button In The Game Lobby" -> FTTest9.verify();
            case "The Close Button Within The My Bets Modal In The Game Lobby" -> FTTest10.verify();
            case "The My Bets Modal In The Game Lobby When It's Clicked Outside" -> FTTest11.verify();
            case "The Bet Details Button In The Game Lobby" -> FTTest12.verify();
            case "The Back Button Within The Bet Details Modal In The Game Lobby" -> FTTest13.verify();
            case "The Help Button In The Game Lobby" -> FTTest14.verify();
            case "The Balance Button In The Game Lobby After Clicked",
                 "The Balance Button In The Game Lobby After Re-clicked" -> FTTest15.verify();
            case "The User Setting Button In The Game Lobby" -> FTTest16.verify();
            case "The Dark Theme Button Within The User Setting Panel In The Game Lobby" -> FTTest17.verify();
            case "The Light Theme Button Within The User Setting Panel In The Game Lobby" -> FTTest18.verify();
            // ? Header of the Game Lobby Page
            case "Any Table Limit Button In The Game Lobby" -> FTTest19.verify();
            case "Each Table Limit Button In The Game Lobby" -> FTTest20.verify();
            case "Any Game Table In The Game Lobby" -> FTTest21.verify();
            case "The Betting Timer In The Game Lobby" -> FTTest22.verify();
            case "The Dealing Text In The Game Lobby" -> FTTest23.verify();
            // ? Navigation Bar of the Game Table Page
            case "The Back Button In The Game Table" -> FTTest24.verify();
            case "The Limits & Payouts Button In The Game Table After Clicked" -> FTTest25.verify();
            case "The Payout Tab Within The Limits & Payouts Panel In The Game Table" -> FTTest26.verify();
            case "The Bet Limit Tab Within The Limits & Payouts Panel In The Game Table" -> FTTest27.verify();
            case "The Limits & Payouts Button In The Game Table After Re-clicked" -> FTTest28.verify();
            case "The Table Limit Button In The Game Table" -> FTTest29.verify();
            case "The Other Table Limit Within The Table Limit Panel In The Game Table" -> FTTest30.verify();
            case "The Announcement Button In The Game Table" -> FTTest31.verify();
            case "The Close Button Within The Announcement Modal In The Game Table" -> FTTest32.verify();
            case "The Announcement Modal In The Game Table When It's Clicked Outside" -> FTTest33.verify();
            case "The Mark All As Read Button Within The Announcement Modal In The Game Table" -> FTTest34.verify();
            case "The Full Screen Button In The Game Table After Clicked",
                 "The Full Screen Button In The Game Table After Re-clicked" -> FTTest35.verify();
            case "The My Bets Button In The Game Table" -> FTTest36.verify();
            case "The Close Button Within The My Bets Modal In The Game Table" -> FTTest37.verify();
            case "The My Bets Modal In The Game Table When It's Clicked Outside" -> FTTest38.verify();
            case "The Running Tab Within The My Bets Modal In The Game Table" -> FTTest39.verify();
            case "The Settled Tab Within The My Bets Modal In The Game Table" -> FTTest40.verify();
            case "The Bet Details Button In The Game Table" -> FTTest41.verify();
            case "The Back Button Within The Bet Details Modal In The Game Table" -> FTTest42.verify();
            case "The Help Button In The Game Table" -> FTTest43.verify();
            case "Each Category Within The Help Window In The Game Table After Clicked",
                 "Each Category Within The Help Window In The Game Table After Re-clicked" -> FTTest44.verify();
            case "The Back Button Within The Help Window In The Game Table" -> FTTest45.verify();
            case "The Balance Button In The Game Table After Clicked",
                 "The Balance Button In The Game Table After Re-clicked" -> FTTest46.verify();
            case "The User Setting Button In The Game Table" -> FTTest47.verify();
            case "The Dark Theme Button Within The User Setting Panel In The Game Table" -> FTTest48.verify();
            case "The Light Theme Button Within The User Setting Panel In The Game Table" -> FTTest49.verify();
            // ? Game Screen of the Game Table Page
            case "The Jump Table Button In The Game Table" -> FTTest50.verify();
            case "The Close Button Within The Jump Table Window In The Game Table" -> FTTest51.verify();
            case "The Jump Table Window In The Game Table When It's Clicked Outside" -> FTTest52.verify();
            case "The Other Table Within The Jump Table Window In The Game Table" -> FTTest53.verify();
            case "The Other Product Table Within The Jump Table Window In The Game Table" -> FTTest54.verify();
            case "The Betting Timer In The Game Table" -> FTTest55.verify();
            case "The Dealing Text In The Game Table" -> FTTest56.verify();
            case "The Hide / Show Tool Bar Button In The Game Table After Clicked",
                 "The Hide / Show Tool Bar Button In The Game Table After Re-clicked" -> FTTest57.verify();
            case "The Close Button Within The Game Results Panel In The Game Table",
                 "The Open Button Within The Game Results Panel In The Game Table" -> FTTest58.verify();
            case "The Close Button Within The Hot And Cold Numbers Panel In The Game Table",
                 "The Open Button Within The Hot And Cold Numbers Panel In The Game Table" -> FTTest59.verify();
            // ? Tool Bar of the Game Table Page
            case "The Edit Chips Button In The Game Table" -> FTTest60.verify();
            case "The Close Button Within The Chip Settings Panel In The Game Table" -> FTTest61.verify();
            case "The Next Arrow Button Within The Chip Settings Panel In The Game Table" -> FTTest62.verify();
            case "The Previous Arrow Button Within The Chip Settings Panel In The Game Table" -> FTTest63.verify();
            case "The Remove Chip Button Within The Chip Settings Panel In The Game Table" -> FTTest64.verify();
            case "The Add Chip Button Within The Chip Settings Panel In The Game Table" -> FTTest65.verify();
            case "The Save Button Within The Chip Settings Panel In The Game Table" -> FTTest66.verify();
            case "Each Chip Within The Default Chips In The Game Table" -> FTTest67.verify();
            case "The Undo Button In The Game Table" -> FTTest68.verify();
            case "The Undo Button In The Game Table After Pressing And Holding" -> FTTest69.verify();
            case "The Cancel Button In The Game Table" -> FTTest70.verify();
            case "The Double Button In The Game Table" -> FTTest71.verify();
            case "The Confirm Button In The Game Table" -> FTTest72.verify();
            case "The Confirm Button In The Game Table When There Is A Confirmed Bet" -> FTTest73.verify();
            case "The Top Up Confirm Button In The Game Table" -> FTTest74.verify();
            case "The ReBet Button In The Game Table" -> FTTest75.verify();
            // ? Betting Option Panel of the Game Table Page
            case "Any Betting Option In The Game Table" -> FTTest76.verify();
            case "All Betting Option In The Game Table" -> FTTest77.verify();
            case "The Betting Option In The Game Table When There Is A Placed Bet" -> FTTest78.verify();
            case "The Confirm Button Within The Confirmation Modal In The Game Table" -> FTTest79.verify();
            case "The Not Now Button Within The Confirmation Modal In The Game Table" -> FTTest80.verify();
            case "The Result Panel After The Player Wins A Round" -> FTTest81.verify();
            case "The Result Panel After The Player Loses A Round" -> FTTest82.verify();
        }
    }

    @Then("I Verify The Bet Information Of {string}")
    public void iVerifyTheBetInformationOf(String step) {
        switch (step) {
            case "The Win Result" -> BITest1.verify();
            case "The Lose Result" -> BITest2.verify();
            case "The Multiple Bets" -> BITest3.verify();
        }
        EventHandler.click(XPath.GameTable.BetDetails.Back);
        EventHandler.click(100, 100);
        EventHandler.click(XPath.GameTable.NavBar.Back);
    }

    @Then("I Verify The Payout Of {string}")
    public void iVerifyThePayoutCalculationOf(String step) {
        switch (step) {
            case "The Small Result" -> Payout.verify(1, step);
            case "The Big Result" -> Payout.verify(2, step);
            case "The Even Result" -> Payout.verify(3, step);
            case "The Odd Result" -> Payout.verify(4, step);
            case "The Any Triple Result" -> Payout.verify(5, step);
            case "The Three Dice Total 4 & 17 Result" -> Payout.verify(6, step);
            case "The Three Dice Total 5 & 16 Result" -> Payout.verify(7, step);
            case "The Three Dice Total 6 & 15 Result" -> Payout.verify(8, step);
            case "The Three Dice Total 7 & 14 Result" -> Payout.verify(9, step);
            case "The Three Dice Total 8 & 13 Result" -> Payout.verify(10, step);
            case "The Three Dice Total 9 & 12 Result" -> Payout.verify(11, step);
            case "The Three Dice Total 10 & 11 Result" -> Payout.verify(12, step);
            case "The Specific Triple Result" -> Payout.verify(13, step);
            case "The 1 To 1 On One Dice Result" -> Payout.verify(14, step);
            case "The 2 To 1 On One Dice Result" -> Payout.verify(15, step);
            case "The 3 To 1 On One Dice Result" -> Payout.verify(16, step);
            case "The Two Dice Combo Result" -> Payout.verify(17, step);
            case "The Specific Double Result" -> Payout.verify(18, step);
        }
    }

}
