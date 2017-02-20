@hubs @studyoptions
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Auburn"
    And I open the Studies tab
  @smoke
  Scenario: The Study Options are displayed with correct values
    Then Each Study Option from the following list should be "available"
    | Cooperative Education Programs |
    | Double Major                   |
    | Graduate Study Abroad          |
    | Honors Program                 |
    | Internships                    |
    | Study Abroad                   |
    | Study Abroad Credit            |
    | Teacher Certification Programs |

  Scenario: The Study Options are displayed with correct values
    Then Each Study Option from the following list should be "not available"
    | Accelerated Programs             |
    | Combined Degree Programs         |
    | Domestic Study Away Programs     |
    | External Degree Programs         |
    | Graduate Study Abroad Credit     |
    | Graduate Study Abroad Non Credit |
    | Independent Study                |
    | Study Abroad Non Credit          |
    | Weekend College                  |
    | Weekend Evening Programs         |

  Scenario: A label indicating the year of the data is displayed under Study Options
    Then I should see the label "Latest available data from 2016" under Study Options
