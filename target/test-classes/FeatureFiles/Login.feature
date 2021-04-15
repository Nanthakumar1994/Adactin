Feature: To validate login functionality

Scenario Outline: To validate the login functionality with invalid user name and invalid password

Given User is in facebook login page
When User enter invalid "<username>" and "<password>"
And User click login button
Then User should be in invalid credentials page
Examples:
|username|password|
|java    |java123|
|nanthadvn@gmail.com |Nantha@94|
|sel     |selenium123|
