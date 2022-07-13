Feature: Logout Feature
  As user logged in user should be able to log out

  @loyahya
  Scenario:
    Given User on the homepage
    When  User clicks on user dropdown menu
    Then  User clicks on logout button
    And   User logged out securely