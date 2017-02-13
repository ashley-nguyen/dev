@hubs @bottomStickyBar
Feature: As a student I'd like to have the ability to quickly have access to the "My colleges" functionality so that
  I can quickly and easily go to that area of the product.

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | allenhubs | hubs2016  |
    When I open the HUBS page for "Albion"

  Scenario: The number of colleges in 'I'm thinking about' list equals the number in the corresponding button in
  the Bottom Sticky Bar
    When I take note of the number in the "I'm Thinking About" button
    And I open the "I'm Thinking About" list using the corresponding button in the bottom sticky bar
    Then The number of colleges in "I'm Thinking About" list should equal the number in the button in the Bottom Sticky Bar

  Scenario: The number of colleges in 'I'm Aplying to' list equals the number in the corresponding button in
  the Bottom Sticky Bar
    When I take note of the number in the "I'm Applying To" button
    And I open the "I'm Applying To" list using the corresponding button in the bottom sticky bar
    Then The number of colleges in "I'm Applying To" list should equal the number in the button in the Bottom Sticky Bar
  @smoke
  Scenario: The number of colleges in 'Recommended Events' list equals the number in the corresponding button in
  the Bottom Sticky Bar
    When I take note of the number in the "Recommended Events" button
    And I open the "Recommended Events" list using the corresponding button in the bottom sticky bar
    Then The number of colleges in "Recommended Events" list should equal the number in the button in the Bottom Sticky Bar

  Scenario: The number of colleges in 'Recommended Events' list equals the number in the corresponding button in
  the Bottom Sticky Bar (HUBS-883)
    When I take note of the number in the "Upcoming Visits" button
    And I open the "Upcoming Visits" list using the corresponding button in the bottom sticky bar
    Then The number of colleges in "Upcoming Visits" list should equal the number in the button in the Bottom Sticky Bar

