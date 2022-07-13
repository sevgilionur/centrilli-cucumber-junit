Feature:  Logout functionality
@ob
  Scenario Outline:Verify that user can log out via the logout button in the profile dropdown menu.

  Given User goes to application page enter valid "<email>" and "<password>" clicks enter ob
  When user clicks on username ob
  And user clicks on logout button ob
  Then user log out correctly ob
  Examples:
    | email                      | password         |
    | posmanager6@info.com       | posmanager       |
    | salesmanager6@info.com     | salesmanager     |
    | imm11@info.com             | inventorymanager |
    | expensesmanager11@info.com | expensesmanager  |