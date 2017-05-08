
Feature: Login to Curriculum page
  In order to verify Curriculum page
  As an administrator
  I want to specify the login conditions

  Background:
    Given I am logged into Naviance "snuffy" as "ntp.admin" with "password"

  Scenario:Navigate to Curriculum page
    Given I am on Naviance Home Page
    When I click on Curriculum link
    Then I should navigate to Curriculum page
