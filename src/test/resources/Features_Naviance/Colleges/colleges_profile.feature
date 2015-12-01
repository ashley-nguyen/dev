@smoketest
Feature: Colleges - College Profile
  As a Succeed user
  I want to view a college profile
  So that I will know more information about a particular college

  Background:
    Given when I log in with the following user details:
      | etcs | sallysupport | sallysupport01! |

@Colleges @safe
  Scenario: View College Profile
    Given I view "Georgetown University" profile
    And I should see "Georgetown University"
    When I click "Admissions" tab on college profile
    Then I should see "Charles Deacon"
#    When I follow "Academics"
#    Then I should see "Biophysics"
#    When I follow "Cost & aid"
#    Then I should see " Patricia A. Mc Wade "
#    When I follow "Extracurriculars"
#    Then I should see "5053"
