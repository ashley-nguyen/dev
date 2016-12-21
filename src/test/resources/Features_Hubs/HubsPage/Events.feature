@smoketest @nondestructive @hubs @admissionstopbar
Feature:  As a student viewing new Hubs' events screen , I want to see events so that I can register for event

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | amandahubs | hubs2016  |
    When I open the HUBS page for "Adelphi"

  Scenario:
    When I open Recommended Events from sticky bar
    Then I should see College Events Details

  Scenario:
    When I open Recommended Events from sticky bar
    When SignUp for school "Adrian" for Event "Mandeep -Automation Event1"
    Then Sign Up Here page displayed for "Adrian" School event
    When I signup for Adrian School Event
    Then Message displayed "You're signed up for this event!"


  Scenario:
    Given I open Recommended Events from sticky bar
    When I open "Adrian" School Event
    When SignUp for school "Adrian" for Event "Mandeep - Automation Test2"
    Then Sign Up Here page displayed for "Adrian" School event
    When I signup for Adrian School Event
    Then Message displayed "You're signed up for this event!"

  
  Scenario:
    Given I open Recommended Events from sticky bar
    When I open "HUBS General Launch Test4" School Event
    When I signup for Adrian School Event
    When I Return to All Events Page
    Then I should see College Events Details
