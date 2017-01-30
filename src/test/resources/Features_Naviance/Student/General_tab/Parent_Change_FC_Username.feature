Feature: Counselors viewing a student should be able to change the username for a parent at their school and only change
  the username for their school. The parent's username at other schools should be unaffected. Usernames that match other
  users at the same school should be rejected, but usernames that match other users at different schools are permitted.

  Scenario Outline: As a school counselor viewing a student whose parent has registered in Family Connection, I should be
  permitted to change that parent's username to one that is totally unique in the system, and it should change the
  username ONLY for my school, not for all schools associated with this parent.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    Then I search for "A103, A103" using the global search field
  Examples:
    | user           | account | password |
    | frank.counselor     | blue1hs    | frank01!  |