@visits
Feature: Type-casted year input to in  test
  in order to ensure no errors in the page
  as a Naviance user
  I want to be able to view past college visits

  Scenario Outline: Verify view past college visits is displayed correctly
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    And I enter to School Site
    When I click on view past visits
    Then I can toggle class year <ClassYear>

  Examples:
    | user           | account | password | ClassYear |
    | stan.smith     | rtd1    | stan01!  | (2013-2014) |

