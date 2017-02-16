@hubs @betamsgribbon
Feature: Hubs Beta Feeedback Ribbon
  Verify that as a student viewing a college's new hub page, I see a clear reminder that I'm trying a beta version

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Auburn"
    And I open the Survey Page
  @smoke
  Scenario: Survey page can be closed after clicking 'Done'
    When I fill the survey with the following data:
    # The following number are 1 for 'Awful'  and 7 for 'Excellent'
    # The third section answers if the student is in high school (yes or no)
    # The last section is the student's grade
    | 5 | 5 | yes | 12th |
    And I submit the survey
    Then I should be able to close the survey page

  Scenario: The Survey page can be closed without completing it
    Then I should be able to close the survey page

  Scenario: The Beta Ribbon is still displayed after closing the Survey page
    When I close the Survey page
    Then I should see the Feedback Ribbon