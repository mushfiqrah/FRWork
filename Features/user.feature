Feature: Registering on amazon.com

Scenario: Creating a user ID

Given I navigate to Amazons home page
When select new customer, "<user name>" , "<email>" , "<password>" , "<comfirm password>"
Then i will get confirmation notification
