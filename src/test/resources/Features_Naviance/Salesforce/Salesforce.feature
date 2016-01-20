@salesforce @td2
Feature: Dashboard tests
  in order to add an additional product subscription via Naviance.
  as a Naviance user
  I want to verify that API calls do not produce an error.

Scenario Outline: Verify Salesforce
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  And I am navigate to School account
  And I am navigate to Manage Subscriptions
  And I select a product
  And I select Start Date
  And I select End Date
  And I click on Next button
  And I select a form of payment
  And I write PO Number
  And I click on Submit button
  Then I verify that API Calls do not produce an error

Examples:
  | account     | user       | password  |
  | rtd1        | stan.smith | stan01!   |

