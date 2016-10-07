@smoketest @nondestructive @hubs @studentorganizations
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
    And I open the Student Life tab

  Scenario: The Available Organizations are displayed with correct data
    When I open the "Organizations" tab in Student Organizations and Services
    Then The following Available Organizations are displayed:
    | Academic Frat./Sor.        |
    | Business                   |
    | Choir                      |
    | Commuter                   |
    | Concert Band               |
    | Environmental              |
    | Gay and Lesbian            |
    | Honors/Academic            |
    | International              |
    | Literary Magazine          |
    | Minority Cultural          |
    | Minority Student           |
    | Newspaper                  |
    | Orchestra                  |
    | Physically Challenged      |
    | Political Activism         |
    | Pre-Dental                 |
    | Pre-Law                    |
    | Pre-Medical                |
    | Pre-Veterinary             |
    | Radio Station              |
    | Religious                  |
    | Sports/Intramurals         |
    | Student Government         |
    | Substance Abuse Support    |
    | Television Station         |
    | Theatre/Drama              |
    | Yearbook                   |

  Scenario: The Available Sports for men are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Men" section in Athletics
    Then The following "Men" sports should be displayed:
    #Use 'empty' when that field is empty
    | Soccer,II,empty,NCAA          |
    | Basketball,II,empty,NCAA      |
    | Golf,II,empty,NCAA            |
    | Tennis,II,empty,NCAA          |
    | Indoor Track,II,empty,NCAA    |
    | Diving,II,empty,NCAA          |
    | Track And Field,II,empty,NCAA |
    | Cross Country,II,empty,NCAA   |
    | Lacrosse,II,empty,NCAA        |
    | Baseball,II,empty,NCAA        |
    | Swimming,II,empty,NCAA        |

  Scenario: The Available Sports for women are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Women" section in Athletics
    Then The following "Women" sports should be displayed:
    #Use 'empty' when that field is empty
    | Softball,II,empty,NCAA        |
    | Soccer,II,empty,NCAA          |
    | Basketball,II,empty,NCAA      |
    | Field Hockey,II,empty,NCAA    |
    | Volleyball,II,empty,NCAA      |
    | Bowling,II,empty,NCAA         |
    | Tennis,II,empty,NCAA          |
    | Indoor Track,II,empty,NCAA    |
    | Dancing,empty,empty,empty     |
    | Diving,II,empty,NCAA          |
    | Track And Field,II,empty,NCAA |
    | Cross Country,II,empty,NCAA   |
    | Lacrosse,II,empty,NCAA        |
    | Swimming,II,empty,NCAA        |
  
  Scenario: The Available Sports for Co-Ed are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Co-Ed" section in Athletics
    Then The following "Co-Ed" sports should be displayed:
    #Use 'empty' when that field is empty
    | Softball,empty,empty,empty         |
    | Soccer,empty,empty,empty           |
    | Basketball,empty,empty,empty       |
    | Volleyball,empty,empty,empty       |
    | Flag Football,empty,empty,empty    |
    | Badminton,empty,empty,empty        |
    | Equestrian,empty,empty,empty       |
    | Ultimate Frisbee,empty,empty,empty |







