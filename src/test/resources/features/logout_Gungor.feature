Feature: Logout Functionality

@gungor

    Scenario Outline:Verify that user can log out via the logout button in the profile dropdown menu.
      Given User goes to application page enter valid "<email>" and "<password>" clicks enter
      When user clicks on username gy
      And user clicks on logout button gy
      Then user log out correctly gy

      Examples:
        | email                      | password         |
        | posmanager15@info.com      | posmanager       |
        | salesmanager16@info.com    | salesmanager     |
        | imm56@info.com             | inventorymanager |
        | expensesmanager26@info.com | expensesmanager  |



