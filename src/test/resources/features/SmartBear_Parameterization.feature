Feature: Login parameterization

  @wip
  Scenario: Login parameterization
    Given User is logged SmartBear account
    When user can be order page
    Then user selects FamilyAlbum from product dropdown
    And User enters 4 to quantity
    And User enters John Wick to costumer name
    And User enters Kinzie Ave to street
    And User enters Chicago to city
  And User enters IL to state
  And User enters 6005610
  And User selects Visa as card type
  And User enters 1111222233334444 to card number
  And User enters 12/22 to expiration date
  And User clicks process button
  Then User verifies JohnWick is in the list

