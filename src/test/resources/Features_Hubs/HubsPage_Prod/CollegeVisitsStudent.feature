@hubs @collegevisits @notavailable @prod
Feature: As a student, I should be able to see the College Visits my counselor creates for me so that I can make a
  good college decision. (We need a test college with visits in Prod)

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | benhubs | Hobsons!23 |
    When I open the HUBS page for "Adelphi"
  @smoke
  Scenario: I'm able to register to a visit
    When I open the college visit in position "1"
    Then I should see a confirmation message
    When Remove myself from the college visit at position "1"
    Then I should see a confirmation message for the cancellation