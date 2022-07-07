Feature: Login Functioanality

Scenario Outline: Verify that I can login with valid credentials as salesmanager by clicking enter
When User goes to application page gy
And User enters valid "<email>" and "<password>" and clicks enter gy
Then User lands on homepage as salesmanager gy

Examples:
| email                 | password     |
| salesmanager100@info.com   | salesmanager |


Scenario Outline: Verify that I can login with valid credentials as salesmanager by clicking login button
When User goes to application page gy
And User enters valid "<email>" and "<password>" gy
And User clicks login button gy
Then User lands on homepage as salesmanager gy

Examples:
| email                 | password     |
| salesmanager100@info.com   | salesmanager |