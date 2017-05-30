@hubs @studentlifetopbar
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a top bar with at-a-glance information
  so that I can start to learn about the experience of being a student at the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "The University of Arizona"
    And I open the Student Life tab
  @smoke
  Scenario: The School Size is displayed with correct data
    Then The School Size should be "Very Large"

  Scenario: The Undergraduate Students number in School Size is displayed with correct data
    Then The "Undergraduate Students" number is "32,987" in School Size

  Scenario: The Graduate Students number in School Size is displayed with correct data
    Then The "Graduate Students" number is "9,249" in School Size

  Scenario: The Total Students number in School Size is displayed with correct data
    Then The "Total Students" number is "42,236" in School Size
@test
  Scenario: The Nearest City is displayed with correct data
    Then The "NEAREST CITY" should be "Tucson" in Student Life Top Bar

  Scenario: The Distance From Your Highschool is displayed with correct data
    Then The "DISTANCE FROM YOUR HIGH SCHOOL" should be "803 miles" in Student Life Top Bar
@test
  Scenario: The Percent Of Students Living On Campus is displayed with correct data
    Then The "PERCENT OF STUDENTS LIVING ON CAMPUS" should be "70" in Student Life Top Bar

  Scenario: Google Maps is opened in a new window when the user clicks the 'Get Directions' link in Student Life Top bar
    When I open the "Get Directions" link in Student Life top bar
    Then Google Maps should be opened in a new window

  Scenario: The Housing Information section is displayed after clicking 'Learn More About Housing' in Student Life top bar
    When I open the "Learn More About Housing" link in Student Life top bar
    Then I should be redirected to Housing Information in Student Life

  Scenario: The URL contains "Student_Life#housing-information"
    When I open the "Learn More About Housing" link in Student Life top bar
    Then The URL should contain "Student_Life#housing-information"