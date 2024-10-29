@Functionality @FullRun @Maintenance
Feature: Functionality

  Background:
    Given I Have Logged In To The Website
    And I Navigate To The Live Casino Page
    And I Enter The Live Sic Bo Desktop Revamp Thumbnail

  # ****************************************************************************************************
  # ** Side Menu of the Game Lobby Page
  # ****************************************************************************************************

  @FTTest1
  Scenario: Test Case 1: Checking The Functionality Of The Other Live Game Tab Within The Side Menu In The Game Lobby
    When I Click "The Other Live Game Tab Within The Side Menu In The Game Lobby"
    Then I Verify The Functionality Of "The Other Live Game Tab Within The Side Menu In The Game Lobby"

  @FTTest2
  Scenario: Test Case 2: Checking The Functionality Of The All Games Tab Of The Side Menu In The Game Lobby
    When I Click "The All Games Tab Of The Side Menu In The Game Lobby"
    Then I Verify The Functionality Of "The All Games Tab Of The Side Menu In The Game Lobby"

  # ****************************************************************************************************
  # ** Navigation Bar of the Game Lobby Page
  # ****************************************************************************************************

  @FTTest3
  Scenario: Test Case 3: Checking The Functionality Of The Back Button In The Game Lobby
    When I Click "The Back Button In The Game Lobby"
    Then I Verify The Functionality Of "The Back Button In The Game Lobby"

  @FTTest4To6
  Scenario: Test Case 4 To 6: Checking The Functionality Of The Announcement Modal In The Game Lobby
    # Test Case 4
    When I Click "The Announcement Button In The Game Lobby"
    Then I Verify The Functionality Of "The Announcement Button In The Game Lobby"
    # Test Case 5
    When I Click "The Close Button Within The Announcement Modal In The Game Lobby"
    Then I Verify The Functionality Of "The Close Button Within The Announcement Modal In The Game Lobby"
    # Test Case 6
    When I Click "The Announcement Button In The Game Lobby"
    And I Click "The Outside Of The Modal"
    Then I Verify The Functionality Of "The Announcement Modal In The Game Lobby When It's Clicked Outside"

  @FTTest7
  Scenario: Test Case 7: Checking The Functionality Of The Mark All As Read Button Within The Announcement Modal In The Game Lobby
    When I Check "For Any New Announcements In The Game Lobby"
    And I Click "The Announcement Button In The Game Lobby"
    And I Click "The Mark All As Read Button Within The Announcement Modal In The Game Lobby"
    Then I Verify The Functionality Of "The Mark All As Read Button Within The Announcement Modal In The Game Lobby"

  @FTTest8
  Scenario: Test Case 8: Checking The Functionality Of The Full Screen Button In The Game Lobby
    When I Click "The Full Screen Button In The Game Lobby"
    Then I Verify The Functionality Of "The Full Screen Button In The Game Lobby After Clicked"
    When I Click "The Full Screen Button In The Game Lobby"
    Then I Verify The Functionality Of "The Full Screen Button In The Game Lobby After Re-clicked"

  @FTTest9To11
  Scenario: Test Case 9 To 11: Checking The Functionality Of The My Bets Modal In The Game Lobby
    # Test Case 9
    When I Click "The My Bets Button In The Game Lobby"
    Then I Verify The Functionality Of "The My Bets Button In The Game Lobby"
    # Test Case 10
    When I Click "The Close Button Within The My Bets Modal In The Game Lobby"
    Then I Verify The Functionality Of "The Close Button Within The My Bets Modal In The Game Lobby"
    # Test Case 11
    When I Click "The My Bets Button In The Game Lobby"
    And I Click "The Outside Of The Modal"
    Then I Verify The Functionality Of "The My Bets Modal In The Game Lobby When It's Clicked Outside"

  @FTTest12To13
  Scenario: Test Case 12 To 13: Checking The Functionality Of The Bet Details Modal In The Game Lobby
    # Test Case 12
    When I Check "For Any Settled Details Within My Bets Modal In The Game Lobby"
    And I Click "The My Bets Button In The Game Lobby"
    And I Click "The Details Button Within The My Bets Modal In The Game Lobby"
    Then I Verify The Functionality Of "The Bet Details Button In The Game Lobby"
    # Test Case 13
    When I Click "The Back Button Within The Bet Details Modal In The Game Lobby"
    Then I Verify The Functionality Of "The Back Button Within The Bet Details Modal In The Game Lobby"

  @FTTest14
  Scenario: Test Case 14: Checking The Functionality Of The Help Button In The Game Lobby
    When I Click "The Help Button In The Game Lobby"
    Then I Verify The Functionality Of "The Help Button In The Game Lobby"

  @FTTest15
  Scenario: Test Case 15: Checking The Functionality Of The Balance Button In The Game Lobby
    When I Click "The Balance Button In The Game Lobby"
    Then I Verify The Functionality Of "The Balance Button In The Game Lobby After Clicked"
    When I Click "The Balance Button In The Game Lobby"
    Then I Verify The Functionality Of "The Balance Button In The Game Lobby After Re-clicked"

  @FTTest16To18
  Scenario: Test Case 16 To 18: Checking The Functionality Of The User Setting Panel In The Game Lobby
    # Test Case 16
    When I Click "The User Setting Button In The Game Lobby"
    Then I Verify The Functionality Of "The User Setting Button In The Game Lobby"
    # Test Case 17
    When I Click "The Dark Theme Button Within The User Setting Panel In The Game Lobby"
    Then I Verify The Functionality Of "The Dark Theme Button Within The User Setting Panel In The Game Lobby"
    # Test Case 18
    When I Click "The Light Theme Button Within The User Setting Panel In The Game Lobby"
    Then I Verify The Functionality Of "The Light Theme Button Within The User Setting Panel In The Game Lobby"

  # ****************************************************************************************************
  # ** Header of the Game Lobby Page
  # ****************************************************************************************************

  @FTTest19
  Scenario: Test Case 19: Checking The Functionality Of Any Table Limit Button In The Game Lobby
    When I Click "Any Table Limit Button In The Game Lobby"
    And I Enter Any Game Table
    Then I Verify The Functionality Of "Any Table Limit Button In The Game Lobby"

  @FTTest20
  Scenario: Test Case 20: Checking The Functionality Of Each Table Limit Button In The Game Lobby
    When I Click "Each Table Limit Button In The Game Lobby"
    Then I Verify The Functionality Of "Each Table Limit Button In The Game Lobby"

  # ****************************************************************************************************
  # ** Contents of the Game Lobby Page
  # ****************************************************************************************************

  @FTTest21
  Scenario: Test Case 21: Checking The Functionality Of Any Game Table In The Game Lobby
    When I Check "For The Username In The Game Lobby"
    And I Enter Any Game Table
    Then I Verify The Functionality Of "Any Game Table In The Game Lobby"

  @FTTest22
  Scenario: Test Case 22: Checking The Functionality Of The Betting Timer In The Game Lobby
    When I Check "For The Table Name In The Game Lobby"
    And I Wait "Until The Table Is Betting Phase In The Game Lobby"
    And I Enter The Selected Game Table
    Then I Verify The Functionality Of "The Betting Timer In The Game Lobby"

  @FTTest23
  Scenario: Test Case 23: Checking The Functionality Of The Dealing Text In The Game Lobby
    When I Check "For The Table Name In The Game Lobby"
    And I Wait "Until The Table Is Dealing Phase In The Game Lobby"
    And I Enter The Selected Game Table
    Then I Verify The Functionality Of "The Dealing Text In The Game Lobby"

  # ****************************************************************************************************
  # ** Navigation Bar of the Game Table Page
  # ****************************************************************************************************

  @FTTest24
  Scenario: Test Case 24: Checking The Functionality Of The Back Button In The Game Table
    When I Enter Any Game Table
    And I Click "The Back Button In The Game Table"
    Then I Verify The Functionality Of "The Back Button In The Game Table"

  @FTTest25To28
  Scenario: Test Case 25 To 28: Checking The Functionality Of The Limits & Payouts Panel In The Game Table
    # Test Case 25
    When I Enter Any Game Table
    And I Click "The Limits & Payouts Button In The Game Table"
    Then I Verify The Functionality Of "The Limits & Payouts Button In The Game Table After Clicked"
    # Test Case 26
    When I Click "The Payout Tab Within The Limits & Payouts Panel In The Game Table"
    Then I Verify The Functionality Of "The Payout Tab Within The Limits & Payouts Panel In The Game Table"
    # Test Case 27
    When I Click "The Bet Limit Tab Within The Limits & Payouts Panel In The Game Table"
    Then I Verify The Functionality Of "The Bet Limit Tab Within The Limits & Payouts Panel In The Game Table"
    # Test Case 28
    When I Click "The Limits & Payouts Button In The Game Table"
    Then I Verify The Functionality Of "The Limits & Payouts Button In The Game Table After Re-clicked"

  @FTTest29To30
  Scenario: Test Case 29 To 30: Checking The Functionality Of The Table Limit Panel In The Game Table
    # Test Case 29
    When I Enter Any Game Table
    And I Check "For The Table Limit In The Game Table"
    And I Check "For The Table Name In The Game Table"
    And I Check "For The Round ID In The Game Table"
    And I Click "The Table Limit Button In The Game Table"
    Then I Verify The Functionality Of "The Table Limit Button In The Game Table"
    # Test Case 30
    When I Click "The Other Table Limit Within The Table Limit Panel In The Game Table"
    Then I Verify The Functionality Of "The Other Table Limit Within The Table Limit Panel In The Game Table"

  @FTTest31To33
  Scenario: Test Case 31 To 33: Checking The Functionality Of The Announcement Modal In The Game Table
    # Test Case 31
    When I Enter Any Game Table
    And I Click "The Announcement Button In The Game Table"
    Then I Verify The Functionality Of "The Announcement Button In The Game Table"
    # Test Case 32
    When I Click "The Close Button Within The Announcement Modal In The Game Table"
    Then I Verify The Functionality Of "The Close Button Within The Announcement Modal In The Game Table"
    # Test Case 33
    When I Click "The Announcement Button In The Game Table"
    And I Click "The Outside Of The Modal"
    Then I Verify The Functionality Of "The Announcement Modal In The Game Table When It's Clicked Outside"

  @FTTest34
  Scenario: Test Case 34: Checking The Functionality Of The Mark All As Read Button Within The Announcement Modal In The Game Table
    When I Enter Any Game Table
    And I Check "For Any New Announcements In The Game Table"
    And I Click "The Announcement Button In The Game Table"
    And I Click "The Mark All As Read Button Within The Announcement Modal In The Game Table"
    Then I Verify The Functionality Of "The Mark All As Read Button Within The Announcement Modal In The Game Table"

  @FTTest35
  Scenario: Test Case 35: Checking The Functionality Of The Full Screen Button In The Game Table
    When I Enter Any Game Table
    And I Click "The Full Screen Button In The Game Table"
    Then I Verify The Functionality Of "The Full Screen Button In The Game Table After Clicked"
    When I Click "The Full Screen Button In The Game Table"
    Then I Verify The Functionality Of "The Full Screen Button In The Game Table After Re-clicked"

  @FTTest36To38
  Scenario: Test Case 36 To 38: Checking The Functionality Of The My Bets Modal In The Game Table
    # Test Case 36
    When I Enter Any Game Table
    And I Click "The My Bets Button In The Game Table"
    Then I Verify The Functionality Of "The My Bets Button In The Game Table"
    # Test Case 37
    When I Click "The Close Button Within The My Bets Modal In The Game Table"
    Then I Verify The Functionality Of "The Close Button Within The My Bets Modal In The Game Table"
    # Test Case 38
    When I Click "The My Bets Button In The Game Table"
    And I Click "The Outside Of The Modal"
    Then I Verify The Functionality Of "The My Bets Modal In The Game Table When It's Clicked Outside"

  @FTTest39To42
  Scenario: Test Case 39 To 42: Checking The Functionality Of The Bet Details Modal In The Game Table
    # Test Case 39
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    And I Click "The My Bets Button In The Game Table"
    And I Click "The Running Tab Within The My Bets Modal In The Game Table"
    Then I Verify The Functionality Of "The Running Tab Within The My Bets Modal In The Game Table"
    # Test Case 40
    When I Click "The Outside Of The Modal"
    And I Wait "Until The Round Is Settled In The Game Table"
    And I Click "The My Bets Button In The Game Table"
    And I Click "The Settled Tab Within The My Bets Modal In The Game Table"
    Then I Verify The Functionality Of "The Settled Tab Within The My Bets Modal In The Game Table"
    # Test Case 41
    When I Click "The Details Button Within The My Bets Modal In The Game Table"
    Then I Verify The Functionality Of "The Bet Details Button In The Game Table"
    # Test Case 42
    When I Click "The Back Button Within The Bet Details Modal In The Game Table"
    Then I Verify The Functionality Of "The Back Button Within The Bet Details Modal In The Game Table"

  @FTTest43To45
  Scenario: Test Case 43 To 45: Checking The Functionality Of The Help Window In The Game Table
    # Test Case 43
    When I Enter Any Game Table
    And I Click "The Help Button In The Game Table"
    Then I Verify The Functionality Of "The Help Button In The Game Table"
    # Test Case 44
    When I Click "Each Category Within The Help Window In The Game Table"
    Then I Verify The Functionality Of "Each Category Within The Help Window In The Game Table After Clicked"
    When I Click "Each Category Within The Help Window In The Game Table"
    Then I Verify The Functionality Of "Each Category Within The Help Window In The Game Table After Re-clicked"
    # Test Case 45
    When I Click "The Back Button Within The Help Window In The Game Table"
    Then I Verify The Functionality Of "The Back Button Within The Help Window In The Game Table"

  @FTTest46
  Scenario: Test Case 46: Checking The Functionality Of The Balance Button In The Game Table
    When I Enter Any Game Table
    And I Click "The Balance Button In The Game Table"
    Then I Verify The Functionality Of "The Balance Button In The Game Table After Clicked"
    When I Click "The Balance Button In The Game Table"
    Then I Verify The Functionality Of "The Balance Button In The Game Table After Re-clicked"

  @FTTest47To49
  Scenario: Test Case 47 To 49: Checking The Functionality Of The User Setting Panel In The Game Table
    # Test Case 47
    When I Click "The User Setting Button In The Game Table"
    Then I Verify The Functionality Of "The User Setting Button In The Game Table"
    # Test Case 48
    When I Click "The Dark Theme Button Within The User Setting Panel In The Game Table"
    Then I Verify The Functionality Of "The Dark Theme Button Within The User Setting Panel In The Game Table"
    # Test Case 49
    When I Click "The Light Theme Button Within The User Setting Panel In The Game Table"
    Then I Verify The Functionality Of "The Light Theme Button Within The User Setting Panel In The Game Table"

  # ****************************************************************************************************
  # ** Game Screen of the Game Table Page
  # ****************************************************************************************************

  @FTTest50To52
  Scenario: Test Case 50 To 52: Checking The Functionality Of The Jump Table Window In The Game Table
    # Test Case 50
    When I Enter Any Game Table
    And I Click "The Jump Table Button In The Game Table"
    Then I Verify The Functionality Of "The Jump Table Button In The Game Table"
    # Test Case 51
    When I Click "The Close Button Within The Jump Table Window In The Game Table"
    Then I Verify The Functionality Of "The Close Button Within The Jump Table Window In The Game Table"
    # Test Case 52
    When I Click "The Jump Table Button In The Game Table"
    And I Click "The Outside Of The Window"
    Then I Verify The Functionality Of "The Jump Table Window In The Game Table When It's Clicked Outside"

  @FTTest53
  Scenario: Test Case 53: Checking The Functionality Of The Other Table Within The Jump Table Window In The Game Table
    When I Enter Any Game Table
    And I Click "The Jump Table Button In The Game Table"
    And I Check "For The Other Table Within The Jump Table Window In The Game Table"
    And I Click "The Other Table Within The Jump Table Window In The Game Table"
    Then I Verify The Functionality Of "The Other Table Within The Jump Table Window In The Game Table"

  @FTTest54
  Scenario: Test Case 54: Checking The Functionality Of The Other Product Table Within The Jump Table Window In The Game Table
    When I Enter Any Game Table
    And I Click "The Jump Table Button In The Game Table"
    And I Click "The Other Product Within The Jump Table Window In The Game Table"
    And I Check "For The Other Product Table Within The Jump Table Window In The Game Table"
    And I Click "The Other Product Table Within The Jump Table Window In The Game Table"
    Then I Verify The Functionality Of "The Other Product Table Within The Jump Table Window In The Game Table"

  @FTTest55
  Scenario: Test Case 55: Checking The Functionality Of The Betting Timer In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    Then I Verify The Functionality Of "The Betting Timer In The Game Table"

  @FTTest56
  Scenario: Test Case 56: Checking The Functionality Of The Dealing Text In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Dealing Phase In The Game Table"
    Then I Verify The Functionality Of "The Dealing Text In The Game Table"

  @FTTest57
  Scenario: Test Case 57: Checking The Functionality Of The Hide / Show Tool Bar Button In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Hide / Show Tool Bar Button In The Game Table"
    Then I Verify The Functionality Of "The Hide / Show Tool Bar Button In The Game Table After Clicked"
    When I Click "The Hide / Show Tool Bar Button In The Game Table"
    Then I Verify The Functionality Of "The Hide / Show Tool Bar Button In The Game Table After Re-clicked"

  @FTTest58
  Scenario: Test Case 58: Checking The Functionality Of The Game Results Panel In The Game Table
    When I Enter Any Game Table
    And I Click "The Close Button Within The Game Results Panel In The Game Table"
    Then I Verify The Functionality Of "The Close Button Within The Game Results Panel In The Game Table"
    When I Click "The Open Button Within The Game Results Panel In The Game Table"
    Then I Verify The Functionality Of "The Open Button Within The Game Results Panel In The Game Table"

  @FTTest59
  Scenario: Test Case 59: Checking The Functionality Of The Hot And Cold Numbers Panel In The Game Table
    # Test Case 59
    When I Enter Any Game Table
    And I Click "The Close Button Within The Hot And Cold Numbers Panel In The Game Table"
    Then I Verify The Functionality Of "The Close Button Within The Hot And Cold Numbers Panel In The Game Table"
    When I Click "The Open Button Within The Hot And Cold Numbers Panel In The Game Table"
    Then I Verify The Functionality Of "The Open Button Within The Hot And Cold Numbers Panel In The Game Table"

  # ****************************************************************************************************
  # ** Tool Bar of the Game Table Page
  # ****************************************************************************************************

  @FTTest60To61
  Scenario: Test Case 60 To 61: Checking The Functionality Of The Edit Chips Button In The Game Table
    # Test Case 60
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Edit Chips Button In The Game Table"
    Then I Verify The Functionality Of "The Edit Chips Button In The Game Table"
    # Test Case 61
    When I Click "The Remove Chip Button Within The Chip Settings Panel In The Game Table"
    And I Click "The Close Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Functionality Of "The Close Button Within The Chip Settings Panel In The Game Table"

  @FTTest62To63
  Scenario: Test Case 62 To 63: Checking The Functionality Of The Arrow Buttons Within The Chip Settings Panel In The Game Table
    # Test Case 62
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Edit Chips Button In The Game Table"
    When I Click "The Next Arrow Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Functionality Of "The Next Arrow Button Within The Chip Settings Panel In The Game Table"
    # Test Case 63
    When I Click "The Previous Arrow Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Functionality Of "The Previous Arrow Button Within The Chip Settings Panel In The Game Table"

  @FTTest64
  Scenario: Test Case 64: Checking The Functionality Of The Remove Chip Button Within The Chip Settings Panel In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Edit Chips Button In The Game Table"
    And I Click "The Remove Chip Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Functionality Of "The Remove Chip Button Within The Chip Settings Panel In The Game Table"

  @FTTest65
  Scenario: Test Case 65: Checking The Functionality Of The Add Chip Button Within The Chip Settings Panel In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Edit Chips Button In The Game Table"
    And I Click "The Remove Chip Button Within The Chip Settings Panel In The Game Table"
    And I Click "The Add Chip Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Functionality Of "The Add Chip Button Within The Chip Settings Panel In The Game Table"

  @FTTest66
  Scenario: Test Case 66: Checking The Functionality Of The Save Button Within The Chip Settings Panel In The Game Table
    When I Enter Any Game Table
    And I Wait "Until The Game Is Betting Phase In The Game Table"
    And I Click "The Edit Chips Button In The Game Table"
    And I Click "The Remove Chip Button Within The Chip Settings Panel In The Game Table"
    And I Click "The Add Chip Button Within The Chip Settings Panel In The Game Table"
    And I Click "The Save Button Within The Chip Settings Panel In The Game Table"
    Then I Verify The Functionality Of "The Save Button Within The Chip Settings Panel In The Game Table"

  @FTTest67
  Scenario: Test Case 67: Checking The Functionality Of Each Chip Within The Default Chips In The Game Table
    When I Enter Any Game Table
    And I Bet "Each Chip In The Default Chips In Any Betting Option"
    Then I Verify The Functionality Of "Each Chip Within The Default Chips In The Game Table"

  @FTTest68To69
  Scenario: Test Case 68 To 69: Checking The Functionality Of The Undo Button In The Game Table
    # Test Case 68
    When I Enter Any Game Table
    And I Bet "Four Or More In Any Betting Options"
    And I Click "The Undo Button In The Game Table"
    Then I Verify The Functionality Of "The Undo Button In The Game Table"
    # Test Case 69
    When I Do "Press And Hold The Undo Button In The Game Table"
    Then I Verify The Functionality Of "The Undo Button In The Game Table After Pressing And Holding"

  @FTTest70
  Scenario: Test Case 70: Checking The Functionality Of The Cancel Button In The Game Table
    When I Enter Any Game Table
    And I Bet "Four Or More In Any Betting Options"
    And I Click "The Cancel Button In The Game Table"
    Then I Verify The Functionality Of "The Cancel Button In The Game Table"

  @FTTest71
  Scenario: Test Case 71: Checking The Functionality Of The Double Button In The Game Table
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Double Button In The Game Table"
    Then I Verify The Functionality Of "The Double Button In The Game Table"

  @FTTest72To73
  Scenario: Test Case 72 To 73: Checking The Functionality Of The Confirm Button In The Game Table
    # Test Case 72
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    Then I Verify The Functionality Of "The Confirm Button In The Game Table"
    # Test Case 73
    When I Bet "In The Betting Option Again"
    And I Click "The Confirm Button In The Game Table"
    Then I Verify The Functionality Of "The Confirm Button In The Game Table When There Is A Confirmed Bet"

  @FTTest74
  Scenario: Test Case 74: Checking The Functionality Of The Top Up Confirm Button In The Game Table
    When I Enter Any Game Table
    And I Bet "Lower Than Minimum Bet Limit In Any Betting Option"
    And I Click "The Top Up Confirm Button In The Game Table"
    Then I Verify The Functionality Of "The Top Up Confirm Button In The Game Table"

  @FTTest75
  Scenario: Test Case 75: Checking The Functionality Of The ReBet Button In The Game Table
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    And I Wait "Until The Round Is Settled In The Game Table"
    And I Click "The ReBet Button In The Game Table"
    Then I Verify The Functionality Of "The ReBet Button In The Game Table"

  # ****************************************************************************************************
  # ** Betting Option Panel of the Game Table Page
  # ****************************************************************************************************

  @FTTest76
  Scenario: Test Case 76: Checking The Functionality Of Any Betting Option In The Game Table
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    Then I Verify The Functionality Of "Any Betting Option In The Game Table"

  @FTTest77
  Scenario: Test Case 77: Checking The Functionality Of All Betting Option In The Game Table
    When I Enter Any Game Table
    And I Bet "In Each Betting Option"
    Then I Verify The Functionality Of "All Betting Option In The Game Table"

  @FTTest78
  Scenario: Test Case 78: Checking The Behavior Of The Betting Option In The Game Table When There Is A Placed Bet
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Bet "In The Betting Option Again"
    Then I Verify The Functionality Of "The Betting Option In The Game Table When There Is A Placed Bet"

  @FTTest79
  Scenario: Test Case 79: Checking The Functionality Of The Confirm Button Within The Confirmation Modal In The Game Table
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Wait "Until The Betting Timer Is Less Than 10 Seconds In The Game Table"
    And I Click "The Confirm Button Within The Confirmation Modal In The Game Table"
    Then I Verify The Functionality Of "The Confirm Button Within The Confirmation Modal In The Game Table"

  @FTTest80
  Scenario: Test Case 80: Checking The Functionality Of The Not Now Button Within The Confirmation Modal In The Game Table
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Wait "Until The Betting Timer Is Less Than 10 Seconds In The Game Table"
    And I Click "The Not Now Button Within The Confirmation Modal In The Game Table"
    Then I Verify The Functionality Of "The Not Now Button Within The Confirmation Modal In The Game Table"

  # ****************************************************************************************************
  # ** Result Panel of the Game Table Page
  # ****************************************************************************************************

  @FTTest81
  Scenario: Test Case 81: Checking The Functionality Of The Result Panel After The Player Wins A Round
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    And I Wait "Until The Player Wins A Round In The Game Table"
    Then I Verify The Functionality Of "The Result Panel After The Player Wins A Round"

  @FTTest82
  Scenario: Test Case 82: Checking The Functionality Of The Result Panel After The Player Loses A Round
    When I Enter Any Game Table
    And I Bet "In Any Betting Option"
    And I Click "The Confirm Button In The Game Table"
    And I Wait "Until The Player Loses A Round In The Game Table"
    Then I Verify The Functionality Of "The Result Panel After The Player Loses A Round"