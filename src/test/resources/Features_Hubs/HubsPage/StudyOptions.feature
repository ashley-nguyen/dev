@smoketest @nondestructive @hubs @studyoptions
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario Outline: The Study Options are displayed with correct values
    When I click the Studies tab
    Then The Study Option "<studyOption>" should be "available"
    Examples:
    | studyOption                    |
    | Cooperative Education Programs |
    | Double Major                   |
    | Graduate Study Abroad          |
    | Honors Program                 |
    | Internships                    |
    | Study Abroad                   |
    | Study Abroad Credit            |
    | Teacher Certification Programs |

  Scenario Outline: The Study Options are displayed with correct values
    When I click the Studies tab
    Then The Study Option "<studyOption>" should be "not available"
    Examples:
      | studyOption                      |
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
