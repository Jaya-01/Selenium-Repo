Feature: To check the login functionality

  @smoketest
  Scenario Outline:
: check the login is successful with valid credentials
    Given User is on the login page
    And User enters <username> and <password>
    When User clicks on login button
    Then User is navigated to home page
    
    Examples:
    |username|password|
    |Admin|admin123|
