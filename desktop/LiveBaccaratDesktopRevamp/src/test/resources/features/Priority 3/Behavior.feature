@Behavior @FullRun
Feature: Behavior

  Background:
    Given I Have Logged In To The Website
    And I Navigate To The Live Casino Page
    And I Enter The Live Baccarat Desktop Revamp Thumbnail

  # ****************************************************************************************************
  # ** Side Menu of the Game Lobby Page
  # ****************************************************************************************************

  @BHTest1
  Scenario: Test Case 1: Checking The Behavior Of The Other Tab Within The Side Menu In The Game Lobby
    When I Click "The Other Live Game Tab Within The Side Menu In The Game Lobby"
    Then I Verify The Behavior Of "The Other Tab Within The Side Menu In The Game Lobby"

  # ****************************************************************************************************
  # ** Navigation Bar of the Game Lobby Page
  # ****************************************************************************************************

  @BHTest2
  Scenario: Test Case 2: Checking The Behavior Of The Announcement Button In The Game Lobby
    When I Check "For Any New Announcements In The Game Lobby"
    Then I Verify The Behavior Of "The Announcement Button In The Game Lobby"

  @BHTest3To4
  Scenario: Test Case 3 To 4: Checking The Behavior Of The Announcement Modal In The Game Lobby
    # Test Case 3
    When I Check "For Any New Announcements In The Game Lobby"
    And I Click "The Announcement Button In The Game Lobby"
    Then I Verify The Behavior Of "The Announcement Modal In The Game Lobby When There Is A Read / Unread Announcement"
    # Test Case 4
    When I Check "For The Announcement Cards Within The Announcement Modal In The Game Lobby"
    And I Click "The Close Button Within The Announcement Modal In The Game Lobby"
    And I Enter Any Game Table
    And I Click "The Announcement Button In The Game Table"
    Then I Verify The Behavior Of "The Announcement Modal In The Game Lobby Is The Same As In The Game Table"

  @BHTest5
  Scenario: Test Case 5: Checking The Behavior Of The Announcement Marquee In The Game Lobby
    When I Check "For Any New Announcements In The Game Lobby"
    Then I Verify The Behavior Of "The Announcement Marquee In The Game Lobby When Entering The Game Lobby"
    When I Enter Any Game Table
    And I Click "The Back Button In The Game Table"
    Then I Verify The Behavior Of "The Announcement Marquee In The Game Lobby When Returning From The Game Table"

  @BHTest6To8
  Scenario: Test Case 6 To 8: Checking The Behavior Of The My Bets Modal In The Game Lobby
    # Test Case 6
    When I Click "The My Bets Button In The Game Lobby"
    Then I Verify The Behavior Of "The My Bets Modal In The Game Lobby"
    # Test Case 7
    When I Click "The Running Tab Within The My Bets Modal In The Game Lobby"
    Then I Verify The Behavior Of "The Running Tab Within The My Bets Modal In The Game Lobby"
    # Test Case 8
    When I Click "The Settled Tab Within The My Bets Modal In The Game Lobby"
    Then I Verify The Behavior Of "The Settled Tab Within The My Bets Modal In The Game Lobby"

  @BHTest9To11
  Scenario: Test Case 9 To 11: Checking The Behavior Of The User Setting Panel In The Game Lobby
    # Test Case 9
    When I Click "The User Setting Button In The Game Lobby"
    Then I Verify The Behavior Of "The User Setting Panel In The Game Lobby"
    # Test Case 10
    When I Click "The Dark Theme Button Within The User Setting Panel In The Game Lobby"
    Then I Verify The Behavior Of "The Dark Theme Button Within The User Setting Panel In The Game Lobby"
    # Test Case 11
    When I Click "The Light Theme Button Within The User Setting Panel In The Game Lobby"
    Then I Verify The Behavior Of "The Light Theme Button Within The User Setting Panel In The Game Lobby"

  # ****************************************************************************************************
  # ** Header of the Game Lobby Page
  # ****************************************************************************************************

  @BHTest12
  Scenario: Test Case 12: Checking The Behavior Of Any Table Limit Button In The Game Lobby
    When I Click "Any Table Limit Button In The Game Lobby"
    Then I Verify The Behavior Of "Any Table Limit Button In The Game Lobby"

  @BHTest13
  Scenario: Test Case 13: Checking The Behavior Of The Datetime In The Game Lobby
    When I Check "For The Datetime In The Game Lobby"
    Then I Verify The Behavior Of "The Datetime In The Game Lobby"

  # ****************************************************************************************************
  # ** Contents of the Game Lobby Page
  # ****************************************************************************************************

  @BHTest14
  Scenario: Test Case 14: Checking The Behavior Of The Betting Timer In The Game Lobby
    When I Check "For The Table Name In The Game Lobby"
    And I Wait "Until The Table Is Betting Phase In The Game Lobby"
    Then I Verify The Behavior Of "The Betting Timer In The Game Lobby"

  @BHTest15
  Scenario: Test Case 15: Checking The Behavior Of The Dealing Text In The Game Lobby
    When I Check "For The Table Name In The Game Lobby"
    And I Wait "Until The Table Is Dealing Phase In The Game Lobby"
    Then I Verify The Behavior Of "The Dealing Text In The Game Lobby"

  @BHTest16
  Scenario: Test Case 16: Checking The Behavior Of The Number Of Deals In The Game Lobby
    When I Check "For The Table Name In The Game Lobby"
    And I Check "For The Number Of Deals In The Game Lobby"
    And I Wait "Until The Round Is Settled In The Game Lobby"
    Then I Verify The Behavior Of "The Number Of Deals In The Game Lobby After The Round Is Settled"
    When I Enter The Selected Game Table
    Then I Verify The Behavior Of "The Number Of Deals In The Game Lobby Matches The Total Counter In The Game Table"

  # ****************************************************************************************************
  # ** Navigation Bar of the Game Table Page
  # ****************************************************************************************************

  @BHTest17
  Scenario: Test Case 17: Checking The Behavior Of The Back Button In The Game Table
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    And I Click "The Back Button In The Game Table"
    Then I Verify The Behavior Of "The Back Button In The Game Table When There Is A Confirmed Bet"

  @BHTest18
  Scenario: Test Case 18: Checking The Behavior Of The Round ID In The Game Table
    When I Enter Any Game Table
    And I Check "For The Round ID In The Game Table"
    And I Wait "Until The Round Is Settled In The Game Table"
    Then I Verify The Behavior Of "The Round ID In The Game Table After The New Round Starts"

  @BHTest19To21
  Scenario: Test Case 19 To 21: Checking The Behavior Of The Limits & Payouts Panel In The Game Table
    # Test Case 19
    When I Enter Any Game Table
    And I Click "The Limits & Payouts Button In The Game Table"
    Then I Verify The Behavior Of "The Limits & Payouts Panel In The Game Table"
    # Test Case 20
    When I Click "The Payout Tab Within The Limits & Payouts Panel In The Game Table"
    Then I Verify The Behavior Of "The Payout Tab Within The Limits & Payouts Panel In The Game Table"
    # Test Case 21
    When I Click "The Bet Limit Tab Within The Limits & Payouts Panel In The Game Table"
    Then I Verify The Behavior Of "The Bet Limit Tab Within The Limits & Payouts Panel In The Game Table"

  @BHTest22
  Scenario: Test Case 22: Checking The Behavior Of The Other Table Limit Within The Table Limit Panel In The Game Table
    When I Enter Any Game Table
    And I Check "For The Table Limit In The Game Table"
    And I Click "The Table Limit Button In The Game Table"
    And I Click "The Other Table Limit Within The Table Limit Panel In The Game Table"
    And I Click "The Table Limit Button In The Game Table"
    Then I Verify The Behavior Of "The Other Table Limit Within The Table Limit Panel In The Game Table"

  @BHTest23
  Scenario: Test Case 23: Checking The Behavior Of The Announcement Button In The Game Table
    When I Check "For Any New Announcements In The Game Table"
    Then I Verify The Behavior Of "The Announcement Button In The Game Table"

  @BHTest24To25
  Scenario: Test Case 24 To 25: Checking The Behavior Of The Announcement Modal In The Game Table
    # Test Case 24
    When I Enter Any Game Table
    And I Check "For Any New Announcements In The Game Table"
    And I Click "The Announcement Button In The Game Table"
    Then I Verify The Behavior Of "The Announcement Modal In The Game Table When There Is A Read / Unread Announcement"
    # Test Case 25
    When I Check "For The Announcement Cards Within The Announcement Modal In The Game Table"
    And I Click "The Close Button Within The Announcement Modal In The Game Table"
    And I Click "The Back Button In The Game Table"
    And I Click "The Announcement Button In The Game Lobby"
    Then I Verify The Behavior Of "The Announcement Modal In The Game Table Is The Same As In The Game Lobby"

  @BHTest26To28
  Scenario: Test Case 26 To 28: Checking The Behavior Of The My Bets Modal In The Game Table
    # Test Case 26
    When I Enter Any Game Table
    And I Click "The My Bets Button In The Game Table"
    Then I Verify The Behavior Of "The My Bets Modal In The Game Table"
    # Test Case 27
    When I Click "The Running Tab Within The My Bets Modal In The Game Table"
    Then I Verify The Behavior Of "The Running Tab Within The My Bets Modal In The Game Table"
    # Test Case 28
    When I Click "The Settled Tab Within The My Bets Modal In The Game Table"
    Then I Verify The Behavior Of "The Settled Tab Within The My Bets Modal In The Game Table"

  @BHTest29To31
  Scenario: Test Case 29 To 31: Checking The Behavior Of The User Setting Panel In The Game Table
    # Test Case 29
    When I Enter Any Game Table
    And I Click "The User Setting Button In The Game Table"
    Then I Verify The Behavior Of "The User Setting Panel In The Game Table"
    # Test Case 30
    When I Click "The Dark Theme Button Within The User Setting Panel In The Game Table"
    Then I Verify The Behavior Of "The Dark Theme Button Within The User Setting Panel In The Game Table"
    # Test Case 31
    When I Click "The Light Theme Button Within The User Setting Panel In The Game Table"
    Then I Verify The Behavior Of "The Light Theme Button Within The User Setting Panel In The Game Table"

  # ****************************************************************************************************
  # ** Game Screen of the Game Table Page
  # ****************************************************************************************************

  @BHTest32To33
  Scenario: Test Case 32 To 33: Checking The Behavior Of The Jump Table Window In The Game Table
    # Test Case 32
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    And I Click "The Jump Table Button In The Game Table"
    Then I Verify The Behavior Of "The Jump Table Window In The Game Table"
    # Test Case 33
    When I Click "The Other Product Within The Jump Table Window In The Game Table"
    Then I Verify The Behavior Of "The Other Product Within The Jump Table Window In The Game Table"

  @BHTest34
  Scenario: Test Case 34: Checking The Behavior Of The Betting Timer In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    Then I Verify The Behavior Of "The Betting Timer In The Game Table"

  @BHTest35
  Scenario: Test Case 35: Checking The Behavior Of The Dealing Text In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Dealing Phase In The Game Table"
    Then I Verify The Behavior Of "The Dealing Text In The Game Table"

  @BHTest36
  Scenario: Test Case 36: Checking The Behavior Of The Total Counter In The Game Table
    When I Enter Any Game Table
    And I Check "For The Total Counter In The Game Table"
    And I Wait "Until The Round Is Settled In The Game Table"
    Then I Verify The Behavior Of "The Total Counter In The Game Table After The Round Is Settled"
    When I Click "The Back Button In The Game Table"
    Then I Verify The Behavior Of "The Total Counter In The Game Table Matches The Number Of Deals In The Game Lobby"

  @BHTest37
  Scenario: Test Case 37: Checking The Behavior Of The Commission / Non-Commission Button In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Commission / Non-Commission Button In The Game Table"
    Then I Verify The Behavior Of "The Commission / Non-Commission Button In The Game Table After Clicked"
    When I Click "The Commission / Non-Commission Button In The Game Table"
    Then I Verify The Behavior Of "The Commission / Non-Commission Button In The Game Table After Re-clicked"

  # ****************************************************************************************************
  # ** Tool Bar of the Game Table Page
  # ****************************************************************************************************

  @BHTest38To40
  Scenario: Test Case 38 To 40: Checking The Behavior Of The Chip Settings Panel In The Game Table
    # Test Case 38
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Edit Chips Button In The Game Table"
    And I Click "The Save Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Behavior Of "The Chip Settings Panel In The Game Table When Saving It With Nothing Changes"
    # Test Case 39
    When I Click "The Edit Chips Button In The Game Table"
    And I Click "The Add Chip Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Behavior Of "The Chip Settings Panel In The Game Table When Adding Chip With Four Chips Already Present"
    # Test Case 40
    When I Click "The Remove Chip Button Within The Chip Settings Panel In The Game Table"
    And I Click "The Save Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Behavior Of "The Chip Settings Panel In The Game Table When Saving It With Only Three Chips Present"

  @BHTest41
  Scenario: Test Case 41: Checking The Behavior Of Each Chip Within The Default Chips In The Game Table
    When I Enter Any Game Table
    And I Bet "Each Chip In The Default Chips In Any Betting Option"
    Then I Verify The Behavior Of "Each Chip Within The Default Chips In The Game Table"

  @BHTest42To44
  Scenario: Test Case 42 To 44: Checking The Behavior Of The Undo Button In The Game Table
    # Test Case 42
    When I Enter Any Game Table
    And I Bet "Four Or More In Any Betting Options"
    Then I Verify The Behavior Of "The Undo Button In The Game Table After Placing Bets"
    # Test Case 43
    When I Click "The Undo Button In The Game Table"
    Then I Verify The Behavior Of "The Undo Button In The Game Table After Clicked"
    # Test Case 44
    When I Do "Press And Hold The Undo Button In The Game Table"
    Then I Verify The Behavior Of "The Undo Button In The Game Table After Pressing And Holding"

  @BHTest45To46
  Scenario: Test Case 45 To 46: Checking The Behavior Of The Cancel Button In The Game Table
    # Test Case 45
    When I Enter Any Game Table
    And I Bet "Four Or More In Any Betting Options"
    Then I Verify The Behavior Of "The Cancel Button In The Game Table After Placing Bets"
    # Test Case 46
    When I Click "The Cancel Button In The Game Table"
    Then I Verify The Behavior Of "The Cancel Button In The Game Table After Clicked"

  @BHTest47To49
  Scenario: Test Case 47 To 49: Checking The Behavior Of The Double Button In The Game Table
    # Test Case 47
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    Then I Verify The Behavior Of "The Double Button In The Game Table After Placing Bets"
    # Test Case 48
    When I Click "The Double Button In The Game Table"
    Then I Verify The Behavior Of "The Double Button In The Game Table After Clicked"
    # Test Case 49
    When I Click "The Double Button In The Game Table Until Reaching The Maximum Bet Limit"
    Then I Verify The Behavior Of "The Double Button In The Game Table After Reaching The Maximum Bet Limit"

  @BHTest50To55
  Scenario: Test Case 50 To 55: Checking The Behavior Of The Confirm Button In The Game Table
    # Test Case 50
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    Then I Verify The Behavior Of "The Confirm Button In The Game Table After Placing Bets"
    # Test Case 51
    When I Click "The Undo Button In The Game Table"
    And I Bet "Lower Than Minimum Bet Limit In Any Betting Option"
    Then I Verify The Behavior Of "The Confirm Button In The Game Table After Placing Lower Than Minimum Bet Limit"
    # Test Case 52
    When I Bet "In The Betting Option Until Reaching The Minimum Bet Limit"
    Then I Verify The Behavior Of "The Confirm Button In The Game Table After Reaching The Minimum Bet Limit"
    # Test Case 53
    When I Click "The Confirm Button In The Game Table"
    Then I Verify The Behavior Of "The Confirm Button In The Game Table After Clicked"
    # Test Case 54
    When I Wait "Until The Round Is Settled In The Game Table"
    Then I Verify The Behavior Of "The Confirm Button In The Game Table After The Round Is Settled"
    # Test Case 55
    When I Click "The ReBet Button In The Game Table"
    Then I Verify The Behavior Of "The ReBet Button In The Game Table After Clicked"

  # ****************************************************************************************************
  # ** Betting Option Panel of the Game Table Page
  # ****************************************************************************************************

  @BHTest56
  Scenario: Test Case 56: Checking The Behavior Of The Betting Option In The Game Table After Placing Higher Than Maximum Bet Limit
    When I Enter Any Game Table
    And I Bet "In The Betting Option Until Reaching The Maximum Bet Limit"
    And I Bet "In The Betting Option Again"
    Then I Verify The Behavior Of "The Betting Option In The Game Table After Placing Higher Than Maximum Bet Limit"

  @BHTest57To58
  Scenario: Test Case 57 To 58: Checking The Behavior Of The Betting Option In The Game Table After Placing A Bet Without Confirming It
    # Test Case 57
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Wait "Until The Betting Timer Is Less Than 10 Seconds In The Game Table"
    Then I Verify The Behavior Of "The Betting Option In The Game Table After Placing A Bet And The Betting Timer Is Less Than 10 Seconds"
    # Test Case 58
    When I Wait "Until The Game Is Dealing Phase In The Game Table"
    Then I Verify The Behavior Of "The Betting Option In The Game Table After Placing A Bet Without Confirming It"

  @BHTest59To60
  Scenario: Test Case 59 To 60: Checking The Behavior Of The Betting Option In The Game Table After Not Placing A Bet For Many Rounds
    # Test Case 59
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    And I Do "Not Bet For 8 Consecutive Rounds"
    Then I Verify The Behavior Of "The Betting Option In The Game Table After Not Placing A Bet For 8 Rounds"
    # Test Case 60
    When I Do "Not Bet For 9 Consecutive Rounds"
    Then I Verify The Behavior Of "The Betting Option In The Game Table After Not Placing A Bet For 9 Rounds"