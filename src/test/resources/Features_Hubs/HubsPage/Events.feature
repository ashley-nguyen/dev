@hubs @events
Feature:  As a student viewing new Hubs' events screen , I want to see events so that I can register for event

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa | amandahubs| hubs2016  |
    When I open the HUBS page for "Adelphi"


  Scenario: User is taken to Events Page when click Recommended Events
    When I open Recommended Events from sticky bar
    Then I should see College Events Details
  @smoke
  Scenario: User signup for the Event by selecting event from events details page
    When I open Recommended Events from sticky bar
    When SignUp for school "Adrian" for Event "ABC Store Event1"
    Then Sign Up Here page displayed for "Adrian" School event
    When I signup for Adrian School Event
    Then Message displayed "You're signed up for this event!"
    When I Return to All Events Page
    Then I should see College Events Details

  Scenario: User filter and view Recommended Events only
    Given I open Recommended Events from sticky bar
    When I See Recommended Events
    Then Recommended events are displayed on screen

  Scenario: User navigate to events screen from legacy by clicking link "Upcoming College Events"
    When I Navigate to old Colleges tab
    When I open link Upcoming college events
    Then I should see College Events Details

  Scenario: User filter test cases based on More Options filter criteria and verify results
    Given I open Recommended Events from sticky bar
    When I open button More Options
    Then Filter Options are displayed
    When I Select College Location within "250 miles" and enter zipcode "45040"
    When I open show results
    Then I see the Filtered Events "HUBS AUTOMATION EVENT"

