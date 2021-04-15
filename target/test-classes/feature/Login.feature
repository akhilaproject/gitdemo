Feature: Application Login

Scenario: HomePage default login

Given I am at net banking landing page
When User login into application with username and password
Then Homepage is populated
And Cards are displayed.