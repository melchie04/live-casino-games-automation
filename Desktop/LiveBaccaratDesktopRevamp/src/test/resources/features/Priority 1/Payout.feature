@Payout @FullRun @Maintenance
Feature: Payout

  @FetchResult
  Scenario: Fetch Result: Wait Until There Is A Round Result For Payout
    Given I Have Logged In To The Website
    When I Navigate To The Live Casino Page
    And I Enter The Live Baccarat Desktop Revamp Thumbnail
    And I Enter Any Game Table
    Then I Place A Bet Until There Is 100 Round Result For All Payouts
    # ** Payout Round Results
      | Commission Player     |
      | Commission Banker     |
      | Commission Tie        |
      | Commission Pair       |
      | Commission Push       |
      | Non-commission Player |
      | Non-commission Banker |
      | Non-commission Tie    |
      | Non-commission Pair   |
      | Non-commission Push   |
      | Dragon Bonus          |
      | Fortune Six           |

  @POTest1
  Scenario: Test Case 1: Checking The Payout Of The Commission Player
    When I Check The Round Result
    Then I Verify The Payout Of "The Commission Player"

  @POTest2
  Scenario: Test Case 2: Checking The Payout Of The Commission Banker
    When I Check The Round Result
    Then I Verify The Payout Of "The Commission Banker"

  @POTest3&5
  Scenario: Test Case 3 & 5: Checking The Payout Of The Commission Tie
    When I Check The Round Result
    Then I Verify The Payout Of "The Commission Tie"

  @POTest4
  Scenario: Test Case 4: Checking The Payout Of The Commission Pair
    When I Check The Round Result
    Then I Verify The Payout Of "The Commission Pair"

  @POTest6
  Scenario: Test Case 6: Checking The Payout Of The Non-commission Player
    When I Check The Round Result
    Then I Verify The Payout Of "The Non-commission Player"

  @POTest7
  Scenario: Test Case 7: Checking The Payout Of The Non-commission Banker
    When I Check The Round Result
    Then I Verify The Payout Of "The Non-commission Banker"

  @POTest8
  Scenario: Test Case 8: Checking The Payout Of The Non-commission Banker Of Six
    When I Check The Round Result
    Then I Verify The Payout Of "The Non-commission Banker Of Six"

  @POTest9&10
  Scenario: Test Case 9 & 10: Checking The Payout Of The Non-commission Tie
    When I Check The Round Result
    Then I Verify The Payout Of "The Non-commission Tie"

  @POTest11
  Scenario: Test Case 11: Checking The Payout Of The Non-commission Pair
    When I Check The Round Result
    Then I Verify The Payout Of "The Non-commission Pair"
#
  @POTest12
  Scenario: Test Case 12: Checking The Payout Of The Dragon Bonus Natural Win
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus Natural Win"

  @POTest13
  Scenario: Test Case 13: Checking The Payout Of The Dragon Bonus Natural Tie
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus Natural Tie"

  @POTest14
  Scenario: Test Case 14: Checking The Payout Of The Dragon Bonus 9 Difference
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus 9 Difference"

  @POTest15
  Scenario: Test Case 15: Checking The Payout Of The Dragon Bonus 8 Difference
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus 8 Difference"

  @POTest16
  Scenario:Test Case 16: Checking The Payout Of The Dragon Bonus 7 Difference
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus 7 Difference"

  @POTest17
  Scenario: Test Case 17: Checking The Payout Of The Dragon Bonus 6 Difference
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus 6 Difference"

  @POTest18
  Scenario: Test Case 18: Checking The Payout Of The Dragon Bonus 5 Difference
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus 5 Difference"

  @POTest19
  Scenario: Test Case 19: Checking The Payout Of The Dragon Bonus 4 Difference
    When I Check The Round Result
    Then I Verify The Payout Of "The Dragon Bonus 4 Difference"

  @POTest20
  Scenario: Test Case 20: Checking The Payout Of The Fortune Six 2 Cards
    When I Check The Round Result
    Then I Verify The Payout Of "The Fortune Six 2 Cards"

  @POTest21
  Scenario: Test Case 21: Checking The Payout Of The Fortune Six 3 Cards
    When I Check The Round Result
    Then I Verify The Payout Of "The Fortune Six 3 Cards"