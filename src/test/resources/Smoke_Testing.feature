Feature: this is smoke suit



  @Smoke_Testing
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard

  @Smoke_Testing  @parellel
  Scenario: Verify That the Hooks works fine
    Given The user wants to login website
    Then the user wants to verify that we can login



