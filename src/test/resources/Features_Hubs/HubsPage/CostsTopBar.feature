@smoketest @nondestructive @hubs @coststopbar
Feature: As a student viewing new Hubs' Costs tab, I want to see a top bar with at-a-glance information so that I get
  an idea what the school would cost me

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button
    And I click the Costs tab

  Scenario Outline: Average Total Cost is displayed with correct data for each income selected in the Costs Top bar
    Then Average Total Cost should be "<avgTotalCost>" when the income is "<income>" in Costs Top Bar
    Examples:
    | income      | avgTotalCost  |
    | $30 - $48K  | 16,053        |
    | $48 - $75K  | 18,404        |
    | $75 - $110K | 20,500        |
    | > $110K     | 21,680        |
    | $0 - $30K   | 13,814        |

  Scenario Outline: % Receiving Grant Aid is displayed with correct data for each Type of Aid selected in the Costs top bar
    Then % Aid should be "<aid>" when the Type of Aid is "<typeOfAid>"
    Examples:
    | typeOfAid            | aid |
    | Grant                | 54  |
    | Pell Grant           | 16  |
    | Federal Student Loan | 35  |

  Scenario: Typical Monthly Loan Payment is displayed with correct data in the Costs top bar
    Then Typical Monthly Loan Payment is "247/month" in the Costs top bar

  Scenario: Average Total Cost and % Receiving Grant Aid should display the date of the data
    Then The text "from 2016" should be displayed under the following sections in Costs Top Bar:
    | Average Total Cost    |
    | % Receiving Grant Aid |