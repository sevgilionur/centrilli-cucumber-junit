Feature: Login Functionality
  As a registered user should be able to login to my account so that I can use the modules.

@onur
  Scenario Outline: Verify that user got message if leaves password empty
    When User goes to application page
    And User enters valid email "<email>"
    And User clicks the login button
    Then User gets Please fill out this field message from password field
    Examples:
      | email                      |
      | imm16@info.com             |
      | expensesmanager26@info.com |
      | manuf_user36@info.com      |
      | posmanager46@info.com      |
      | salesmanager56@info.com    |

  @fill
  Scenario Outline: Verify that user got message if leaves email empty
    When User goes to application page
    And User enters valid password "<password>"
    And User clicks the login button
    Then User gets Please fill out this field message from email field
    Examples:
      | password         |
      | inventorymanager |
      | expensesmanager  |
      | manufuser        |
      | posmanager       |
      | salesmanager     |