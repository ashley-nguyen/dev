@hubs @coststopbar
Feature: As a student viewing new Hubs' Costs tab, I want to see a top bar with at-a-glance information so that I get
  an idea what the school would cost me

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | Hobsons!23  |
    When I open the HUBS page for "Montevallo"
    Then I open the Costs tab

  Scenario: Average Total Cost is displayed with correct data for each income selected in the Costs Top bar
    Then Average Total Cost should correspond to the income in Costs Top Bar as follows:
    | $30 - $48K;14,312  |
    | $48 - $75K;15,804  |
    | $75 - $110K;16,885 |
    | > $110K;17,681    |
    | $0 - $30K;12,723  |
  @smoke
  Scenario: % Receiving Grant Aid is displayed with correct data for each Type of Aid selected in the Costs top bar
    Then % Aid should correspond to the type of aid as follows:
    | Grant;72                |
    | Pell Grant;41           |
    | Federal Student Loan;59 |

  Scenario: Typical Monthly Loan Payment is displayed with correct data in the Costs top bar (HUBS-924 - fixed)
    Then Typical Monthly Loan Payment is "238/month" in the Costs top bar

  Scenario: Average Total Cost and % Receiving Grant Aid should display the date of the data
    Then The date text should be displayed under the following sections in Costs Top Bar:
    | Average Total Cost;from 2016           |
    | % Receiving Grant Aid;from 2016        |
    | Typical Monthly Loan Payment;from 2014 |