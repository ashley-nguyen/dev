@smoketest
Feature: Colleges - College Profile
  As a Succeed user
  I want to view a college profile
  So that I will know more information about a particular college

  Background:
    Given when I log in with the following user details:
      | rtsa | stan.smith | stan01! |

  @Colleges @safe
  Scenario Outline: View College Profile
    When I view "Adelphi University" profile
    Then I should see the following college profile information '<Admissions>' '<Academics>' '<Costandaid>' '<Extracurriculars>'

    Examples:
      | Admissions       | Academics  | Costandaid          | Extracurriculars |
      | Kristen  Capezza | Accounting | Sheryl  Mihopulos   | 1321             |



