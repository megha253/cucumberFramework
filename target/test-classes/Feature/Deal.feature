Feature: Fill the deal page form
  
  @Smoke
  Scenario: To fill the deal form
  Given Open the url to navigate on freeCRM application
    And enter the username and password in the field
    |megha253|Mg@9414|
    When click on submit button
    Then check user is navigated on home page
    Then open deal form
    Then user enters in deal page
    |Sr. Manager|Amazon|9414806399|100|
    Then save the deal page
    Then close the browser

  
