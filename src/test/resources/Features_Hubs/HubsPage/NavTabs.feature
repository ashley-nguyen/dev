@hubs @navigationTabs
Feature:  As a student viewing a college's hub I want to use tabs to navigate among the modules available.

  Scenario:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Auburn"
    Then I should see the Navigation Tabs