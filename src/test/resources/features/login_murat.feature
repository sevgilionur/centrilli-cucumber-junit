Feature: Login functionality


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

  @me
  Scenario: User land on the "reset password" page after clicking on the "Reset password" link
    Given User goes to application login page_me
    When user clicks Reset Password link_me
    Then user sees Your Email  box_me