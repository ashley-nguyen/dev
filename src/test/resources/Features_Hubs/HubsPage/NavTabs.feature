@smoketest @nondestructive @hubs @webtour
Feature:  As a student viewing a college's hub I want to use tabs to navigate among the modules available.

  Scenario:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button
    Then I should see the Navigation Tabs