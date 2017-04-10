@hubs @tuitionandfees
Feature: As a student viewing new Hubs' Costs tab, I want to see a top bar with at-a-glance information so that I get
  an idea what the school would cost me

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | Hobsons!23  |
    When I open the HUBS page for "Adelphi"
    And I open the Costs tab

  Scenario: Tuition Fees for In-State is displayed with correct values for Tuition and Fees
    Then Tuition and Fee for this college is "$14,210" And AverageNavianceColleges is "$25,002"  displayed

  Scenario: Tuition Fees for Out-Of State is displayed with correct values for Tuition and Fees
    Then Out of State Tuition and Fee for ThisCollege "$14,210" and AverageNavianceColleges "$27,426" is displayed
  @smoke
  Scenario:Verify in State Tuition Amount
    When I open Tuition
    Then Display In-State tuition for This College "$0" and AverageNavianceColleges is "$16,452"

  Scenario:  Verify  Out Of State Tuition amount
    When I open Tuition
    Then Display Out of state tuition for ThisCollege "$0" and AverageNavianceColleges is "$18,831"

  Scenario: Total Fees for In-State
    When I open Total Fees
    Then Display In state Total Fee for ThisCollege is "$14,210" and AverageNavianceColleges is "$8,550"

  Scenario: Total Fees for Out-Of State
    When I open Total Fees
    Then Display Out of State Total Fees for ThisCollege is "$14,210" and AverageNavianceColleges is "$8,595"

  Scenario: Tuition Per Credit Hour for State
    When I open Tuition Per Credit Hour
    Then Display Tuition Per Credit Hour for ThisCollege is "empty" and AverageNavianceColleges is "$616"

  Scenario:Room and Board for State
    When I open Room and Board
    Then Display Room and Board Amount for ThisCollege is "$14,210" and AverageNavianceColleges "$9,505"







