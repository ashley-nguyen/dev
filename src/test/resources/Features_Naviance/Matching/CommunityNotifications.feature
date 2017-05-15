@CommunityNotifications
Feature: Community Notifications
  As a Naviance User
  I want to be able to View the Community Notifications in Succeed when There are any changes in community

  Background:
    Given I am logged into Naviance "edocs601" as "cathy.counselor" with "cathy01!"


  @MAT-83-TC-01, @wip-integration
  Scenario: Verify Notification when there are changes in Community.
    When There are no changes in Community
    Then I should not See a red dot overlaying on top of Profile icon in Realtime.


  @MAT-83-TC-02, @wip-integration
  Scenario: Verify Notification when there are changes in Community.
    When There are any changes in Community
    Then I See a red dot overlaying on top of Profile icon in Realtime.