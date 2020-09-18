@deposit
Feature: Depost
  I want to use deposit method to add some amount to my account

  Scenario Outline: varify the balance after depositing amount
    Given I have <initial>balance
    When I deposit <depositAmount>to my account
    Then I verify the <currentAmount> will be in my account

    Examples: 
      | initial | depositAmount | currentAmount |
      |     100 |           500 |           600 |
      |     500 |          4000 |          4500 |
