@repvisits
Feature: RepVisits
  As a Naviance User
  I want to be able to verify all aspects of College Visits

  Background:
    Given I am logged into Naviance "edocs601" as "cathy.counselor" with "cathy01!"
    And I go to Visits Page

  Scenario Outline: Verify view past college visits is displayed correctly
    When I go to view past visits
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
    Then I must see College visit tables with below headers
      |College | Representative | Date| Time | Registrations | Registration Status |
    And I also see below links for all colleges enabled:
      |view | edit |delete |

  @MAT-Visits-TC-16
  Scenario: Verify Delete Visit
    When I click on delete link of First visit from the list
    And I click on "Delete" button
    Then I should no longer see Deleted entry in the Scheduled College Visits list


  @MAT-147 @MAT-147-TC-01 @wip-integration
  Scenario: Verify disabling of management of visits when external college visits are enabled
    When the external college visits are enabled
    Then all the links pertaining to visits management should be disabled


  @MAT-107 @wip-integration
  Scenario: Verify Non RepVisits users are shown a sign up reminder message
    When I am a "Non RepVisits" user
    Then I see the message "Consider using RepVisits, located in the Counselor Community, to schedule visits."



  @MAT-107 @wip-integration
  Scenario: Verify RepVisits users are shown a use RepVisits reminder message
    When I am a "RepVisits" user
    Then I see the message "Manage your College Visits in RepVisits."