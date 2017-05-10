@hubs @applicationinformation @prod
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | amandahubs | Hobsons!23 |
    When I open the HUBS page for "Albion"
    And I open the Admissions tab

  Scenario Outline: The deadlines are displayed with correct data in Application Information
    When I open "Deadlines" in Application Information
    Then The deadline with name "<name>" and date "<date>" should be displayed in Application Information
    Examples:
    | name                  | date   |
    | Rolling Deadline      | Jul 12 |
    | Early Action Deadline | Dec 1  |

  @smoke
  Scenario: Correct data is displayed for 'Important Policies' in 'Application Information'
    When I open "Important Policies" in Application Information
    Then The data for 'Important Policies' should be similar to the table:
    | Admission Policy;Competitive       |
    | Notification Policy;Rolling        |
    | Early Decision;Yes                 |
    | Wait List;Yes                      |
    | Registration Policy;By Appointment |

  Scenario: The displayed fees for 'Freshman' are correct
    When I open "Fees" in Application Information
    Then The fees for "Freshman" should be:
    | Application Fee;** |
    | Deposit;$350       |

  Scenario: The displayed fees for 'Freshman' are correct
    When I open "Fees" in Application Information
    Then The fees for "Transfer" should be:
      | Application Fee;** |
      | Deposit;$350       |

  Scenario: The displayed fees for 'Freshman' are correct
    When I open "Fees" in Application Information
    Then The fees for "International" should be:
      | Application Fee;** |
      | Deposit;$350       |

  Scenario: The official page for the college is displayed after clicking the link below fees
    When I open "Fees" in Application Information
    And I open the link with text "** Learn more about this at albion.edu" in Fees
    Then I should see the URL for "http://www.albion.edu/" open in a new page