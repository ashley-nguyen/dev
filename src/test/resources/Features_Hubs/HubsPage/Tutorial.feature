@smoketest @nondestructive @hubs @tutorials
Feature: Validate as a student visiting a new hubs page for the first time,
  I see an instructional modal explaining features of new hubs page

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | benhubs | hubs2016  |

  Scenario Outline: Tutorial 1 dialog is displayed in Hubs
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    Then I should see FirstTutorial dialog
    Examples:
      | college |
      | Adrian  |

  Scenario Outline: Tutorial 2 dialog is displayed in Hubs after click Next on Tutorial 1
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    And I click on Next on FirstTutorial dialog
    Then I should see SecondTutorial dialog
    Examples:
      | college |
      | Adrian  |

