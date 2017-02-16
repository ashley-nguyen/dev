@hubs @scorecomparison
Feature: As a student viewing new Hubs Overview Tab, I want the default score comparison to show other results from
  my high school so that I know how I compare to my immediate peers

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | benhubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
  @smoke
  Scenario: Student's GPA, SAT and ACT are present with correct values in Score Comparison module
    Then Student's score type and value should correspond to the following data in the Score Comparison module:
    | GPA;3.4  |
    | SAT;1270 |
    | ACT;?    |

  Scenario: Average GPA, SAT and ACT are present with correct values in Score Comparison module
    Then Average score type and value should correspond to the following data in the Score Comparison module
    | GPA;2.78 |
    | SAT;1125 |
    | ACT;29   |

  Scenario: The score text is displayed with correct values under each dial
    Then The score text for each score type should be as follows:
    #use 'empty' when the value in the UI is empty
    | GPA;GOOD              |
    | SAT;GREAT             |
    | ACT;empty             |
    | OVERALL AVERAGE;GREAT |

  Scenario: Overall Average text is present with correct values in Score Comparison module
    Then The Overall Average text should be "It looks like you are doing great." in the Score Comparison module
  @smoke
  Scenario: The comparison against all the students is displayed after clicking the button 'Compare me with all
  accepted applicants'
    When I switch the comparison to be made against all students accepted by the college
    Then I should see the the comparison made against all students accepted by the college
    When I switch the comparison to be made against other students from the students' school
    Then I should see the the comparison made against other students from the students' school

  Scenario Outline: A tooltip should be displayed is displayed after clicking the information icon in the Compare me Section
    When I switch the comparison to be made against all students accepted by the college
    And I open the information tooltip clicking the information icon in "<section>"
    Then A tooltip should be displayed in "<section>"
    And I open the information tooltip clicking the information icon in "<section>"
    Then The tooltip in "<section>" should be closed
    Examples:
    | section     |
    | description |
    | GPA         |
    | SAT         |
    | ACT         |