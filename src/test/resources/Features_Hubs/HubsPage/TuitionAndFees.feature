@smoketest @nondestructive @hubs @coststopbar
Feature: As a student viewing new Hubs' Costs tab, I want to see a top bar with at-a-glance information so that I get
  an idea what the school would cost me

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Adrian"
    And I open the Costs tab

  Scenario: Tuition Fees for In-State is displayed with correct values for Tuition and Fees
    Then Tuition and Fee for this college is "$43,400" And AverageNavianceColleges is "$24,551"  displayed

  Scenario: Tuition Fees for Out-Of State is displayed with correct values for Tuition and Fees
    Then Out of State Tuition and Fee for ThisCollege "$43,400" and AverageNavianceColleges "$26,974" is displayed

  Scenario:Verify in State Tuition Amount
    When I open Tuition
    Then Display In-State tuition for This College "$31,870" and AverageNavianceColleges is "$16,456"

  Scenario:  Verify  Out Of State Tuition amount
    When I open Tuition
    Then Display Out of state tuition for ThisCollege "$31,870" and AverageNavianceColleges is "$18,834"

  Scenario: Total Fees for In-State
    When I open Total Fees
    Then Display In state Total Fee for ThisCollege is "$11,530" and AverageNavianceColleges is "$8,095"

  Scenario: Total Fees for Out-Of State
    When I open Total Fees
    Then Display Out of State Total Fees for ThisCollege is "11,530" and AverageNavianceColleges is "8,140"
    
  Scenario: Tuition Per Credit Hour for State
    When I open Tuition Per Credit Hour
    Then Display Tuition Per Credit Hour for ThisCollege is "890" and AverageNavianceColleges is "615"

  Scenario:Room and Board for State
    When I open Room and Board
    Then Display Room and Board Amount for ThisCollege is "9,740" and AverageNavianceColleges "8,892"







