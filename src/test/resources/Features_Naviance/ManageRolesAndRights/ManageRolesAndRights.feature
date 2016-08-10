@destructive  @successplan
Feature: Manage Roles and Rights
  in order to get Pre condition Permissions
  as a Naviance user
  I want to be able to enable or disable permission options for Teacher Recommendations

  @permissions
  Scenario Outline: Enable Permission to View Teacher Documents
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to Manage Roles and Rights
    When I click on manage link
    When I click on Modify Permissions link
    When I check View all Teacher rec. forms
    When I check Prepare my teacher rec. forms
    When I click on Submit button
    Then I verify that Confirmation "<message>" message is displayed

  Examples:
    | account     | user       | password  | message                                        |
    | rtsa        | stan.smith | stan01!   | The permissions for this role have been updated|
