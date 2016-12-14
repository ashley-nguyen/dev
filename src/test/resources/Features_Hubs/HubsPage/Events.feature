@smoketest @nondestructive @hubs @admissionstopbar
Feature:  As a student viewing new Hubs' events screen , I want to see events so that I can register for event

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
  @test
  Scenario:
    When I open Recommended Events from sticky bar
    Then I should see College Events Details

  Scenario:
    When I open Recommended Events from sticky bar
    When I open "Adrian" School Event
    Then Sign Up Here page displayed for "Adrian" School event
    When I signup for Adrian School Event
    Then Message displayed "You're signed up for this event!"
