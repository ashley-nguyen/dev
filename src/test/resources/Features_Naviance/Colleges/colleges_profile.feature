@smoketest
Feature: Colleges - College Profile
  As a Succeed user
  I want to view a college profile
  So that I will know more information about a particular college

  Background:
    Given when I log in with the following user details:
      | rtsa | stan.smith | stan01! |
# THIS IS A FEATURE BROUGHT OVER FROM THE BEHAT TESTS
#  @Colleges @safe
#  Scenario: View College Profile
#    Given I view "Georgetown University" profile
#    And I should see "Georgetown University"
#    When I click "Admissions" tab on college profile
#    Then I should see "Charles  Deacon"
#    When I click "Academics" tab on college profile
#    Then I should see "Biophysics"
#    When I click "Cost & aid" tab on college profile
#    Then I should see "Patricia A. Mc Wade"
#    When I click "Extracurriculars" tab on college profile
#    Then I should see "5053"

# THIS IS A CLEANER FORMAT FOR THE FEATURE ABOVE
  @Colleges @safe
  Scenario Outline: View College Profile
    When I view "Adelphi University" profile
    Then I should see the following college profile information '<Admissions>' '<Academics>' '<Costandaid>' '<Extracurriculars>'

    Examples:
      | Admissions       | Academics  | Costandaid          | Extracurriculars |
      | Kristen  Capezza | Accounting | Sheryl  Mihopulos   | 1321             |



