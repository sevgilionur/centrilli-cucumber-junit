Feature: Login
  Scenario: As a salesmanager I should be able to login with valid credentials
    Given I am on the login page_mks
    Then I enter username and password_mks
    When  I click enter I should be navigate to Dashboard_mks