Feature: Login
Scenario: user enters valid credentials and try to login home page should be displayed.
Given open the browser and enter test url
Then login page should be displayed
When user enters valid credentials
And click on login button
Then home page should be displayed


