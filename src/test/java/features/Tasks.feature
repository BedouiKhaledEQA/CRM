Feature: Tasks functionality
  @Task
  Scenario: Add new Task
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    And      User click on add new Task
    And      User fill the Task tile as "Task1" and click on save
    When     New Task should be added