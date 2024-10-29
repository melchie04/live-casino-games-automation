@BetInformation @FullRun @Maintenance
Feature: Bet Information

  Background:
    Given I Have Logged In To The Website
    And I Navigate To The Live Casino Page
    And I Enter The Live Baccarat Desktop Revamp Thumbnail
    And I Enter Any Game Table

  @BITest1
  Scenario: Test Case 1: Checking The Bet Information Of The Win Result
    When I Bet "In Any Betting Option Until Win"
    And I Click "The My Bets Button In The Game Table"
    And I Click "The Details Button Within The My Bets Modal In The Game Table"
    Then I Verify The Bet Information Of "The Win Result"

  @BITest2
  Scenario: Test Case 2: Checking The Bet Information Of The Lose Result
    When I Bet "In Any Betting Option Until Lose"
    And I Click "The My Bets Button In The Game Table"
    And I Click "The Details Button Within The My Bets Modal In The Game Table"
    Then I Verify The Bet Information Of "The Lose Result"

  @BITest3
  Scenario: Test Case 3: Checking The Bet Information Of The Tie Result
    When I Bet "In Any Betting Option Until Tie"
    And I Click "The My Bets Button In The Game Table"
    And I Click "The Details Button Within The My Bets Modal In The Game Table"
    Then I Verify The Bet Information Of "The Tie Result"