@hubs @applicationrequirements
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Auburn"
    And I open the Admissions tab

  Scenario: The "Required" requirements for "Freshman" are displayed with correct data
    When I open "Freshman" in Application Requirements
    Then I should see the "Required" requirements in Application Requirements:
    | ACT                  |
    | College Prep Program |
    | Essay                |
    | GPA                  |
    | SAT                  |
    | School Record        |
    | Test Scores          |

  Scenario: The "Recommended" requirements for "Freshman" are displayed with correct data
    When I open "Freshman" in Application Requirements
    Then I should see the "Recommended" requirements in Application Requirements:
    | Campus Visit    |
    | Class Rank      |
    | Recommendations |

  Scenario: The "Optional" requirements for "Freshman" are displayed with correct data
    When I open "Freshman" in Application Requirements
    Then I should see the "Optional" requirements in Application Requirements:
    | Interview                     |
    | SAT Subject                   |
    | Talent / Ability / Competency |

  Scenario: The "Required" requirements for "Transfer" are displayed with correct data
    When I open "Transfer" in Application Requirements
    Then I should see the "Recommended" requirements in Application Requirements:
    | Campus Visit |
  @smoke
  Scenario: The "Recommended" requirements for "Transfer" are displayed with correct data
    When I open "Transfer" in Application Requirements
    Then I should see the "Optional" requirements in Application Requirements:
    | Interview |

  Scenario: The "Required" requirements for "International" are displayed with correct data
    When I open "International" in Application Requirements
    Then I should see the "Required" requirements in Application Requirements:
    | Ability to Finance |
    | SAT                |
    | TOEFL              |