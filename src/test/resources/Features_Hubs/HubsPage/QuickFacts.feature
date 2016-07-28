@smoketest @nondestructive @hubs @quickfacts
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario: Website is displayed in Quick Facts with a correct value
    Then Website should be "auburn.edu" in Quick Facts

  Scenario: The School Type is displayed in Quick Facts with correct data
    Then School Type is "Public / 4 Year" in Quick Facts

  Scenario: Undergraduate Enrollment is displayed in Quick Facts with correct data
    Then Undergraduate Enrollment is "20,629" in Quick Facts

  Scenario: The Student-to-faculty ratio is displayed in Quick Facts with correct data
    Then Student-to-faculty ratio is "18 to 1" in Quick Facts

  Scenario: Religious Affiliation is displayed in Quick Facts with correct data
    Then Religious Affiliation is "Free Will Baptist Church" in Quick Facts

  Scenario: Campus Surroundings is displayed in Quick Facts with correct data
    Then Campus Surroundings is "Small City" in Quick Facts

  Scenario Outline: Degrees Offered are displayed with correct values in Quick Facts
    Then Degrees Offered contains "<degrees>"
    Examples:
    | degrees                |
    | Graduate Certification |
    | Masters                |
    | Doctorate              |
    | Bachelors              |
