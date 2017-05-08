@hubs @studentprofiles
Feature: As a student viewing new Hubs, I want to see the student profiles in the Profiles tab (currently there are no
  colleges with profiles)

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | benhubs | Hobsons!23 |
    When I open the HUBS page for "Indiana University at Bloomington"
    And I open the Profiles tab
  @smoke
  Scenario: The Student Profile details are displayed after clicking Read More
    When I expand the Profile with name "Carey"
    Then I should see the details of the profile

  Scenario: Student Profiles are collapsed after clicking the x button
    When I expand the Profile with name "Carey"
    And I close the profile
    Then The profile with name "Carey" should be collapsed