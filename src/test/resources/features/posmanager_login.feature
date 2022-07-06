Feature: Login Functionality
  As a registered I should be able to login to my account so that I can use the modules.

  Scenario Outline: Verify that I can login with valid credentials as posmanager by clicking enter
    When User goes to application page
    And User enters valid "<email>" and "<password>" and clicks enter
    Then User lands on homepage as posmanager

    Examples:
      | email                  | password   |
      | posmanager6@info.com   | posmanager |
      | posmanager7@info.com   | posmanager |



  Scenario Outline: Verify that I can login with valid credentials as posmanager by clicking login button
    When User goes to application page
    And User enters valid "<email>" and "<password>"
    And User clicks login button
    Then User lands on homepage as posmanager

    Examples:
      | email                  | password   |
      | posmanager6@info.com   | posmanager |
      | posmanager7@info.com   | posmanager |
