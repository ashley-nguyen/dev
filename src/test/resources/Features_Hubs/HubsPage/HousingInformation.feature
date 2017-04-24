@hubs @housinginformation
Feature: As a student viewing new Hubs' Student Life tab, I want to see a housing information module so that I know a
  little about what living on campus is like

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | ikeahubs | Hobsons!23  |
    When I open the HUBS page for "University of Washington"
    And I open the Student Life tab
  @smoke
  Scenario: The Capacity is displayed with correct data
    Then The "Capacity" should be "9,500" in Housing Information

  Scenario: The Percent Living on Campus  is displayed with correct data
    Then The "Percent" should be "27%" in Housing Information

  Scenario: The Freshmen must live on campus is displayed with correct data
    Then The "Freshmen" should be "No" in Housing Information

  Scenario: The Sophomores must live on Campus is displayed with correct data
    Then The "Sophomores" should be "No" in Housing Information

  Scenario: The Juniors must live on campus  is displayed with correct data
    Then The "Juniors" should be "Yes" in Housing Information

  Scenario: The Seniors must live on campus is displayed with correct data
    Then The "Seniors" should be "No" in Housing Information










