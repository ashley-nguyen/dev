@destructive  @sat
Feature: Student SAT scores
  in order to track SAT test scores
  as a Naviance user
  I want to be able to manage student SAT scores

  Background:
    Given when I log in with the following user details:
      | rtsa | stan.smith | stan01! |

  Scenario Outline: Enter SAT scores
    When I search for <student> using the global search field
    And I enter SAT scores with "<link>" "<test>" "<date>" "<day>" "<year>" "<grade>" "<ebrw>" "<reading>" "<writing>" "<mathematics_score>" "<math_test>" "<totalscore>"
   Then I verify the test scores with "<warning>" message displayed

    Examples:
      | student       | ebrw | reading | mathematics_score |writing  | math_test | totalscore | year  | link            | test | date    | day | grade | warning                                                        |
      | A101, A101 | 222  | 38      | 222               |  35     | 22        | 444        |  2016 |  key test scores| SAT  | January | 30  | 12th  | Date out of range, valid range is between March 2016 and today |
      | A101, A101 | 222  | 38      | 222               |  35     | 22        | 444        |  2016 |  key test scores| SAT  | March   | 30  | 12th  |  |
      | A101, A101 | 444  | 38      | 222               |  30     | 23        | 444        |  2016 |  key test scores| SAT  | March   | 30  | 12th  |  |
