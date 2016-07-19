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
    Then I click on Scores tab
    And  I click on "<link>" link
    And  I click on Add Score button
    And  I select the "<test>" test
    And  I select the "<date>" taken
    And  I wrote the "<day>" day
    And  I wrote the "<year>" year
    And  I select the "<grade>" when taken
    And  I wrote the "<ebrw>" value for EBRW test score
    And  I wrote the "<reading>" value for reading test score
    And  I wrote the "<writing>" value for writing test score
    And  I wrote the "<mathematics_score>" value for mathematics test score
    And  I wrote the "<math_test>" value for math test score
    And  I wrote the "<totalscore>" value for total test score
    And  I click on Save Scores button
   Then I verify the test scores with "<warning>" message displayed

    Examples:
      | student       | ebrw | reading | mathematics_score |writing  | math_test | totalscore | year  | link            | test | date    | day | grade | warning                                                        |
      | A101, A101 | 222  | 38      | 222               |  35     | 22        | 444        |  2016 |  key test scores| SAT  | January | 30  | 12th  | Date out of range, valid range is between March 2016 and today |
      | A101, A101 | 222  | 38      | 222               |  35     | 22        | 444        |  2016 |  key test scores| SAT  | March   | 30  | 12th  |  |
      | A101, A101 | 444  | 38      | 222               |  30     | 23        | 444        |  2016 |  key test scores| SAT  | March   | 30  | 12th  |  |
