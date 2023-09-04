Feature: CalenderTest functionality
  @CalenderTest
  Scenario: Add new event
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add  TitleCal
    And      User fill the titleCal as "Event1" and select event date and the event category and click on save
    When     TitleCal should be added