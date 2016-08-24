@NAVCORE671 @NAVCORE674
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
