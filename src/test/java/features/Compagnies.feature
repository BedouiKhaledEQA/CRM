Feature: Compagnies functionality
  @Comapgnie
  Scenario: Add new compagnies
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add new compagnie
    And      User fill the title as "Compagnie1" and click on save
    When     New compagnie should be added