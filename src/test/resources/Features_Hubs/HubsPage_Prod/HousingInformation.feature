@hubs @housinginformation
Feature: As a student viewing new Hubs' Student Life tab, I want to see a housing information module so that I know a
  little about what living on campus is like

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | benhubs | Hobsons!23 |
    When I open the HUBS page for "Docufide Institute of Technology (not a real college)"
    And I open the Student Life tab
  @smoke
  Scenario: The Capacity is displayed with correct data
    Then The "Capacity" should be "100,000" in Housing Information

  Scenario: The Percent Living on Campus  is displayed with correct data
    Then The "Percent" should be "100%" in Housing Information

  Scenario: The Freshmen must live on campus is displayed with correct data
    Then The "Freshmen" should be "Yes" in Housing Information

  Scenario: The Sophomores must live on Campus is displayed with correct data
    Then The "Sophomores" should be "Yes" in Housing Information

  Scenario: The Juniors must live on campus  is displayed with correct data
    Then The "Juniors" should be "Yes" in Housing Information

  Scenario: The Seniors must live on campus is displayed with correct data
    Then The "Seniors" should be "Yes" in Housing Information










