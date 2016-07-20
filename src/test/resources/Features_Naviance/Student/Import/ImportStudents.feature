@destructive  @import
Feature: Import Students
  in order to import students
  as a Naviance user
  I want to be able to request import students

  @school
  Scenario Outline: Requests Teacher Recommendations
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to Data Import
    When I click on Add new student records
    When I click on Choose File button
    When I write the file name to import students


  Examples:
    | account     | user       | password  |
    | rtsa        | stan.smith | stan01!   |