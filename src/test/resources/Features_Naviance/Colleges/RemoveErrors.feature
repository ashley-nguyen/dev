@colleges
Feature: Colleges Errors test
  in order to ensure no errors in the page
  as a Naviance user
  I want to be able to add college application

  Scenario Outline: Verify Prospective Colleges is displayed correctly
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    And I enter to School Site
    When I search for <student> using the global search field
    When I add prospective colleges
    Then I should not see errors in prospective college

  Examples:
    | user           | account | password | student      |
    | stan.smith     | rtd1    | stan01!  | Abrams, Amy  |

  Scenario Outline: Verify Active Applications is displayed correctly
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    And I enter to School Site
    When I search for <student> using the global search field
    When I enter to Active Applications
    Then I should not see errors in active applications

  Examples:
    | user           | account | password | student      |
    | stan.smith     | rtd1    | stan01!  | Abrams, Amy  |

