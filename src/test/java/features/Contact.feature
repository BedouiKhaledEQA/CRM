Feature: Contact functionality
  @Contact
  Scenario: Add new contact
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add new contact
    And      User fill the Firstname as "TestKB" and "BKTEST" and click on save
    When     New contact should be added