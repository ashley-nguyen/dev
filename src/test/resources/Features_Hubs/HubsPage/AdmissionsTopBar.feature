@smoketest @nondestructive @hubs @admissionstopbar
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button
    And I click the Admissions tab

  Scenario: The Regular Decision Deadline is displayed in Admissions Top Bar with correct data
    Then The Regular Decision Deadline should be "January 15" in Admissions Top bar

  Scenario: The Acceptance Rate is displayed in Admissions Top Bar with correct data
    Then The Acceptance Rate should be "83" in Admissions Top Bar

  Scenario: The Application Fees is displayed in Admissions Top Bar with correct data
    Then Application Fees should be "50" in Admissions Top Bar

  Scenario: The Important Policies is displayed in Admissions Top Bar with correct data
    Then The Important Policies in Admissions Top Bar should be:
    | Competitive Admissions |
    | Open Registration      |
    | Rolling Notification   |
