@rf
Feature: Logout Functionality
  Agile story: As a user, When I logged in,
  I should be able to log out

  Scenario Outline: Verify that user can log out
    Given User goes to application page enter valid "<username>" and "<password>" clicks_necip
    And User clicks on user dropdown menu_necip
    When user clicks on logout button_necip
    Then user should see the Login Page_necip

    Examples:
      | username              | password   |
      | posmanager15@info.com | posmanager |
