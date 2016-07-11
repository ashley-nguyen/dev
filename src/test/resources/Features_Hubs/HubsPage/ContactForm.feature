@smoketest @nondestructive @hubs @contactform
Feature: Purpose: As a student viewing the new HUBS, I need the ability to send a message to the college via a contact
  form so that I can make contact with a college.

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario: The student's email is displayed in the Email Field
    Then The student's email "dawn.melzer@hobsons.com" should be present in the Email Field

  Scenario: The student's phone number is displayed in the Phone Field
    Then The student's phone number "123-456-7890" should be displayed in the Phone Field
@test
  Scenario: The message 'Your message has been sent' is displayed after sending an email with content
    When I enter "Test Content" in the Subject Field
    And I enter "Test Message" in the Message Field
    And I click on 'Send Message'
    Then I should see the message "Your message has been sent"
@test
  Scenario: An error message is displayed after trying to send an email without email and phone
    When I clear the email field and the phone field in Contact Form
    And I click on 'Send Message'
    Then I should see an error message "Please enter an email or phone number."