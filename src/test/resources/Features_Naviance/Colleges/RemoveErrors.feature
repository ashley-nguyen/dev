@colleges
Feature: Colleges Errors test
  in order to ensure no errors in the page
  as a Naviance user
  I want to be able to add college application

  Background:
    Given I am logged into Naviance "rtd1" as "stan.smith" with "stan01!"

  Scenario Outline: Verify Prospective Colleges is displayed correctly
    And I enter to School Site
    When I search for <student> using the global search field
    Then I should not see errors in prospective college

  Examples:
  | student      |
  | a103, a103   |

  Scenario Outline: Verify Active Applications is displayed correctly
    And I enter to School Site
    When I search for <student> using the global search field
    Then I should not see errors in college pick using "<url>"

  Examples:
   | student      | url                                                       |
   | a103, a103   | https://succeed.naviance.com/collegesmain/collegepick.php |


  Scenario Outline: Find College test
    When I go to find college "<college>"
    Then I should not see errors in find College "<college>"

  Examples:
  | college            |
  | Adelphi University |


