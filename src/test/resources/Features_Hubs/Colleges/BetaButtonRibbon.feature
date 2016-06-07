@smoketest @nondestructive @hubs
Feature: Hubs Beta Button Ribbon (HUBS-12)
  Verify that as a student viewing a college's profile page,
  I am able to click a "beta" button so that I can try out the new hub page

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |

  Scenario Outline: View Beta Button Ribbon - Hubs Beta Button Ribbon Toggle is set to ON
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    Then I should see the Hubs Page Ribbon
    Examples:
      | college |
      | Auburn  |

  Scenario Outline: Close Beta Ribbon - Hubs Beta Button Ribbon Toggle is set to ON
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the 'x' on the Beta Button Ribbon
    Then I should not see the Hubs Page Ribbon
    Examples:
      | college |
      | Auburn  |

  Scenario Outline: Verify other colleges still see Beta Button Ribbon after closing it for a college - Hubs Beta Button
  Ribbon Toggle is set to ON
    When I click on the Colleges tab
    And I search for the college "<originalcollege>"
    And I click the college "<originalcollege>" in the college lookup list
    And I click the 'x' on the Beta Button Ribbon
    And I search for the college "<anotherCollege>"
    And I click the college "<anotherCollege>" in the college lookup list
    Then I should see the Hubs Page Ribbon
    Examples:
      | originalcollege | anotherCollege |
      | Auburn          | Adrian         |

  Scenario Outline: Verify Feedback Ribbon - Hubs Beta Button Ribbon Toggle is set to ON
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    Then I should see the Feedback Ribbon
    Examples:
      | college |
      | Auburn  |





