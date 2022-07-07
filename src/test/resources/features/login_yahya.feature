Feature: Login Functionality
  As a registered I should be able to login to my account so that I can use the modules.

  @ac1tc1pos
  Scenario Outline: Verify that the user can login with valid credentials as "posmanager" by pressing enter key
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>" and press enter key
    Then User on homepage as posmanager
    Examples:
      | email                | password   |
      | posmanager6@info.com | posmanager |
      | posmanager7@info.com | posmanager |

  @ac1tc2pos
  Scenario Outline: Verify that the user can login with valid credentials as "posmanager" by clicking on login button
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>"
    And  User click on login button
    Then User on homepage as posmanager
    Examples:
      | email                | password   |
      | posmanager6@info.com | posmanager |
      | posmanager7@info.com | posmanager |

  @ac1tc1sales
  Scenario Outline: Verify that the user can login with valid credentials as "sales manager" by pressing enter key
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>" and press enter key
    Then User on homepage as salesmanager
    Examples:
      | email                  | password     |
      | salesmanager5@info.com | salesmanager |
      | salesmanager6@info.com | salesmanager |

  @ac1tc2sales
  Scenario Outline: Verify that the user can login with valid credentials as "sales manager" by clicking on login button
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>"
    And  User click on login button
    Then User on homepage as salesmanager
    Examples:
      | email                  | password     |
      | salesmanager5@info.com | salesmanager |
      | salesmanager6@info.com | salesmanager |

  @ac1tc1exp
  Scenario Outline: Verify that the user can login with valid credentials as "expense manager" by pressing enter key
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>" and press enter key
    Then User on homepage as expense manager
    Examples:
      | email                      | password        |
      | expensesmanager10@info.com | expensesmanager |
      | expensesmanager11@info.com | expensesmanager |

  @ac1tc2exp
  Scenario Outline: Verify that the user can login with valid credentials as "expense manager" by clicking on login button
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>"
    And  User click on login button
    Then User on homepage as expense manager
    Examples:
    Examples:
      | email                      | password        |
      | expensesmanager10@info.com | expensesmanager |
      | expensesmanager11@info.com | expensesmanager |

  @ac1tc1inv
  Scenario Outline: Verify that the user can login with valid credentials as "inventory manager" by pressing enter key
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>" and press enter key
    Then User on homepage as inventory manager
    Examples:
      | email          | password         |
      | imm10@info.com | inventorymanager |
      | imm11@info.com | inventorymanager |

  @ac1tc2inv
  Scenario Outline: Verify that the user can login with valid credentials as "inventory manager" by clicking on login button
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>"
    And  User click on login button
    Then User on homepage as inventory manager
    Examples:
      | email          | password         |
      | imm10@info.com | inventorymanager |
      | imm11@info.com | inventorymanager |

  @ac1tc1mnf
  Scenario Outline: Verify that the user can login with valid credentials as "manufacturing user" by pressing enter key
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>" and press enter key
    Then User on homepage as manufacturing user
    Examples:
      | email                 | password  |
      | manuf_user10@info.com | manufuser |
      | manuf_user11@info.com | manufuser |

  @ac1tc2mnf
  Scenario Outline: Verify that the user can login with valid credentials as "manufacturing user" by clicking on login button
    When User goes to the application login page
    And  User enters valid email "<email>" and valid password "<password>"
    And  User click on login button
    Then User on homepage as manufacturing user
    Examples:
      | email                 | password  |
      | manuf_user10@info.com | manufuser |
      | manuf_user11@info.com | manufuser |


