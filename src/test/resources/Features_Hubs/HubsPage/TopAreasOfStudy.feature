@smoketest @nondestructive @hubs @topareasofstudy
Feature: As a student, I want to see the popular majors for that school so I can make a more informed decision

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Adrian"
    And I click the Beta Button
    And I click the Studies tab

  Scenario: The Top Areas of Study are displayed with correct values
    Then The Top Areas of Study should be displayed with the following values:
    | Business, Management, Marketing, and Related Support Services |
    | Visual and Performing Arts                                    |
    | Biological and Biomedical Sciences                            |
    | Education                                                     |
    | Parks, Recreation, Leisure, and Fitness Studies               |