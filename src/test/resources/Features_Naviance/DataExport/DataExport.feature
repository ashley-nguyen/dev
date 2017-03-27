@dataexport @td2
Feature: Data Export tests
  in order to navigate to Setup >> Data Export
  as a Naviance user
  I want to verify that page is displayed without errors

Scenario Outline: Verify Data Export from district
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I go to Data Export
  Then I should not see errors in data export "<text>"

Examples:
  | account     | user       | password  | text                 |
  | blue1hs        | stan.smith | stan01!   | Naviance Data Export |

