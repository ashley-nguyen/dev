@nondestructive
Feature: Use Surveys created in Naviance
  in order to use surveys created by users of navaince
  as a Naviance user
  I want to create and make surveys available to students

  @multidistrict
  Scenario: Survey in primary district
    Given I have a survey created in a primary district
    When I log into family connection "rtsa" as "pbest" and "test1234"
    Then I will be able to take the survey "state survey 1"

  @multidistrict
  Scenario: Survey in secondary district
    Given I have a survey created in a secondary district
    When I log into family connection "rtsa" as "pbest" and "test1234"
    Then I will be able to take the survey "county a survey 1"

  @multidistrict
  Scenario: Survey in primary and secondary district
    Given I have a survey created in a primary and secondary district
    When I log into family connection "rtsa" as "pbest" and "test1234"
    Then I will be able to take the survey "county a survey 1"

  @multidistrict
  Scenario: Survey in primary and secondary district
    Given I have a survey created in a primary and secondary district
    When I log into family connection "rtsa" as "pbest" and "test1234"
    Then I will be able to take the survey "state survey 1"

  @multidistrict
  Scenario: Survey in primary, secondary district and high school
    Given I have a survey created in a primary, secondary district and high school
    When I log into family connection "rtsa" as "pbest" and "test1234"
    Then I will be able to take the survey "county a survey 1"

  @multidistrict
  Scenario: Survey in primary, secondary district and high school
    Given I have a survey created in a primary, secondary district and high school
    When I log into family connection "rtsa" as "pbest" and "test1234"
    Then I will be able to take the survey "school a survey 1"

  @multidistrict
  Scenario: Survey in primary, secondary district and high school
    Given I have a survey created in a primary, secondary district and high school
    When I log into family connection "rtsa" as "pbest" and "test1234"
    Then I will be able to take the survey "state survey 1"


#  Scenario: Survey in inactive primary district and active secondary district and high school
#    Given I have a survey created in an inactive primary district and active secondary district and high school
#     Then I will be able to take the surveys
#     Then I will not be able to take the survey for the inactive tennant

 #  Scenario: Survey in inactive secondary district and active primary district and high school
 #    Given I have a survey created in an inactive primary district and active secondary district and high school
   #  When I log into family connection as a student
    # Then I will be able to take the surveys
    # Then I will not be able to take the survey for the inactive tennant

  # Scenario: Survey in inactive high school and active primary and secondary district
   #  Given I have a survey created in an inactive primary district and active secondary district and high school
    # When I log into family connection as a student
    # Then I will be able to take the surveys
    # Then I will not be able to take the survey for the inactive tennant