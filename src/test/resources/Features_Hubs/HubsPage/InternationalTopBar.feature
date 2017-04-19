@hubs @internationaltopbar
Feature: As an International HS student, I need the ability to see International application data so I can make
  informed decisions about colleges.

  Background:
    Given I log in to Family Connection with the following user details:
      | hubsintl | samstudent | Hobsons!23  |
    When I open the HUBS page for "Adelphi"

  Scenario: The International Application Deadline is correct in International Top Bar
    Then The International Application Deadline should be "4-19" in the International Top Bar

  Scenario: Data for International Fees is correct in International Top Bar
    Then The International Fees should be the following in International Top bar:
      | Application Fee;380 |
      | Deposit;280         |

  Scenario: The International Test Requirements is correct in the International Top Bar
    Then The International Test Requirements should be the following in International Top bar:
      | TOEFL;OPTIONAL |
      | IELTS;OPTIONAL |
      | SAT;OPTIONAL   |
      | ACT;OPTIONAL   |
  
  Scenario: The International Applications data is correct in the International Top Bar
    Then The International Applications should be the following in International Top bar:
      | RECEIVED;333 |
      | ACCEPTED;33  |
      | ENROLLED;3   |

  Scenario: I should be redirected to the section "Application Information" in Admissions after clicking
  "See all deadlines" in International Top bar
    When I open the link "See all deadlines" in International Top Bar
    Then I should be redirected to the section "Application Information" in Admissions


