Feature: Login Functionality
  As a registered I should be able to login to my account so that I can use the modules.
@ob
  Scenario Outline: Verify that I can login with valid credentials as posmanager by clicking enter
    When User goes to application page ob
    And User enters valid "<email>" and "<password>" and clicks enter ob
    Then User lands on homepage as posmanager ob

    Examples:
      | email                 | password   |
      | posmanager12@info.com | posmanager |
      | posmanager13@info.com | posmanager |








