@smoketest @nondestructive @powerschool
Feature: Verify Powerschool sso config loads
  in order to configure powerschool sso settings
  as a Naviance user
  I want to navigate to the PowerSchool SSO setup
  Background:
    Given when I log in with the following user details:
      | blueqa1     | frank.district | password  |

# THIS TEST VERIFIES TD-38 FOR THE CONFIGURATION MAPPING CHANGES
# IF THE SINGLE SIGN IN OPTIONS PAGE LOADS WITH POWERSCHOOL SSO LISTED THE CONFIG ITEM IS SUCCESSFUL
  Scenario: Verify PowerSchool setup
    Given I am in Naviance district setup
    When I navigate to Single Sign-in Options
    Then PowerSchool SSO configuration will be displayed