@salesforce @td2
Feature: Dashboard tests
  in order to add an additional product subscription via Naviance.
  as a Naviance user
  I want to verify that API calls do not produce an error.

Scenario Outline: Verify Salesforce
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I submit a new product subscription
  Then the subscription is submitted successfully

Examples:
  | account     | user       | password  |
  | rtd1        | stan.smith | stan01!   |

