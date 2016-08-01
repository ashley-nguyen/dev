@smoketest @nondestructive @hubs @studentlifetopbar
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a top bar with at-a-glance information
  so that I can start to learn about the experience of being a student at the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button
    And I click the Student Life tab

  Scenario: The School Size is displayed with correct data
    Then The School Size should be "Very Large"

  Scenario: The Undergraduate Students number in School Size is displayed with correct data
    Then The "Undergraduate Students" number is "20,629" in School Size

  Scenario: The Graduate Students number in School Size is displayed with correct data
    Then The "Graduate Students" number is "5,283" in School Size

  Scenario: The Total Students number in School Size is displayed with correct data
    Then The "Total Students" number is "25,912" in School Size

  Scenario: The Nearest City is displayed with correct data
    Then The "NEAREST CITY" should be "Auburn" in Student Life Top Bar

  Scenario: The Distance From Your Highschool is displayed with correct data
    Then The "DISTANCE FROM YOUR HIGH SCHOOL" should be "677 miles" in Student Life Top Bar
  
  Scenario: The Percent Of Students Living On Campus is displayed with correct data
    Then The "PERCENT OF STUDENTS LIVING ON CAMPUS" should be "21" in Student Life Top Bar


