Feature: Men Test
  As a user I want to add product to shopping cart from men category page on software testing board website


  @sanity @regression
  Scenario: User should add product to the shopping cart successfully
    Given I am on homepage
    When  I mouse hover on men menu
    And   I mouse hover on bottoms
    And   I click on pants
    And   I mouse hover on product name "Cronus Yoga Pant"
    And   I click on size "32"
    And   I click on color "Black"
    And   I click on add to cart button
    And   I should be able to verify the text "You added Cronus Yoga Pant to your shopping cart"
    And   I click on shopping cart link into message
    And   I should be able to verify the text "Shopping Cart." on men page
    And   I should be able to verify the product name "Cronus Yoga Pant"
    And   I should be able to verify the product size 32
    And   I should be able to verify the product colour "Black"
    Then  I should be able to add product to the shopping cart successfully
