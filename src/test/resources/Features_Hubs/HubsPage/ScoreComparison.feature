@smoketest @nondestructive @hubs @scorecomparison
Feature: As a student viewing new Hubs Overview Tab, I want the default score comparison to show other results from
  my high school so that I know how I compare to my immediate peers

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Auburn"

  Scenario: Student's GPA, SAT and ACT are present with correct values in Score Comparison module
    Then Student's score type and value should correspond to the following data in the Score Comparison module:
    | GPA;3.75 |
    | SAT;640  |
    | ACT;26   |

  Scenario: Average GPA, SAT and ACT are present with correct values in Score Comparison module
    Then Average score type and value should correspond to the following data in the Score Comparison module
    | GPA;3.82 |
    | SAT;1236 |
    | ACT;21   |

  Scenario: The score text is displayed with correct values under each dial
    Then The score text for each score type should be as follows:
    #use 'empty' when the value in the UI is empty
    | GPA;FAIR             |
    | SAT;FAIR             |
    | ACT;GOOD             |
    | OVERALL AVERAGE;GOOD |

  Scenario: Overall Average text is present with correct values in Score Comparison module
    Then The Overall Average text should be "It looks like you are on track." in the Score Comparison module

  Scenario: The comparison against all the students is displayed after clicking the button 'Compare me with all
  accepted applicants'
    When I switch the comparison to be made against all students accepted by the college
    Then I should see the the comparison made against all students accepted by the college
    When I switch the comparison to be made against other students from the students' school
    Then I should see the the comparison made against other students from the students' school