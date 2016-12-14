@smoketest @nondestructive @hubs @collegevisits
Feature: As a student, I should be able to see the College Visits my counselor creates for me so that I can make a
  good college decision.

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | benhubs | hubs2016  |
    When I open the HUBS page for "Adelphi"

  Scenario: I'm able to register to a visit
    When I open the college visit in position "1"
    And I sign up to the college visit
    Then I should see a confirmation message
    And Remove myself from the college visit

