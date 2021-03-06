@CNT-1264
Feature: Logout Functionality
  As a logged in user I should be securely able to logout so that I can end my session

  @CNT-1263
  Scenario Template:Verify that user can log out via the logout button in the profile dropdown menu

    Given User goes to application page_me
    When User enter valid "<email>" and "<password>" clicks enter_me
    And User clicks to profile dropdown menu where top of right corner_me
    And User clicks logout button_me
    Then User logs out successfully_me

    Examples:
      | email                      | password         |
      | posmanager15@info.com      | posmanager       |
      | salesmanager16@info.com    | salesmanager     |

  @CNT-1270
  Scenario:Verify that user can log out via the logout button in the profile dropdown menu_me

    Given User on the application home page_me
    When User clicks to profile dropdown menu where top of right corner_me
    And User clicks logout button_me
    Then User logs out successfully_me


