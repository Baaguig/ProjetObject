
@PageHomeOrange
Feature: Page d acceuil Orange HRM 
  En tant qu'utilisateur je me connecte 

  @connection_valide_orange 
  Scenario: authentification admin valide 
    Given ouvrir navigateur 
    And saisir url Orange 
    When saisir username 
    And saisir password 
    And cliquer sur le bouton login 
    Then vérifier page dashboead 
    And Vérifier compte client 