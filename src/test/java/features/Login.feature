Feature: Login functionality
  @Login
  Scenario: Login with email and password
    Given    User open the browser
    Then     User fill the email as "KB160790"and "Test123&" and click on login
    When     User should navigate at the home page


    Scenario Outline: Login with different data
      Given    User open the browser
      Then     User fill the email as "<username>"and "<password>" and click on login
      And      Error message
      Examples:
      |username|password|
      |Test    |12345   |
      |Test2   |12348   |