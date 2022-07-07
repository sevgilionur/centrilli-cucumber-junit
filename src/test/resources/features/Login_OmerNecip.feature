Feature: Login fuctionality

  Agile story: As a user , When I am login on the Login page on centrilli.com

  I should be able to search whatever I want and see relevant information

   @ncp
  Scenario Outline: User should be able to enters valid username and password
    Given User goes to Centrilli page
    When user  enters valid "<username>"_necip
    And user enters "<password>"_necip
    Then user clicks the login button_necip
    And user should see the homepage as expensesmanager_necip

    Examples:
      | username                    | password        |
      | expensesmanager10@info.com  | expensesmanager |
      | expensesmanager11@info.com  | expensesmanager |

@omr
  Scenario Outline: Verify that I can not login with invalid credentials
    When User goes to Centrilli page
    And User enters invalid  "<username>" and valid "<password>" and clicks_necip
    Then Verify that error message_necip

    Examples:
      | username                      | password         |
      | expensesmanager10000@info.com | expensesmanager  |
      | posmanager60000@info.com      | posmanager       |

  @svd
  Scenario Outline: Verify that I can not login with invalid credentials
    When User goes to Centrilli page_necip
    And User enters valid  "<username>" and invalid "<password>" and clicks_necip
    Then Verify that error message_necip

    Examples:
      | username                   | password          |
      | expensesmanager10@info.com | expensesmanagerr  |
      | posmanager60@info.com      | posmanagerr       |

    @elf
  Scenario Outline: User should be able to see please fill out this field message
  when leaves empty username
    When User goes to Centrilli page
    When user  enters valid "<username>"_necip
    Then user clicks the login button_necip
    Then User verifies that I got message if I leave empty password_necip

    Examples:
      | username                   |
      | imm10@info.com             |
      | expensesmanager10@info.com |

@onr
  Scenario Outline: User should be able to see please fill out this field message
  when leaves empty username
    When User goes to Centrilli page_necip
    Then user enters "<password>"_necip
    Then user clicks the login button_necip
    Then User verifies that I got message if I leave empty username_necip

    Examples:
      | password         |
      | expensesmanager  |
      | posmanager       |



