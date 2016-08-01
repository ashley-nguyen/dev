@smoketest @nondestructive @hubs @applicationrequirements
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button
    And I click the Admissions tab

  Scenario: The "Required" requirements for "Freshman" are displayed with correct data
    When I click "Freshman" in Application Requirements
    Then I should see the "Required" requirements in Application Requirements:
    | ACT                  |
    | College Prep Program |
    | Essay                |
    | GPA                  |
    | SAT                  |
    | School Record        |
    | Test Scores          |

  Scenario: The "Recommended" requirements for "Freshman" are displayed with correct data
    When I click "Freshman" in Application Requirements
    Then I should see the "Recommended" requirements in Application Requirements:
    | Campus Visit    |
    | Class Rank      |
    | Recommendations |

  Scenario: The "Optional" requirements for "Freshman" are displayed with correct data
    When I click "Freshman" in Application Requirements
    Then I should see the "Optional" requirements in Application Requirements:
    | Interview                     |
    | SAT Subject                   |
    | Talent / Ability / Competency |

  Scenario: The "Required" requirements for "Transfer" are displayed with correct data
    When I click "Transfer" in Application Requirements
    Then I should see the "Recommended" requirements in Application Requirements:
    | Campus Visit |

  Scenario: The "Recommended" requirements for "Transfer" are displayed with correct data
    When I click "Transfer" in Application Requirements
    Then I should see the "Optional" requirements in Application Requirements:
    | Interview |

  Scenario: The "Required" requirements for "International" are displayed with correct data
    When I click "International" in Application Requirements
    Then I should see the "Required" requirements in Application Requirements:
    | Ability to Finance |
    | SAT                |
    | TOEFL              |