Feature:
  Background:
    Given User login on the page
    Then User click to credit card button

    @Cash_Rewards_Credit_Cards_Apply
    Scenario: User should be able to apply to Cash Rewards Card
      Given User click to Cash Rewards Credit Card button
      Then User click to Apply Now button
      And User fill out information side
      When User click Save and Continue button
      Then User verify that display Submit my Application
