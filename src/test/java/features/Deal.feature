Feature: Deal functionality
  @Deal
  Scenario: Add new deal
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add new deal
    And      User fill the tile as "Deal1" and click on save
    When     New Deal should be added