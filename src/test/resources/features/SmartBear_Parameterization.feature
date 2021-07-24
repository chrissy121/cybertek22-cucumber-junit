Feature: Login parameterization

  As a user I should be able to place an order and see my name on the order list

  @smartBear
  Scenario: Login parameterization
    Given User is on the SmartBear login page
    When user enters the given credentials
   And user click the login button
    Then user should see the dashboard page

  @smartBear
  Scenario: User is placing an order
    Given User is on the SmartBear order page
    When User selects "FamilyAlbum" from product dropdown
    And User enters 4 to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056"
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "John Wick" is in the list
