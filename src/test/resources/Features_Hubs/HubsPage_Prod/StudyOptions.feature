@hubs @studyoptions
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Pace University, New York City"
    And I open the Studies tab
  @smoke
  Scenario: The Study Options are displayed with correct values
    Then Each Study Option from the following list should be "available"
    | Accelerated Programs           |
    | Combined Degree Programs       |
    | Cooperative Education Programs |
    | Graduate Study Abroad          |
    | Honors Program                 |
    | Independent Study              |
    | Internships                    |
    | Study Abroad                   |
    | Study Abroad Credit            |
    | Study Abroad Non Credit        |
    | Teacher Certification Programs |
    | Weekend Evening Programs       |

  Scenario: The Study Options are displayed with correct values
    Then Each Study Option from the following list should be "not available"
    | Domestic Study Away Programs     |
    | Double Major                     |
    | External Degree Programs         |
    | Graduate Study Abroad Credit     |
    | Graduate Study Abroad Non Credit |
    | Weekend College                  |
