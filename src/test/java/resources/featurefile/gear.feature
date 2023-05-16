Feature: Gear Test Page
  As a user I want to add product to shopping cart from gear category page on software testing board website

#  @sanity @regression
  Scenario: User should add product to the shopping cart successfully
    Given I am on the homepage
    When  I mouse hover on gear menu
    And   I click on bags
    And   I click on product name "Overnight Duffle"
    And   I should be able to verify text "Overnight Duffle"
    And   I change quantity 3
    And   I click on add to cart button on gear page
    And   I should be able to verify text "You added Overnight Duffle to your shopping cart." on gear page
    And   I click on shopping cart link
    And   I should be able to verify product name "Cronus Yoga Pant"
    And   I should be able to verify quantity "3"
    And   I should be able to verify product price "$135.00"
    And   I change quantity to 5
    And   I click on update shopping cart
    And   I should be able to verify product price "$225.00" on gear page
    Then  I should be able to add product to shopping cart successfully