@smoketest @nondestructive @hubs @survey
Feature: Hubs Beta Feeedback Ribbon (HUBS-11)
  Verify that as a student viewing a college's new hub page, I see a clear reminder that I'm trying a beta version

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |

  Scenario Outline: Feedback button takes the user to a survey page
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    And I click the Feedback Button
    Then I should see the survey page
    Examples:
      | college |
      | Auburn  |

  Scenario Outline: Survey page can be closed after clicking 'Done'
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    And I click the Feedback Button
    And I fill the survey with the following data:
    | Okay design | Just okay | 11th grade/junior |
    And I click the Done button
    Then I should be able to close the survey page
    Examples:
      | college |
      | Auburn  |

  Scenario Outline: The Survey page can be closed without completing it
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    And I click the Feedback Button
    Then I should be able to close the survey page
    Examples:
      | college |
      | Auburn  |

  Scenario Outline: The Beta Ribbon is still displayed after closing the Survey page
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    And I click the Feedback Button
    And I close the Survey page
    Then I should see the Feedback Ribbon
    Examples:
      | college |
      | Auburn  |