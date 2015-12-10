Feature: Counselors viewing a student should be able to change the username for a parent at their school and only change
  the username for their school. The parent's username at other schools should be unaffected. Usernames that match other
  users at the same school should be rejected, but usernames that match other users at different schools are permitted.

  Scenario: As a school counselor viewing a student whose parent has registered in Family Connection, I should be
  permitted to change that parent's username to one that is totally unique in the system, and it should change the
  username ONLY for my school, not for all schools associated with this parent.
    Given I complete the fields on the login page for a school user
    And I search for "aisner" using "name" the student roster search
    And I manually reset the username for "yojo@yahoo.com" to "czechItOut"
#    Then I should see "The Family Connection Username and Password for this parent have been updated."
#    And I should see "czechItOut"
#    Then I authenticate as "carrie.counselor" with password "carrie01!" for school "TCMS"
#    And I search for students with the last name, first name of "Brady, Cynthia"
#    Then I should see "carol.brady.ms@dev.naviance.com"
#    And I should not see "czechItOut"