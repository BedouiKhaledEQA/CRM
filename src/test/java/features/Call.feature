Feature: Call functionality
  @Call
  Scenario: Add new Call
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add new call
    And      User fill the deal from research as "Deal1" and click on save
    When     New call should be added