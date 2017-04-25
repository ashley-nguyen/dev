@visits
Feature: Type-casted year input to in  test
  in order to ensure no errors in the page
  as a Naviance user
  I want to be able to view past college visits

  Background:
    Given I am logged into Naviance "blueqa1" as "frank.district" with "password"
    And I go to Visits Page

  Scenario Outline: Verify view past college visits is displayed correctly
    Then I can toggle class year <ClassYear>

    Examples:
      | ClassYear |
      | 2009      |


  @MAT-Visits-TC-08
  Scenario: Verify Add new Visit
    When I click on "add new visit" link in Visit page
    And I enter the following details :
      |College      | Date       | Time | Representative   | Location | Registrations | Comments   | Deadline Hours | Deadline Days|
      |Alma College | 04/28/2018 | 9 am | AutomationAdmin1 | boston   | 20            | Comment1   |                | 1            |
    And I click on "Add Visit" button
    Then I should see a new entry in the Scheduled College Visits list with below details:
      |College      | Representative |Date              | Time    | Registrations | RegistrationStatus|
      |Alma College |AutomationAdmin1|Sat April 28, 2018| 9:00 AM |  (20 max)     | Open              |

  @MAT-Visits-TC-13
  Scenario: Verify Edit Visit
    When I click on "edit" link of first visit from the list
    And I update the following fields with new values:
      |Representative  | Registrations|
      |AutomationAdmin2| 25           |
    And I click on "Update Visit" button
    Then I see the updated details as below in first visit from the list:
      |Representative  | Registrations|
      |AutomationAdmin2| (25 max)     |


  @MAT-Visits-TC-02
  Scenario: Verify College Visits Table contents
    Then I must see College visit tables with below headings
      |College | Representative | Date| Time | Registrations | Registration Status |
    And I also see below links for all colleges enabled:
      |view | edit |delete |

  @MAT-Visits-TC-16
  Scenario: Verify Delete Visit

    When I click on delete link of First visit from the list and I Click on confirm button
    Then I should no longer see Deleted entry in the Scheduled College Visits list