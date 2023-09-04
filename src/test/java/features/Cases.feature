Feature: Cases functionality
  @Cases
  Scenario: Add new Cases
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add new case
    And      User fill the title case as "case1" and click on save
    When     New case should be added