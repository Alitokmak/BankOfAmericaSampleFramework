Feature:
  As a user I should able to access BAO site

  @Login
  Scenario: User goes to BAO website
    Given User login on the page
    Then verify thatpage title "Bank of America - Banking, Credit Cards, Loans and Merrill Investing"

