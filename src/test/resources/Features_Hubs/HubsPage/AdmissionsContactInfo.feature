@hubs @admissionscontactinfo
Feature: As a student, I want to see the admissions contact information

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | Hobsons!23  |
    When I open the HUBS page for "Auburn"
    And I open the Admissions tab

  Scenario: The admissions contact information should be displayed at the bottom of the Admissions tab
    Then I should see a the admissions contact information as follows:
    | Attn: Cindy Singley           |
    | Phone: (334) 844-6425         |
    | Fax:                          |
    | Financial Aid: (334)844-4367  |
    | E-mail: admissions@auburn.edu |
