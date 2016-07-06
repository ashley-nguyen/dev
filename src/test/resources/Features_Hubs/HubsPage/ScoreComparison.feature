@smoketest @nondestructive @hubs @scorecomparison
Feature: As a student viewing new Hubs Overview Tab, I want the default score comparison to show other results from
  my high school so that I know how I compare to my immediate peers

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario Outline: Student's GPA, SAT and ACT are present with correct values in Score Comparison module
    Then Student's "<score>" should be "<value>" in the Score Comparison module
    Examples:
    | score | value |
    | GPA   | 3.75  |
    | SAT   | 97    |
    | ACT   | 26    |

  Scenario Outline: Average GPA, SAT and ACT are present with correct values in Score Comparison module
    Then Average "<avgScore>" should be "<avgValue>" with correct values in the Score Comparison module
    Examples:
    | avgScore | avgValue |
    | GPA      | 3.74     |
    | SAT      | 1670     |
    | ACT      | 27       |

  Scenario Outline: The score text is displayed with correct values under each dial
    Then The score text for "<scoreType>" should be "<scoreText>"
    Examples:
    | scoreType       | scoreText         |
    | GPA             | GREAT             |
    | SAT             | NEEDS IMPROVEMENT |
    | ACT             | GREAT             |
    | OVERALL AVERAGE | NEEDS IMPROVEMENT |

  Scenario Outline: Overall Average text is present with correct values in Score Comparison module
    Then The Overall Average text should be "<text>" in the Score Comparison module
    Examples:
    | text                         |
    | Some of your scores are low. |
    | SAT.                         |