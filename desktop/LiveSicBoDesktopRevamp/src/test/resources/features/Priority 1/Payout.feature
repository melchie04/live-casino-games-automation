@Payout @FullRun @Maintenance
Feature: Payout

  @FetchResult
  Scenario: Fetch Result: Wait Until There Is A Round Result For Payout
    Given I Have Logged In To The Website
    When I Navigate To The Live Casino Page
    And I Enter The Live Sic Bo Desktop Revamp Thumbnail
    And I Enter Any Game Table
    Then I Place A Bet Until There Is 50 Round Result For All Payouts
    # ** Payout Round Results
      | Small                    |
      | Big                      |
      | Even                     |
      | Odd                      |
      | Any Triple               |
      | Three Dice Total 4 & 17  |
      | Three Dice Total 5 & 16  |
      | Three Dice Total 6 & 15  |
      | Three Dice Total 7 & 14  |
      | Three Dice Total 8 & 13  |
      | Three Dice Total 9 & 12  |
      | Three Dice Total 10 & 11 |
      | Specific Triple          |
      | Single Dice              |
      | Two Dice Combo           |
      | Specific Double          |

  @POTest1
  Scenario: Test Case 1: Checking The Payout Of The Small Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Small Result"

  @POTest2
  Scenario: Test Case 2: Checking The Payout Of The Big Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Big Result"

  @POTest3
  Scenario: Test Case 3: Checking The Payout Of The Even Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Even Result"

  @POTest4
  Scenario: Test Case 4: Checking The Payout Of The Odd Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Odd Result"

  @POTest5
  Scenario: Test Case 5: Checking The Payout Of The Any Triple Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Any Triple Result"

  @POTest6
  Scenario: Test Case 6: Checking The Payout Of The Three Dice Total 4 & 17 Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Three Dice Total 4 & 17 Result"

  @POTest7
  Scenario: Test Case 7: Checking The Payout Of The Three Dice Total 5 & 16 Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Three Dice Total 5 & 16 Result"

  @POTest8
  Scenario: Test Case 8: Checking The Payout Of The Three Dice Total 6 & 15 Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Three Dice Total 6 & 15 Result"

  @POTest9
  Scenario: Test Case 9: Checking The Payout Of The Three Dice Total 7 & 14 Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Three Dice Total 7 & 14 Result"

  @POTest10
  Scenario: Test Case 10: Checking The Payout Of The Three Dice Total 8 & 13 Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Three Dice Total 8 & 13 Result"

  @POTest11
  Scenario: Test Case 11: Checking The Payout Of The Three Dice Total 9 & 12 Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Three Dice Total 9 & 12 Result"

  @POTest12
  Scenario: Test Case 12: Checking The Payout Of The Three Dice Total 10 & 11 Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Three Dice Total 10 & 11 Result"

  @POTest13
  Scenario: Test Case 13: Checking The Payout Of The Specific Triple Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Specific Triple Result"

  @POTest14
  Scenario: Test Case 14: Checking The Payout Of The 1 To 1 On One Dice Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 1 To 1 On One Dice Result"

  @POTest15
  Scenario: Test Case 15: Checking The Payout Of The 2 To 1 On One Dice Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 2 To 1 On One Dice Result"

  @POTest16
  Scenario: Test Case 16: Checking The Payout Of The 3 To 1 On One Dice Result
    When I Check The Round Result
    Then I Verify The Payout Of "The 3 To 1 On One Dice Result"

  @POTest17
  Scenario: Test Case 17: Checking The Payout Of The Two Dice Combo Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Two Dice Combo Result"

  @POTest18
  Scenario: Test Case 18: Checking The Payout Of The Specific Double Result
    When I Check The Round Result
    Then I Verify The Payout Of "The Specific Double Result"