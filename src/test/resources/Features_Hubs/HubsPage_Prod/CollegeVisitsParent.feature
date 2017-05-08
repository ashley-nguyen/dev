@hubs @collegevisits @notavailable @prod
Feature: As a parent, I should be able to see the College Visits my counselor creates for me so that I can make a
  good college decision. (We need a test college with visits in Prod)

  Background:
    Given I log in to Family Connection as a parent with the following user details:
    #use 'singleStudent' in the case the the parent has only one student, so the
    #student selection screen is not displayed
      | naviance | parenthubs | hubs2016 | singleStudent |
    When I open the HUBS page for "Adelphi"

  Scenario: The Register button is not displayed for parents
    Then No Register button should be displayed

