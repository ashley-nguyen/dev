@smoketest @nondestructive @hubs
Feature: Hubs Beta Button Ribbon (HUBS-12)
  Verify that as a student viewing a college's profile page,
  I am able to click a "beta" button so that I can try out the new hub page

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the college view for "Auburn"

  Scenario: View Beta Button Ribbon - Hubs Beta Button Ribbon Toggle is set to ON
    Then I should see the Hubs Page Ribbon

  Scenario: Close Beta Ribbon - Hubs Beta Button Ribbon Toggle is set to ON
    When I close the Beta Button Ribbon
    Then I should not see the Hubs Page Ribbon

  Scenario: Verify other colleges still see Beta Button Ribbon after closing it for a college - Hubs Beta Button
  Ribbon Toggle is set to ON
    When I close the Beta Button Ribbon
    And I open the college view for "Adrian"
    Then I should see the Hubs Page Ribbon

  Scenario: Verify Feedback Ribbon - Hubs Beta Button Ribbon Toggle is set to ON
    When I open the HUBS page for "Auburn"
    Then I should see the Feedback Ribbon





