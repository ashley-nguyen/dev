@hubs @quickfacts
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Alma"
  @smoke
  Scenario: Website is displayed in Quick Facts with a correct value
    Then Website should be "alma.edu" in Quick Facts

  Scenario: The School Type is displayed in Quick Facts with correct data
    Then School Type is "Private / 4 Year" in Quick Facts
  @smoke
  Scenario: The Ceeb Code is displayed in Quick Facts with correct data
    Then CEEB Code is "1010" in Quick Facts

  Scenario: Undergraduate Enrollment is displayed in Quick Facts with correct data
    Then Undergraduate Enrollment is "1,396" in Quick Facts

  Scenario: The Student-to-faculty ratio is displayed in Quick Facts with correct data
    Then Student-to-faculty ratio is "12 to 1" in Quick Facts

  Scenario: Religious Affiliation is displayed in Quick Facts with correct data
    Then Religious Affiliation is "Presbyterian Church (USA)" in Quick Facts

  Scenario: Campus Surroundings is displayed in Quick Facts with correct data
    Then Campus Surroundings is "Small Town" in Quick Facts

  Scenario: Degrees Offered are displayed with correct values in Quick Facts
    Then Degrees Offered contains the following values:
    | Bachelors  |

