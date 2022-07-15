Feature: Logout Functionality
  As a logged in user I should be securely able to logout so that I can end my sessiond

  @logout_os
  Scenario Outline: Verify that user can log out via the logout button in the profile dropdown menu
    Given User goes to application page enter valid "<email>" and "<password>" clicks enter
    And User clicks profile dropdown menu
    And User clicks logout button
    And User clicks navigate back button
    Then User logs out successfully

    Examples:
      | email                      | password         |
      | posmanager15@info.com      | posmanager       |
      | salesmanager16@info.com    | salesmanager     |
      | imm56@info.com             | inventorymanager |
      | expensesmanager26@info.com | expensesmanager  |
      | manuf_user36@info.com      | manufuser        |



