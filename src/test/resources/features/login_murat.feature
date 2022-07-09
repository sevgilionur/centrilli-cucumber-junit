Feature: Login functionality

  @me
  Scenario Outline: User should be able to login to my account with valid credentials.
    When User goes to application login page_me
    And User enters valid username_me "<username>"
    And User enters valid password_me "<password>"
    And User clicks the login button_me
    Then User reach the salesmanager home page_me

    Examples:
      | username                 | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager7@info.com   | salesmanager |