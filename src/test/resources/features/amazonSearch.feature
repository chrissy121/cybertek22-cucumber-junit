Feature: Amazon page add to cart functionality
  As a user, when I am on the amazon search page,
  I should be able to search hats for women, and see hats information,
  and add a first hat into the cart

  Scenario: User successfully add a hat into the cart
    Given User is on Amazon home page
    When User searches for hats
    Then User should see hats
    Then User can add first hat into the cart