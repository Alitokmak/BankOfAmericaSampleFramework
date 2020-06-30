Feature:
Background:
  Given User login on the page

  @credit_card
  Scenario: User should be able to see all credit card options
    Given User click to credit card button
    Then verify that all credit cards options
    |Cash Rewards Credit Cards        |
    |Travel and Airlines Rewards Cards|
    |Lower Interest Rate Cards        |
    |Points Rewards Cards             |
    |Cards to Build or Rebuild Credit |
    |Cards for Students               |
