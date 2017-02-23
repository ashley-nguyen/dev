@hubs @topareasofstudy
Feature: As a student, I want to see the popular majors for that school so I can make a more informed decision

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | amandahubs | hubs2016  |
    When I open the HUBS page for "Adrian"
    Then I open the Studies tab
  @smoke
  Scenario: The Top Areas of Study are displayed with correct values
    Then The Top Areas of Study should be displayed with the following values:
    | Business, Management, Marketing, and Related Support Services |
    | Visual and Performing Arts                                    |
    | Biological and Biomedical Sciences                            |
    | Education                                                     |
    | Parks, Recreation, Leisure, and Fitness Studies               |

  Scenario: The date text is displayed under Top Areas of Study
    Then The text "Latest available data from 2014" should be displayed under "Top Areas of Study"