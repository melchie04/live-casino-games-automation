@Payout @FullRun @Maintenance
Feature: Payout

  @FetchResult
  Scenario: Fetch Result: Wait Until There Is A Round Result For Payout
    Given I Have Logged In To The Website
    When I Navigate To The Live Casino Page
    And I Enter The Live Roulette Desktop Revamp Thumbnail
    And I Enter Any Game Table
    Then I Place A Bet Until There Is 50 Round Result For All Payouts
    # ** Payout Round Results
      | Red          |
      | Black        |
      | Even         |
      | Odd          |
      | Low          |
      | High         |
      | 1st Dozen    |
      | 2nd Dozen    |
      | 3rd Dozen    |
      | 1st Column   |
      | 2nd Column   |
      | 3rd Column   |
      | Straight Up  |
      | Split        |
      | Street       |
      | Corner       |
      | Six Line     |
      | Zero Section |
      | Zero Corner  |

  @POTest1
  Scenario: Test Case 1: Checking The Payout Of The Red Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Red Result"

  @POTest2
  Scenario: Test Case 2: Checking The Payout Of The Black Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Black Result"

  @POTest3
  Scenario: Test Case 3: Checking The Payout Of The Even Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Even Result"

  @POTest4
  Scenario: Test Case 4: Checking The Payout Of The Odd Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Odd Result"

  @POTest5
  Scenario: Test Case 5: Checking The Payout Of The Low Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Low Result"

  @POTest6
  Scenario: Test Case 6: Checking The Payout Of The High Result
    When I Check The Round Result
    Then I Verify The Payout Of "The High Result"

  @POTest7
  Scenario: Test Case 7: Checking The Payout Of The First Dozen Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 1st Dozen Result"

  @POTest8
  Scenario: Test Case 8: Checking The Payout Of The Second Dozen Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 2nd Dozen Result"

  @POTest9
  Scenario: Test Case 9: Checking The Payout Of The Third Dozen Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 3rd Dozen Result"

  @POTest10
  Scenario: Test Case 10: Checking The Payout Of The First Column Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 1st Column Result"

  @POTest11
  Scenario: Test Case 11: Checking The Payout Of The Second Column Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 2nd Column Result"

  @POTest12
  Scenario: Test Case 12: Checking The Payout Of The Third Column Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 3rd Column Result"

  @POTest13
  Scenario: Test Case 13: Checking The Payout Of The Straight Up Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Straight Up Result"

  @POTest14
  Scenario: Test Case 14: Checking The Payout Of The Split Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Split Result"

  @POTest15
  Scenario: Test Case 15: Checking The Payout Of The Street Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Street Result"

  @POTest16
  Scenario: Test Case 16: Checking The Payout Of The Corner Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Corner Result"

  @POTest17
  Scenario: Test Case 17: Checking The Payout Of The Six Line Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Six Line Result"

  @POTest18
  Scenario: Test Case 18: Checking The Payout Of The Zero Section Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Zero Section Result"

  @POTest19
  Scenario: Test Case 19: Checking The Payout Of The Zero Corner Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Zero Corner Result"
