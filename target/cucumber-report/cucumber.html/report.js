$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("men.feature");
formatter.feature({
  "line": 1,
  "name": "Men Test",
  "description": "As a user I want to add product to shopping cart from men category page on software testing board website",
  "id": "men-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10974691300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should add product to the shopping cart successfully",
  "description": "",
  "id": "men-test;user-should-add-product-to-the-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on men menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover on bottoms",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on pants",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I mouse hover on product name \"Cronus Yoga Pant\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on size \"32\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on color \"Black\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to verify the text \"You added Cronus Yoga Pant to your shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on shopping cart link into message",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should be able to verify the text \"Shopping Cart.\" on men page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to verify the product name \"Cronus Yoga Pant\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should be able to verify the product size 32",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should be able to verify the product colour \"Black\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should be able to add product to the shopping cart successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MenSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 591737900,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.iMouseHoverOnMenMenu()"
});
formatter.result({
  "duration": 840276500,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.iMouseHoverOnBottoms()"
});
formatter.result({
  "duration": 729233100,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.iClickOnPants()"
});
formatter.result({
  "duration": 2329049800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cronus Yoga Pant",
      "offset": 31
    }
  ],
  "location": "MenSteps.iMouseHoverOnProductName(String)"
});
formatter.result({
  "duration": 3789700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 17
    }
  ],
  "location": "MenSteps.iClickOnSize(String)"
});
formatter.result({
  "duration": 424695700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Black",
      "offset": 18
    }
  ],
  "location": "MenSteps.iClickOnColor(String)"
});
formatter.result({
  "duration": 180052900,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 84045900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You added Cronus Yoga Pant to your shopping cart",
      "offset": 37
    }
  ],
  "location": "MenSteps.iShouldBeAbleToVerifyTheText(String)"
});
formatter.result({
  "duration": 2285208600,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.iClickOnShoppingCartLinkIntoMessage()"
});
formatter.result({
  "duration": 2000875300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart.",
      "offset": 37
    }
  ],
  "location": "MenSteps.iShouldBeAbleToVerifyTheTextOnMenPage(String)"
});
formatter.result({
  "duration": 229496100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cronus Yoga Pant",
      "offset": 45
    }
  ],
  "location": "MenSteps.iShouldBeAbleToVerifyTheProductName(String)"
});
formatter.result({
  "duration": 204838900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 44
    }
  ],
  "location": "MenSteps.iShouldBeAbleToVerifyTheProductSize(int)"
});
formatter.result({
  "duration": 117909500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Black",
      "offset": 47
    }
  ],
  "location": "MenSteps.iShouldBeAbleToVerifyTheProductColour(String)"
});
formatter.result({
  "duration": 133107600,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.iShouldBeAbleToAddProductToTheShoppingCartSuccessfully()"
});
formatter.result({
  "duration": 21700,
  "status": "passed"
});
formatter.after({
  "duration": 1539509900,
  "status": "passed"
});
});