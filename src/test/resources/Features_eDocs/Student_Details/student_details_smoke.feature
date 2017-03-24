Feature: View student details
  In order to figure out a plan of action
  As a registered counselor
  I want to view details for the student

  @edocssmoketest @safe @succeed
  Scenario Outline: Authenticated counselor having the ability to view student details
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    Then I will see "<text>"

  Examples:
    |user           | account | password    | studentID  | text                   |
#    |stan.smith     | rtsa    | stan01!     | a110       | No active applications |
    |frank.counselor     | blue1hs    | frank01!     | 37506999       | Adelphi Univ           |


