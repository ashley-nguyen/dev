@smoketest @nondestructive @hubs @studentprofiles
Feature: As a student viewing new Hubs, I want to see the student profiles in the Profiles tab

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
    And I click the Profiles tab

  Scenario: The Student Profile details are displayed after clicking Read More
    When I click Read More in the Profile with name "Camilo Malagon"
    Then I should see the details of the profile

  Scenario: Student Profiles are collapsed after clicking the x button
    When I click Read More in the Profile with name "Camilo Malagon"
    And I click the x button in the profile
    Then The profile with name "Camilo Malagon" should be collapsed