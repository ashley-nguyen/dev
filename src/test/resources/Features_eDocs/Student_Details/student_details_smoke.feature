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
    |stan.smith     | rtsa    | stan01!     | a101       | Adelphi Univ           |
    |stan.smith     | rtsa    | stan01!     | a105       | Virginia Highlands CC  |


