@dashboard @td2
Feature: Course tests
  in order to navigate to Course >> Course Catalog
  as a Naviance user
  I want to verify that Course Catalog it's being displayed

  Background:
    Given I am logged into Naviance "blueqa1" as "frank.district" with "password"

  Scenario: Verify Course Catalog
    When I go to the Courses
    Then I verify the Course Catalog page

  Scenario: Verify High School Courses
    When I click on Advanced Computer Science
    Then I verify the Advanced Computer Science contents


  Scenario: Verify High School Subjects
    When I click on Economics
    Then I verify the Economics contents


  Scenario: Verify Recomendations
    When I navigate to Recommendations
    Then I verify the Recommendation not show errors


