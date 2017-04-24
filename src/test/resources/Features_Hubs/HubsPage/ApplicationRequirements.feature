@hubs @applicationrequirements
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Montevallo"
    And I open the Admissions tab

  Scenario: The "Required" requirements for "Freshman" are displayed with correct data
    When I open "Freshman" in Application Requirements
    Then I should see the "Required" requirements in Application Requirements:
    | ACT           |
    | GPA           |
    | SAT           |
    | School Record |
    | Test Scores   |

  Scenario: The "Recommended" requirements for "Freshman" are displayed with correct data
    When I open "Freshman" in Application Requirements
    Then I should see the "Recommended" requirements in Application Requirements:
    | Campus Visit         |
    | Class Rank           |
    | College Prep Program |
    | Interview            |

  Scenario: The "Optional" requirements for "Freshman" are displayed with correct data
    When I open "Freshman" in Application Requirements
    Then I should see the "Optional" requirements in Application Requirements:
    | Recommendations               |
    | Talent / Ability / Competency |
  @smoke
  Scenario: The "Required" requirements for "Transfer" are displayed with correct data
    When I open "Transfer" in Application Requirements
    Then I should see the "Recommended" requirements in Application Requirements:
    | Campus Visit |
    | Interview    |

  Scenario: The "Required" requirements for "International" are displayed with correct data
    When I open "International" in Application Requirements
    Then I should see the "Required" requirements in Application Requirements:
    | IELTS |
    | TOEFL |