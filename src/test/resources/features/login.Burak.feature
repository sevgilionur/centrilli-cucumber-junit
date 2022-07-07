Feature: Login functionality

  Scenario Outline: User should be able to login to my account with valid credentials.
    When User goes to application login page
    And User enters valid username "<username>"
    And User enters valid password "<password>"
    And User clicks the login button
    Then User reach the salesmanager home page

    Examples:
      | username                 | password     |
      | salesmanager6@info.com   | salesmanager |