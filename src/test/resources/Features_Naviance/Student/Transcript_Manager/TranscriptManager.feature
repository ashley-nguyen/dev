@transcriptmanager
Feature: Application Manager tests
  in order to navigate to Application Manager
  as a Naviance user
  I want to verify that not page errors is displayed

Scenario Outline: Verify Application Manager actions
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I go to Transcript Manager
  Then I will see data in Transcript Manager selecting <item>
Examples:
  | account     | user       | password  | item                       |
  | rtd1        | stan.smith | stan01!   | class of 2016 (grade 12)   |
