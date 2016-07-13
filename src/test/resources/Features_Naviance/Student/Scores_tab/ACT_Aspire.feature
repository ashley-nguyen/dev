@destructive  @aspire
Feature: Student ACT ASPIRE scores
  in order to track ACT ASPIRE test scores
  as a Naviance user
  I want to be able to manage student ACT ASPIRE scores

  Background:
    Given when I log in with the following user details:
      | rtsa | stan.smith | stan01! |

  Scenario Outline: Verify Student ACT ASPIRE score ranges per grade
    When I search for <student> using the global search field
    And I enter ASPIRE test score <score> for <subject> for grade <grade>
    Then I will see a warning <message>

    Examples:
      | student        | subject | score | grade | message                                                                                             |
      | A101, A101 | english | 457   | 9     | Some elements are out of the ranges for the selected grade level. Please check: English. |
      | A101, A101 | english | 399   | 9     | Some elements are out of the ranges for the selected grade level. Please check: English. |
      | A101, A101 | math    | 461   | 9     | Some elements are out of the ranges for the selected grade level. Please check: Math.    |
      | A101, A101 | math    | 399   | 9     | Some elements are out of the ranges for the selected grade level. Please check: Math.    |
      | A101, A101 | science | 450   | 9     | Some elements are out of the ranges for the selected grade level. Please check: Science. |
      | A101, A101 | science | 399   | 9     | Some elements are out of the ranges for the selected grade level. Please check: Science. |