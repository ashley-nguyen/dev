@NAVCORE671 @NAVCORE674 @NAVCORE647
Feature: Email Verification
  As a teacher,
  I want to receive an email notifying me of a letter of recommendation request from a student so that
  I can be alerted to create a letter of recommendation for that student.

  Scenario: Verify given I am a teacher, when a student creates a LOR for me, then I will receive an email notifiy me of the request.
    Given I log into family connection "rtsa" as "stan.smith" and "stan01!"
    When I click on the Colleges tab
    When I click on letters of recommendation
    When I click on Add Request
    And I select a teacher  "Sandro Sejas"
    When I select a college
    And I click save
    Then I will verify the mail was delivered with "New teacher recommendation request" subject

  Scenario: Verify when accessing the LOR email from my mailbox, I should be able to reply directly to the student..
    Then I can reply email directly with "naviance.test123@gmail.com" and "naviance123" password

  Scenario: Verify given I am a teacher, when a student cancels a LOR for me, then I will receive an email notifiy me of the cancellation
    Given I log into family connection "rtsa" as "stan.smith" and "stan01!"
    When I click on the Colleges tab
    When I click on letters of recommendation
    When I click on cancel button
    And I click on Confirm button
    Then I will verify the mail was delivered with "Teacher recommendation request cancelled" subject

  Scenario: Verify given a student has cancelled a LOR for me, when an email is sent to my mailbox and the student's account contains a valid email address, then I can reply directly to the student.
    Given I log into family connection "rtsa" as "stan.smith" and "stan01!"
    When I click on the Colleges tab
    When I click on letters of recommendation
    When I click on cancel button
    And I click on Confirm button
    Then I can reply email directly with "naviance.test123@gmail.com" and "naviance123" password


  Scenario Outline: Given I am a staff member (WITH edit list of teachers permission), when accessing a student's college tab, in the Teacher Recommendation section, then I select a teacher and college to add a request.  The teacher DOES have an LOR request with a status of: Requested, In Progress, or Submitted for the selected college.
    Given I am logged into Naviance "rtsa" as "stan.smith" with "stan01!"
    When I search for <student> using the global search field
    And I add a request with <teacher> and <application>
   Then I will verify the mail was delivered with "Teacher recommendation can't add request" subject


  Examples:
    | student       | teacher      | application         |
    | Sejas, Frank  | Frank Sejas  | Adelphi University  |

  Scenario Outline: Given I am a staff member (WITH edit list of teachers permission), when accessing a student's college tab, in the Teacher Recommendation section, then I select a teacher and college to add a request.  The MAX NUMBER OF REQUESTS has been fulfilled for the college.  A LOR is counted when there is a request that exists for the student & college combo in one of the following statuses: Requested, In Progress, or Submitted.
    Given I am logged into Naviance "rtsa" as "stan.smith" with "stan01!"
    When I search for <student> using the global search field
    And I add a request with <teacher> and <application>
    Then I verify the number of LORs <message> message
    Then I will verify the mail was delivered with "Teacher recommendation can't add request" subject


  Examples:
    | student       | teacher      | application         | message |
    | Sejas, Frank  | Frank Sejas  | Adelphi University  |A letter of recommendation request already exists for the teacher and application selected.|

  Scenario Outline: Given I am a staff member (WITH edit list of teachers permission), when accessing a student's college tab, in the Teacher Recommendation section, then I select a teacher and college to add a request.  The MAX NUMBER OF REQUESTS has been fulfilled for the college.  A LOR is counted when there is a request that exists for the student & college combo in one of the following statuses: Requested, In Progress, or Submitted.
    Given I am logged into Naviance "rtsa" as "stan.smith" with "stan01!"
    When I search for <student> using the global search field
    And I add a request with <teacher> and <application>
    Then I verify the number of LORs <message> message

  Examples:
    | student       | teacher             | application         | message |
    | a101, a101    | Jandell Counselor   | Adelphi University  |Success! A new letter of recommendation request has been created.|
