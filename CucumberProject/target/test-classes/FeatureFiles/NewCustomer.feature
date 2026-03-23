Feature: Create New Customer

  Background: 
    Given user opens the Homepage of the application
    And User enters the username as "mngr656968"
    And User enters the Password as "YmebatA"
    When User click on Login Button
    Then User will be Navigated to the Homepage

  Scenario Outline: Validate: New Customer Creation with all Credentials
    Given user clicks on New Customer
    And user enters the customer name as "<customerName>"
    And user selects the gender
    And user enters the DOB as "<DOB>"
    And user enters the Adress as "<Adress>"
    And user enters the city as "<city>"
    And user enters the State as "<State>"
    And user enters the pin as "<pin>"
    And user enters the Mobile Number  as "<MobileNumber>"
    And user enters the email as
    And user enters the Password as "<Password>"
    When user clicks on submit button
    Then new customer is created
    And user captures the customer_id

    Examples: 
      | customerName | DOB        | Adress      | city      | State     | pin    | MobileNumber | Password    |
      | Lavanya      | 03/18/1989 | Tilak nagar | hyderabad | Telangana | 500044 |   8919857318 | lavanya1234 |
