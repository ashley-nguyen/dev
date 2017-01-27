@destructive  @psat
Feature: Student PSAT scores
  in order to track PSAT test scores
  as a Naviance user
  I want to be able to manage student PSAT scores

  Background:
    Given when I log in with the following user details:
      | blue1hs | frank.counselor | frank01! |


  Scenario Outline: Enter PSAT scores
    When I search for <student> and enter PSAT scores <evidenceReading> <reading> <writing> <mathematics_score> <math_test> <totalscore> <month> <year> <grade>
    Then I should see PSAT <warning>

    Examples:
      | student       | evidenceReading | reading | writing | mathematics_score | math_test | totalscore | month | year | grade | warning                                                                                                             |
      | Student1, Transfer    | 160             | 38      | 35      | 160               | 35        | 160        | Jan   | 2014 | 11    | none                                                                                                                |
      | Student1, Transfer    | 999             |         |         |                   |           |            |       |      |       | Out of Range Scores Detected For Evidence Based Reading and Writing Score, please enter a score between 160 and 760 |
      | Student1, Transfer    |                 | 0       |         |                   |           |            |       |      |       | Out of Range Scores Detected For Reading Test, please enter a score between 8 and 38                                |
      | Student1, Transfer    |                 |         | 39      |                   |           |            |       |      |       | Out of Range Scores Detected For Writing Test, please enter a score between 8 and 38                                |
      | Student1, Transfer    |                 |         |         | 5                 |           |            |       |      |       | Out of Range Scores Detected For Mathematics Score, please enter a score between 160 and 760                        |
      | Student1, Transfer    |                 |         |         |                   | 40        |            |       |      |       | Out of Range Scores Detected For Math Test, please enter a score between 8 and 38                                   |

  @psatlegacy
  Scenario Outline: Enter PSAT legacy scores
    When I search for <student> and enter legacy PSAT scores <criticalreading> <math> <writing> <totalscore> <month> <year> <grade>
    Then I should see PSAT <warning>

    Examples:
      | student       | criticalreading | math | writing | totalscore | month | year | grade | warning                                              |
      | Student1, Transfer    | 80              | 80   | 80      | 160        | Jan   | 2014 | 11    | none                                                 |
      | Student1, Transfer    | 81              |      |         |            |       |      |       | Please make sure you enter a score between 20 and 80 |
      | Student1, Transfer    |                 | 19   |         |            |       |      |       | Please make sure you enter a score between 20 and 80 |
      | Student1, Transfer    |                 |      | 99      |            |       |      |       | Please make sure you enter a score between 20 and 80 |

  @psataddedit @gd8536
  Scenario Outline: Verify that user can be able to add/edit test scores with no problem.
    When I search for <student> and edit the scores
    Then I verify that system back to the score tab

  Examples:
    | student     |
    |  Student1, Transfer |

  @psataddedit @gd8536
  Scenario Outline: Verify that user can be able to edit test PSAT scores with no problem.
    When I edit PSAT scores for <student> and enter legacy PSAT scores <criticalreading> <math> <writing> <totalscore> <month> <year> <grade>
    Then I verify that system back to the score tab

  Examples:
    | student        | criticalreading | math | writing | totalscore | month | year | grade | warning |
    | Student1, Transfer     | 80              | 80   | 80      | 160        | Jan   | 2014 | 11    | none    |

  @psataddedit @gd8536
  Scenario Outline: Verify that user can't be able to edit test PSAT scores and return warning message.
    When I search for <student> and enter legacy PSAT scores <criticalreading> <math> <writing> <totalscore> <month> <year> <grade>
    Then I verify that system does not back to the score tab with <warning>

  Examples:
    | student        | criticalreading | math | writing | totalscore | month | year | grade | warning |
    | Student1, Transfer     | 80              | 80   | 80      | 160        | Jan   | 2014 | 11    | none    |
    | Student1, Transfer     | 81              |      |         |            |       |      |       | Please make sure you enter a score between 20 and 80 |
    | Student1, Transfer     |                 | 19   |         |            |       |      |       | Please make sure you enter a score between 20 and 80 |
    | Student1, Transfer     |                 |      | 99      |            |       |      |       | Please make sure you enter a score between 20 and 80 |