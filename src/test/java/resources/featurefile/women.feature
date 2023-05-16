Feature: Women Test
  As user I want to verify Sort By Filter on Women Page


#  @sanity @regression
  Scenario: Verify user should be able to verify product Name in alphabetical order on Page
    Given I am on Home Page
    When  I Mouse Hover On Women Menu
    And   I Mouse Hover On Tops
    And   I Click On Jackets
    And   I Select Sort By Filter "Product Name"
    Then  I should be able to Verify that Product name is displayed in Alphabetical Order


  @smoke @regression
  Scenario:  Verify user should be able to verify Price in Low to High
    Given I am on Home Page
    When  I Mouse Hover On Women Menu
    And   I Mouse Hover On Tops
    And   I Click On Jackets
    And   I Select Sort By Filter "Price"
    Then  I should be able to Verify that Product Size is displayed in Low to High