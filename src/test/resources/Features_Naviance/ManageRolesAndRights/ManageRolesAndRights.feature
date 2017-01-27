@destructive  @successplan
Feature: Manage Roles and Rights
  in order to get Pre condition Permissions
  as a Naviance user
  I want to be able to enable or disable permission options for Teacher Recommendations

  @permissions
  Scenario Outline: Enable Permission to View Teacher Documents
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I move to Teacher Documents
    Then I verify that Confirmation "<message>" message is displayed

  Examples:
    | account     | user       | password  | message                                        |
    | blue1hs        | frank.counselor | frank01!   | The permissions for this role have been updated|
