@UserInterface @FullRun
Feature: User Interface

  @UITest1To6
  Scenario: Test Case 1 To 6: Checking The User Interface Of The Live Baccarat Desktop Revamp
    Given I Have Logged In To The Website
    When I Navigate To The Live Casino Page
    # Test Case 1
    Then I Verify The UI Of "The Live Baccarat Desktop Revamp Thumbnail"
    # Test Case 2
    When I Enter The Live Baccarat Desktop Revamp Thumbnail
    Then I Verify The UI Of "The Live Baccarat Desktop Revamp After Entering The Game Lobby"
    # Test Case 3
    When I Enter Any Game Table
    Then I Verify The UI Of "The Live Baccarat Desktop Revamp After Entering The Game Table"
    # Test Case 4
    When I Wait "Until The Game Is Betting Phase In The Game Table"
    Then I Verify The UI Of "The Live Baccarat Desktop Revamp During Betting Phase"
    # Test Case 5
    When I Wait "Until The Game Is Dealing Phase In The Game Table"
    Then I Verify The UI Of "The Live Baccarat Desktop Revamp During Dealing Phase"
    # Test Case 6
    When I Wait "Until The Game Is Result Phase In The Game Table"
    Then I Verify The UI Of "The Live Baccarat Desktop Revamp During Result Phase"