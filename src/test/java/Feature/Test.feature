Feature: LoginPage

  Scenario: To log into freeCRM application
    Given Open the url to navigate on freeCRM application
    And enter the username and password in the field
    When click on submit button
    Then check user is navigated on home page