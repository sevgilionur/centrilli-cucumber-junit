Feature: Login Functionality
  As a registered I should be able to login to my account so that I can use the modules.

  Scenario Outline: Verify that I can login with valid credentials as salesmanager
    When User goes to application page
    And User enters valid "<email>" and "<password>" and clicks enter
    Then User lands on homepage as salesmanager

    Examples:
      | email                    | password     |
      | salesmanager5@info.com   | salesmanager |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager7@info.com   | salesmanager |
      | salesmanager8@info.com   | salesmanager |
      | salesmanager9@info.com   | salesmanager |
      | salesmanager10@info.com  | salesmanager |
      | salesmanager11@info.com  | salesmanager |
      | salesmanager12@info.com  | salesmanager |
      | salesmanager13@info.com  | salesmanager |
      | salesmanager14@info.com  | salesmanager |
      | salesmanager15@info.com  | salesmanager |
      | salesmanager16@info.com  | salesmanager |
      | salesmanager17@info.com  | salesmanager |
      | salesmanager18@info.com  | salesmanager |
      | salesmanager19@info.com  | salesmanager |
      | salesmanager20@info.com  | salesmanager |
      | salesmanager21@info.com  | salesmanager |
      | salesmanager22@info.com  | salesmanager |
      | salesmanager23@info.com  | salesmanager |
      | salesmanager24@info.com  | salesmanager |
      | salesmanager26@info.com  | salesmanager |
      | salesmanager27@info.com  | salesmanager |
      | salesmanager28@info.com  | salesmanager |
      | salesmanager29@info.com  | salesmanager |
      | salesmanager30@info.com  | salesmanager |
      | salesmanager31@info.com  | salesmanager |
      | salesmanager32@info.com  | salesmanager |
      | salesmanager33@info.com  | salesmanager |
      | salesmanager34@info.com  | salesmanager |
      | salesmanager35@info.com  | salesmanager |
      | salesmanager36@info.com  | salesmanager |
      | salesmanager37@info.com  | salesmanager |
      | salesmanager38@info.com  | salesmanager |
      | salesmanager39@info.com  | salesmanager |
      | salesmanager40@info.com  | salesmanager |
      | salesmanager41@info.com  | salesmanager |
      | salesmanager42@info.com  | salesmanager |
      | salesmanager43@info.com  | salesmanager |
      | salesmanager44@info.com  | salesmanager |
      | salesmanager45@info.com  | salesmanager |
      | salesmanager46@info.com  | salesmanager |
      | salesmanager47@info.com  | salesmanager |
      | salesmanager48@info.com  | salesmanager |
      | salesmanager49@info.com  | salesmanager |
      | salesmanager50@info.com  | salesmanager |
      | salesmanager51@info.com  | salesmanager |
      | salesmanager52@info.com  | salesmanager |
      | salesmanager53@info.com  | salesmanager |
      | salesmanager54@info.com  | salesmanager |
      | salesmanager55@info.com  | salesmanager |
      | salesmanager56@info.com  | salesmanager |
      | salesmanager57@info.com  | salesmanager |
      | salesmanager58@info.com  | salesmanager |
      | salesmanager59@info.com  | salesmanager |
      | salesmanager60@info.com  | salesmanager |
      | salesmanager61@info.com  | salesmanager |
      | salesmanager62@info.com  | salesmanager |
      | salesmanager63@info.com  | salesmanager |
      | salesmanager64@info.com  | salesmanager |
      | salesmanager65@info.com  | salesmanager |
      | salesmanager66@info.com  | salesmanager |
      | salesmanager67@info.com  | salesmanager |
      | salesmanager68@info.com  | salesmanager |
      | salesmanager69@info.com  | salesmanager |
      | salesmanager70@info.com  | salesmanager |
      | salesmanager71@info.com  | salesmanager |
      | salesmanager72@info.com  | salesmanager |
      | salesmanager73@info.com  | salesmanager |
      | salesmanager74@info.com  | salesmanager |
      | salesmanager75@info.com  | salesmanager |
      | salesmanager76@info.com  | salesmanager |
      | salesmanager77@info.com  | salesmanager |
      | salesmanager78@info.com  | salesmanager |
      | salesmanager79@info.com  | salesmanager |
      | salesmanager80@info.com  | salesmanager |
      | salesmanager81@info.com  | salesmanager |
      | salesmanager82@info.com  | salesmanager |
      | salesmanager83@info.com  | salesmanager |
      | salesmanager84@info.com  | salesmanager |
      | salesmanager85@info.com  | salesmanager |
      | salesmanager86@info.com  | salesmanager |
      | salesmanager87@info.com  | salesmanager |
      | salesmanager88@info.com  | salesmanager |
      | salesmanager89@info.com  | salesmanager |
      | salesmanager90@info.com  | salesmanager |
      | salesmanager91@info.com  | salesmanager |
      | salesmanager92@info.com  | salesmanager |
      | salesmanager93@info.com  | salesmanager |
      | salesmanager94@info.com  | salesmanager |
      | salesmanager95@info.com  | salesmanager |
      | salesmanager96@info.com  | salesmanager |
      | salesmanager97@info.com  | salesmanager |
      | salesmanager98@info.com  | salesmanager |
      | salesmanager99@info.com  | salesmanager |
      | salesmanager100@info.com | salesmanager |
      | salesmanager101@info.com | salesmanager |
      | salesmanager102@info.com | salesmanager |
      | salesmanager103@info.com | salesmanager |
      | salesmanager104@info.com | salesmanager |
      | salesmanager105@info.com | salesmanager |


  Scenario Outline: Verify that I can login with valid credentials as salesmanager
    When User goes to application page
    And User enters valid "<email>" and "<password>"
    And User clicks login button
    Then User lands on homepage as salesmanager

    Examples:
      | email                    | password     |
      | salesmanager5@info.com   | salesmanager |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager7@info.com   | salesmanager |
      | salesmanager8@info.com   | salesmanager |
      | salesmanager9@info.com   | salesmanager |
      | salesmanager10@info.com  | salesmanager |
      | salesmanager11@info.com  | salesmanager |
      | salesmanager12@info.com  | salesmanager |
      | salesmanager13@info.com  | salesmanager |
      | salesmanager14@info.com  | salesmanager |
      | salesmanager15@info.com  | salesmanager |
      | salesmanager16@info.com  | salesmanager |
      | salesmanager17@info.com  | salesmanager |
      | salesmanager18@info.com  | salesmanager |
      | salesmanager19@info.com  | salesmanager |
      | salesmanager20@info.com  | salesmanager |
      | salesmanager21@info.com  | salesmanager |
      | salesmanager22@info.com  | salesmanager |
      | salesmanager23@info.com  | salesmanager |
      | salesmanager24@info.com  | salesmanager |
      | salesmanager26@info.com  | salesmanager |
      | salesmanager27@info.com  | salesmanager |
      | salesmanager28@info.com  | salesmanager |
      | salesmanager29@info.com  | salesmanager |
      | salesmanager30@info.com  | salesmanager |
      | salesmanager31@info.com  | salesmanager |
      | salesmanager32@info.com  | salesmanager |
      | salesmanager33@info.com  | salesmanager |
      | salesmanager34@info.com  | salesmanager |
      | salesmanager35@info.com  | salesmanager |
      | salesmanager36@info.com  | salesmanager |
      | salesmanager37@info.com  | salesmanager |
      | salesmanager38@info.com  | salesmanager |
      | salesmanager39@info.com  | salesmanager |
      | salesmanager40@info.com  | salesmanager |
      | salesmanager41@info.com  | salesmanager |
      | salesmanager42@info.com  | salesmanager |
      | salesmanager43@info.com  | salesmanager |
      | salesmanager44@info.com  | salesmanager |
      | salesmanager45@info.com  | salesmanager |
      | salesmanager46@info.com  | salesmanager |
      | salesmanager47@info.com  | salesmanager |
      | salesmanager48@info.com  | salesmanager |
      | salesmanager49@info.com  | salesmanager |
      | salesmanager50@info.com  | salesmanager |
      | salesmanager51@info.com  | salesmanager |
      | salesmanager52@info.com  | salesmanager |
      | salesmanager53@info.com  | salesmanager |
      | salesmanager54@info.com  | salesmanager |
      | salesmanager55@info.com  | salesmanager |
      | salesmanager56@info.com  | salesmanager |
      | salesmanager57@info.com  | salesmanager |
      | salesmanager58@info.com  | salesmanager |
      | salesmanager59@info.com  | salesmanager |
      | salesmanager60@info.com  | salesmanager |
      | salesmanager61@info.com  | salesmanager |
      | salesmanager62@info.com  | salesmanager |
      | salesmanager63@info.com  | salesmanager |
      | salesmanager64@info.com  | salesmanager |
      | salesmanager65@info.com  | salesmanager |
      | salesmanager66@info.com  | salesmanager |
      | salesmanager67@info.com  | salesmanager |
      | salesmanager68@info.com  | salesmanager |
      | salesmanager69@info.com  | salesmanager |
      | salesmanager70@info.com  | salesmanager |
      | salesmanager71@info.com  | salesmanager |
      | salesmanager72@info.com  | salesmanager |
      | salesmanager73@info.com  | salesmanager |
      | salesmanager74@info.com  | salesmanager |
      | salesmanager75@info.com  | salesmanager |
      | salesmanager76@info.com  | salesmanager |
      | salesmanager77@info.com  | salesmanager |
      | salesmanager78@info.com  | salesmanager |
      | salesmanager79@info.com  | salesmanager |
      | salesmanager80@info.com  | salesmanager |
      | salesmanager81@info.com  | salesmanager |
      | salesmanager82@info.com  | salesmanager |
      | salesmanager83@info.com  | salesmanager |
      | salesmanager84@info.com  | salesmanager |
      | salesmanager85@info.com  | salesmanager |
      | salesmanager86@info.com  | salesmanager |
      | salesmanager87@info.com  | salesmanager |
      | salesmanager88@info.com  | salesmanager |
      | salesmanager89@info.com  | salesmanager |
      | salesmanager90@info.com  | salesmanager |
      | salesmanager91@info.com  | salesmanager |
      | salesmanager92@info.com  | salesmanager |
      | salesmanager93@info.com  | salesmanager |
      | salesmanager94@info.com  | salesmanager |
      | salesmanager95@info.com  | salesmanager |
      | salesmanager96@info.com  | salesmanager |
      | salesmanager97@info.com  | salesmanager |
      | salesmanager98@info.com  | salesmanager |
      | salesmanager99@info.com  | salesmanager |
      | salesmanager100@info.com | salesmanager |
      | salesmanager101@info.com | salesmanager |
      | salesmanager102@info.com | salesmanager |
      | salesmanager103@info.com | salesmanager |
      | salesmanager104@info.com | salesmanager |
      | salesmanager105@info.com | salesmanager |

















