Feature: Amazon Search and Cart feature
@wip
  Scenario: Amazon search and cart functionality
    Given User is on the Amazon home page
    When User search for hats for men
    And User adds the first hat appearing to the cart with quantity two
    Then the total price and quantity should be correct
    When User reduce the quantity from two to one
    Then total price and quantity has been correctly changed
