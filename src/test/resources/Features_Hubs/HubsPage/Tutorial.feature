@smoketest @nondestructive @hubs @tutorials
Feature: Validate as a student visiting a new hubs page for the first time,
  I see an instructional modal explaining features of new hubs page

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | ikeahubs | hubs2016  |
    When I open the HUBS page for "Adelphi"

  Scenario: Tutorial 1 dialog is displayed in Hubs
    Then I should see FirstTutorial dialog

  Scenario: Tell us what you think dialog is displayed in Hubs after click Next on Tutorial 1
    When I navigate to Second Tutorial
    Then I should see ThirdTutorial dialog



