@hubs @studentprofiles
Feature: As a student viewing new Hubs, I want to see the student profiles in the Profiles tab

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
    And I open the Profiles tab
  @smoke
  Scenario: The Student Profile details are displayed after clicking Read More
    When I expand the Profile with name "Carolina"
    Then I should see the details of the profile

  Scenario: Student Profiles are collapsed after clicking the x button
    When I expand the Profile with name "Carolina"
    And I close the profile
    Then The profile with name "Carolina" should be collapsed