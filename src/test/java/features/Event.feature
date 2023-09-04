Feature: Event functionality
  @Event
  Scenario: Add new event
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add new event
    And      User fill the title as "Event2" and select event date and the event category and click on save
    When     Event should be added
