Feature: Login Functionallity

  Scenario Outline: Validate the Login Functionality with Valid Credentials
    Given user opens the Homepage of the application
    And User enters the username as "<username>"
    And User enters the Password as "<password>"
    When User click on Login Button
    Then User will be Navigated to the Homepage

    Examples: 
      | username   | password |
      | mngr656968 | YmebatA  |
