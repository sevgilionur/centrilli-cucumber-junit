@CNT-1252
Feature: Login Funtionality


  @CNT-1251
  Scenario Outline:Verify that user can login with valid credentials as posmanager FY
    When User goes to login page FY
    And User enters valid "<username>" and "<password>" FY
    And User clicks login button FY
    Then User should see the homepage as posmanager FY

    Examples:
      | username              | password   |
      | posmanager10@info.com | posmanager |
      | posmanager15@info.com | posmanager |

  @CNT-1253
  Scenario Outline: Verify that user can not login with invalid credentials FY
    When User goes to login page FY
    And User enters invalid  "<username>" and valid "<password>" FY
    And User clicks login button FY
    Then Verify that error message FY

    Examples:
      | username                 | password        |
      | expensesmanage0@info.com | expensesmanager |

  @CNT-1254
    Scenario Outline: Verify that user can not login with invalid credentials FY
      When User goes to login page FY
      And User enters valid  "<username>" and invalid "<password>" FY
      And User clicks login button FY
      Then Verify that error message FY

      Examples:
        | username              | password |
        | posmanager10@info.com | asdasd   |

  @CNT-1256
  Scenario Outline: User should be able to see please fill out this field message
  when leaves empty password
    When User goes to login page FY
    When User  enters valid "<username>" FY
    Then User clicks login button FY
    Then User verifies that application's error message FY


    Examples:
      | username       |
      | imm10@info.com |


  @CNT-1255
  Scenario Outline: User should be able to see please fill out this field message
  when leaves empty username
    When User goes to login page FY
    When User  enters valid "<password>" without username FY
    Then User clicks login button FY
    Then User verifies that application's error message for password FY


    Examples:
      | password     |
      | salesmanager |


