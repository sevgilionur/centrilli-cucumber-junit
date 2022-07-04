Feature: Login Functionality
  As a registered I should be able to login to my account so that I can use the modules


  Scenario Outline: Verify that user can not login with invalid credentials
    When User goes to application page
    And User enters invalid "<email>" , valid "<password>" and clicks enter
    Then User gets Wrong login or password message

    Examples:
      | email                           | password         |
      | expenses.manager@info.com       | expensesmanager  |
      | expenses.@info.com              | expensesmanager  |
      | something@info.com              | expensesmanager  |
      | expensesmanager1313@info.com    | expensesmanager  |
      | expensesmanager14@something.com | expensesmanager  |
      | salesmanager.@info.com          | salesmanager     |
      | something@info.com              | salesmanager     |
      | salesmanager17@something.com    | salesmanager     |
      | salesmanager50..@info.com       | salesmanager     |
      | .............@info.com          | salesmanager     |
      | posmanager.@info.com            | posmanager       |
      | something@info.com              | posmanager       |
      | posmanager17@something.com      | posmanager       |
      | posmanager50..@info.com         | posmanager       |
      | ############@info.com           | posmanager       |
      | manuf_user.@info.com            | manufuser        |
      | something@info.com              | manufuser        |
      | manuf_user12@something.com      | manufuser        |
      | $$$$$_$$$$@info.com             | manufuser        |
      | ....._....14@info.com           | manufuser        |
      | inventorymanager10@info.com     | inventorymanager |
      | .....@info.com                  | inventorymanager |
      | something@info.com              | inventorymanager |
      | $$$13@info.com                  | inventorymanager |
      | imm14@something.com             | inventorymanager |

  Scenario Outline: Verify that I can not login with invalid credentials
    When User goes to application page
    And User enters valid "<email>" , invalid "<password>" and clicks enter
    Then User gets Wrong login or password message

    Examples:
      | email                      | password           |
      | expensesmanager10@info.com | expenses.manager   |
      | expensesmanager11@info.com | something          |
      | expensesmanager12@info.com | expensesmanager12  |
      | expensesmanager13@info.com | managerexpenses    |
      | expensesmanager14@info.com | ...............    |
      | imm10@info.com             | inventory.manager  |
      | imm11@info.com             | inventorymanager.  |
      | imm12@info.com             | something          |
      | imm13@info.com             | inventorymanager13 |
      | imm14@info.com             | ################## |
      | manuf_user10@info.com      | manufuser.         |
      | manuf_user11@info.com      | .manufuser         |
      | manuf_user12@info.com      | something          |
      | manuf_user13@info.com      | $$$$$$$$$          |
      | manuf_user14@info.com      | manuf_user         |
      | posmanager6@info.com       | something          |
      | posmanager7@info.com       | posmanager.        |
      | posmanager8@info.com       | pos_manager        |
      | posmanager9@info.com       | .posmanager        |
      | posmanager10@info.com      | posman             |
      | salesmanager5@info.com     | sales.manager      |
      | salesmanager6@info.com     | salesman           |
      | salesmanager7@info.com     | something          |
      | salesmanager8@info.com     | sales_manager      |
      | salesmanager9@info.com     | .salesmanager      |

  @wip
  Scenario Outline: Verify that I can not login with invalid credentials
    When User goes to application page
    And User enters invalid "<email>" , valid "<password>" and clicks login button
    Then User gets Wrong login or password message

    Examples:
      | email                           | password         |
      | expenses.manager@info.com       | expensesmanager  |
      | expenses.@info.com              | expensesmanager  |
      | something@info.com              | expensesmanager  |
      | expensesmanager1313@info.com    | expensesmanager  |
      | expensesmanager14@something.com | expensesmanager  |
      | salesmanager.@info.com          | salesmanager     |
      | something@info.com              | salesmanager     |
      | salesmanager17@something.com    | salesmanager     |
      | salesmanager50..@info.com       | salesmanager     |
      | .............@info.com          | salesmanager     |
      | posmanager.@info.com            | posmanager       |
      | something@info.com              | posmanager       |
      | posmanager17@something.com      | posmanager       |
      | posmanager50..@info.com         | posmanager       |
      | ############@info.com           | posmanager       |
      | manuf_user.@info.com            | manufuser        |
      | something@info.com              | manufuser        |
      | manuf_user12@something.com      | manufuser        |
      | $$$$$_$$$$@info.com             | manufuser        |
      | ....._....14@info.com           | manufuser        |
      | inventorymanager10@info.com     | inventorymanager |
      | .....@info.com                  | inventorymanager |
      | something@info.com              | inventorymanager |
      | $$$13@info.com                  | inventorymanager |
      | imm14@something.com             | inventorymanager |

  Scenario Outline: Verify that I can not login with invalid credentials
    When User goes to application page
    And User enters valid "<email>" , invalid "<password>" and clicks login button
    Then User gets Wrong login or password message

    Examples:
      | email                      | password           |
      | expensesmanager10@info.com | expenses.manager   |
      | expensesmanager11@info.com | something          |
      | expensesmanager12@info.com | expensesmanager12  |
      | expensesmanager13@info.com | managerexpenses    |
      | expensesmanager14@info.com | ...............    |
      | imm10@info.com             | inventory.manager  |
      | imm11@info.com             | inventorymanager.  |
      | imm12@info.com             | something          |
      | imm13@info.com             | inventorymanager13 |
      | imm14@info.com             | ################## |
      | manuf_user10@info.com      | manufuser.         |
      | manuf_user11@info.com      | .manufuser         |
      | manuf_user12@info.com      | something          |
      | manuf_user13@info.com      | $$$$$$$$$          |
      | manuf_user14@info.com      | manuf_user         |
      | posmanager6@info.com       | something          |
      | posmanager7@info.com       | posmanager.        |
      | posmanager8@info.com       | pos_manager        |
      | posmanager9@info.com       | .posmanager        |
      | posmanager10@info.com      | posman             |
      | salesmanager5@info.com     | sales.manager      |
      | salesmanager6@info.com     | salesman           |
      | salesmanager7@info.com     | something          |
      | salesmanager8@info.com     | sales_manager      |
      | salesmanager9@info.com     | .salesmanager      |