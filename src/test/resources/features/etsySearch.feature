Feature: Etsy search feature


  Scenario: Etsy default title verification
    Given User is on the Etsy landing page
    Then User should see Etsy title as  expected


  Scenario: Etsy Search Functionality Title Verification
      Given User is on the Etsy landing page
      When User types Wooden Spoon in the search bar
      And User click to search button
      Then User sees title is Wooden spoon | Etsy
