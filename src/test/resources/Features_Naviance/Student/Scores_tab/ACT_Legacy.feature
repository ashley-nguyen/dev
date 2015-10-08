@destructive
Feature: Student ACT legacy scores
  in order to track ACT legacy test scores
  as a Naviance user
  I want to be able to manage student ACT legacy scores

  @act
  Scenario Outline: View Student ACT legacy scores
    Given I am logged into naviance as an admin user
    When I search for <student> using the global search field
    Then their ACT legacy test scores will be displayed <english> <math> <reading> <science> <writing_sub> <comb_eng_wri> <composite> <date> <grade>

    Examples:
      | student | english | math | reading  | science  | writing_sub  |  comb_eng_wri  | composite | date  | grade |
      | Apple, Chamisa  |  25  | 33  | 29  | 28  | 9 | 30  | 29  | Oct 2014 | 11  |