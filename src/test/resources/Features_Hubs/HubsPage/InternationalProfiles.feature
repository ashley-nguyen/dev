@hubs
Feature: As a student viewing new Hubs, I want to see the student profiles in the Profiles tab

  Background:
    Given I log in to Family Connection with the following user details:
      | hubsintl  | samstudent | Hobsons!23  |
    When I open the HUBS page for "Adelphi"
    And I open the International tab

  Scenario: The Student Profile details are displayed after clicking Read More
    When I expand the International Profile with name "ANI"
    Then I should see the details of the International profile


  Scenario: Student Profiles are collapsed after clicking the x button
    When I expand the International Profile with name "ANI"
    And I close the International profile
    Then The International profile with name "ANI" should be collapsed


  Scenario: The Parent Profile details are displayed after clicking Read More
    When I expand the International Profile with name "FacultyProfile1"
    And I should see the details of the International profile


  Scenario: The Parent Profile details are collapsed after clicking the x button
    When I expand the Profile with name "FacultyProfile1"
    And I close the profile
    Then The profile with name "FacultyProfile1" should be collapsed

  Scenario: The Program Profile details are displayed after clicking Read More
    When I expand the Profile with name "International Program"
    And I should see the details of the profile

  Scenario: : The Program Profile details are collapsed after clicking x button
    When I expand the Profile with name "International Program"
    And I close the profile
    Then The profile with name "International Program" should be collapsed

  Scenario: The Alumni Profile details are displayed after clicking Read More
    When I expand the Profile with name "The Li Family"
    And I should see the details of the profile

  Scenario: The Alumni profile details are collapsed after clicking x button
    When I expand the Profile with name "The Li Family"
    And I close the profile
    Then The profile with name "The Li Family" should be collapsed

  Scenario: The Faculty Profile details are displayed after clicking Read More
    When I expand the Profile with name "Alumni Profile"
    And I should see the details of the profile

  Scenario: The Faculty profile details are collapsed after clicking x button
    When I expand the Profile with name "Alumni Profile"
    And I close the profile
    Then The profile with name "Alumni Profile" should be collapsed

