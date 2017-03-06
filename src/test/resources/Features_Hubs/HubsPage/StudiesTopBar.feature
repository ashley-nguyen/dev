@hubs @studiestopbar
Feature: Purpose: As a student viewing new Hubs' Studies tab, I want to see key information in a top bar so that I
  can review it at a glance

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | amandahubs | hubs2016  |
    When I open the HUBS page for "Adrian"
    And I open the Studies tab
  @smoke
  Scenario: The Student Faculty Ratio is displayed with correct data in Studies Top Bar
    Then The Student Faculty Ratio should be "13" data in Studies Top Bar

  Scenario: The Student Retention is displayed with correct data in Studies Top Bar
    Then The Student Retention should be "58" in Studies Top Bar

  Scenario: The Graduation Rate is displayed with correct data in Studies Top Bar
    Then The Graduation Rate should be "54" in Studies Top Bar

  Scenario: The Degrees offered is displayed with correct data in Studies Top Bar
    Then The Degrees offered are displayed with correct data in Studies Top bar:
    | Graduate Certification |
    | Certification          |
    | Associates             |
    | Bachelors              |
    | Doctorate              |
    | Masters                |

  Scenario: A tooltip is displayed in Graduation Rate after clicking the information icon
    When I open the tooltip in Graduation Rate using the information icon
    Then A tooltip should be displayed in Graduation Rate

  Scenario: The tooltip in Graduation Rate is closed after clicking the close icon in the tooltip
    When I open the tooltip in Graduation Rate using the information icon
    And I click the close icon in the tooltip
    Then The tooltip in Graduation Rate should be closed

  Scenario: Each section in the Studies Top Bar has a label that indicates the date of the data
    Then I should see the date for the data in each section as follows:
    | Student Faculty Ratio;from 2016 |
    | Student Retention;from 2016     |
    | Graduation Rate;from 2016       |
    | Degrees Offered;from 2014       |