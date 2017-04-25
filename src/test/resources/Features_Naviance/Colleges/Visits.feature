@visits
Feature: Type-casted year input to in  test
  in order to ensure no errors in the page
  as a Naviance user
  I want to be able to view past college visits

  Background:
    Given I am logged into Naviance "blueqa1" as "frank.district" with "password"
    And I go to view past visits

  Scenario Outline: Verify view past college visits is displayed correctly
    Then I can toggle class year <ClassYear>

    Examples:
      | ClassYear |
      | 2009      |


  @MAT-Visits-TC-08
  Scenario: Verify Add new Visit

    When I click on "add new visit" link in Visit page
    And I enter the following details and click on "Add Visit" button :
      |College            | Date       | Time | Representative   | Location | Registrations | comments   |
      |Adelphi University | 04/12/2018 | 8 am | AutomationAdmin1 | boston   | 24            | attend plz |

    Then I should see a new entry in the Scheduled College Visits list with below details:
      |College            | Date             | Time    |  Representative  | Location | Registrations | comments   | RegistrationStatus|
      |Adelphi University |Thu April 12, 2018| 8:00 AM | AutomationAdmin1 | boston   | (24 max)      | attend plz | Open              |

  @MAT-Visits-TC-13
  Scenario Outline: Verify Edit Visit

    When I click on "edit" link of First college visit from the list
    And I update "<Representative>", "<Registrations>" ,"<comments>" and I Click on "Update" button
    Then I see the updated details "<Representative>", "<Registrations>", "<comments>" on the Scheduled College Visits list

    Examples:
      | Representative | Registrations | comments|
      | AutomationAdmin      | 22      | Attend Please |

  @MAT-Visits-TC-02
  Scenario: Verify Table and Colleges in Visit page

    Then I must see all the scheduled vists along with details like Representative, Date, Time, Registrations and Registrarion Status
    And I also see view, edit and delete links on each visit

  @MAT-Visits-TC-16
  Scenario: Verify Delete Visit

    When I click on delete link of First visit from the list and I Click on confirm button
    Then I should no longer see that entry in the Scheduled College Visits list