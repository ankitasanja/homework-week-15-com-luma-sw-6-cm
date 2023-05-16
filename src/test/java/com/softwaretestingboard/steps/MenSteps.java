package com.softwaretestingboard.steps;

import com.softwaretestingboard.pages.MenTestPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on men menu$")
    public void iMouseHoverOnMenMenu() {
        new MenTestPage().mouseHoverOnMenMenu();
    }

    @And("^I mouse hover on bottoms$")
    public void iMouseHoverOnBottoms() {
        new MenTestPage().mouseHoverOnBottomMenu();
    }

    @And("^I click on pants$")
    public void iClickOnPants() {
        new MenTestPage().clickOnPants();
    }

    @And("^I mouse hover on product name \"([^\"]*)\"$")
    public void iMouseHoverOnProductName(String arg0)  {

    }

    @And("^I click on size \"([^\"]*)\"$")
    public void iClickOnSize(String arg0)  {
        new MenTestPage().mouseHoverAndClickOnProductSize();

    }

    @And("^I click on color \"([^\"]*)\"$")
    public void iClickOnColor(String arg0)  {
        new MenTestPage().mouseHoverAndClickOnProductColour();

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new MenTestPage().clickOnAddToCartButton();
    }

    @And("^I click on shopping cart link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenTestPage().clickOnShoppingCart();
    }

    @And("^I should be able to verify the text \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyTheText(String arg0)  {
        Assert.assertEquals(new MenTestPage().getTextForVerification(), "You added Cronus Yoga Pant to your shopping cart.","Products not added to shopping cart");
        
    }

    @And("^I should be able to verify the product name \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyTheProductName(String arg0)  {
        Assert.assertEquals(new MenTestPage().getTextFromProductName(), "Cronus Yoga Pant","Error message");
    }

    @And("^I should be able to verify the product size (\\d+)$")
    public void iShouldBeAbleToVerifyTheProductSize(int arg0) {
        Assert.assertEquals(new MenTestPage().getTextFromProductSize(),"32","Error message");
    }

    @And("^I should be able to verify the product colour \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyTheProductColour(String arg0)  {
        Assert.assertEquals(new MenTestPage().getTextFromProductColour(),"Black","Error message");
    }

    @And("^I should be able to verify the text \"([^\"]*)\" on men page$")
    public void iShouldBeAbleToVerifyTheTextOnMenPage(String arg0)  {
        Assert.assertEquals(new MenTestPage().getTextFromShoppingCart(),"Shopping Cart","Error message");
    }
    @Then("^I should be able to add product to the shopping cart successfully$")
    public void iShouldBeAbleToAddProductToTheShoppingCartSuccessfully() {

    }
}
