@hubs @topareasofstudy
Feature: As a student, I want to see the popular majors for that school so I can make a more informed decision

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Docufide Institute of Technology (not a real college)"
    Then I open the Studies tab
  @smoke
  Scenario: The Top Areas of Study are displayed with correct values
    Then The Top Areas of Study should be displayed with the following values:
    | Testing One        |
    | Testing Two        |
    | Testing Third Area |
    | Testing Four       |
    | Testing Five       |

  Scenario: The date text is displayed under Top Areas of Study
    Then The text "Latest available data from 2016" should be displayed under "Top Areas of Study"