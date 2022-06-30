Feature: Login Functionality
  As a registered I should be able to login to my account so that I can use the modules.

  Scenario Outline: Verify that I can login with valid credentials as salesmanager
    When User goes to application page
    And User enters valid "<email>" and "<password>"
    And User clicks enter button
    Then User lands on homepage

    Examples:
      | email | password |
      |salesmanager10@info.com|salesmanager|

