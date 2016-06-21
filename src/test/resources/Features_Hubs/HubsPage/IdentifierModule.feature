@smoketest @nondestructive @hubs @identifiermodule
Feature:  As a student viewing new hubs page, I want to always see the college's name,
  logo, URL and location so that I know what school I'm exploring (HUBS-76, HUBS-218)

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | benhubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario: Identifier module is present in Hubs
    Then I should see the Identifier module

  Scenario: Logo is present in Identifier module
    Then I should see the logo in the Identifier module

  Scenario Outline: I see the college's url open in a new page
    When I click the URL at the side of the logo
    Then I should see the URL for "<site>" open in a new page
    Examples:
    | site           |
    | www.auburn.edu |



