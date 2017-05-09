Feature: Elementary Group Detail page tests
  As a Elementary user
  I want to review the group detail page
  So that I will be able to see any change on group membership

  Background:
    Given I am logged into Naviance "blue2es" as "automation.admin" with "password"

  @ElementaryGroupDetailPage
  Scenario: Review message when empty group is assigned to Elementary
    When I create an empty student group "Empty_AUT_Group" with code "AUTGRP02" and assign it to Elementary with instructor "Automation Admin"
    Then The a message should be displayed on group detail page
    |This group does not have any students. If you have the right permission, go to Students > Groups to add students to this group.|