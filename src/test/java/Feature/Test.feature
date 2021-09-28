Feature: LoginPage

  Scenario Outline: To log into freeCRM application
    Given Open the url to navigate on freeCRM application
    And enter the "<username>" and "<password>" in the field
    When click on submit button
    Then check user is navigated on home page
    Then open contact form
    Then user enters "<name>" and "<lastName>" and "<companyName>" and "<position>"
    Then save the contact
    Then close the browser
    
    Examples:
    
    | username  | password |name   | companyName | position | lastName |
    | megha253  | Mg@9414  | eloo	 | CTS         | HR       |	wan|      
    | megha1992 | Gm@9414  | Hima  | Infosys     | Manager  | shaan|