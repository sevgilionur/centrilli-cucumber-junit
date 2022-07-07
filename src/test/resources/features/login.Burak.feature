Feature: Login functionality

  Scenario Outline: User should be able to login to my account with valid credentials.
    When User goes to application login page_bs
    And User enters valid username_bs "<username>"
    And User enters valid password_bs "<password>"
    And User clicks the login button_bs
    Then User reach the salesmanager home page_bs
@bs
    Examples:
      | username                 | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager7@info.com   | salesmanager |