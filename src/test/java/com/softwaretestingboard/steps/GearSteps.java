package com.softwaretestingboard.steps;

import com.softwaretestingboard.pages.GearTestPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }
    @When("^I mouse hover on gear menu$")
    public void iMouseHoverOnGearMenu() {
        new GearTestPage().mouseHoverOnGearMenu();
    }

    @And("^I click on bags$")
    public void iClickOnBags() {
        new GearTestPage().clickOnBags();
    }

    @And("^I click on product name \"([^\"]*)\"$")
    public void iClickOnProductName(String arg0)  {
        new GearTestPage().clickOnProductName();

    }

    @And("^I should be able to verify text \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyText(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromProductName(),"Overnight Duffle", "Error message: Product name is not matching");

    }

    @And("^I change quantity (\\d+)$")
    public void iChangeQuantity(String num) {
        new GearTestPage().clearAnElement();
        new GearTestPage().changeQuantity(num);
    }

    @And("^I click on add to cart button on gear page$")
    public void iClickOnAddToCartButtonOnGearPage() {
        new GearTestPage().clickOnAddToCart();
    }

    @And("^I should be able to verify text \"([^\"]*)\" on gear page$")
    public void iShouldBeAbleToVerifyTextOnGearPage(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromAfterAddToCart(),"You added Overnight Duffle to your shopping cart.", "Error message: message is not matching");

    }

    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new GearTestPage().clickOnShoppingCart();

    }

    @And("^I should be able to verify product name \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyProductName(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromOverNightDuffleBag(),"Overnight Duffle","Error message: message is not matching");

    }

    @And("^I should be able to verify quantity \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyQuantity(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromTheEnteredQuantity(),"3","Error message: Quantity is not matching");

    }

    @And("^I should be able to verify product price \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyProductPrice(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromProductPrice(),"$135.00","Error message: Price is not matching");

    }

    @And("^I change quantity to (\\d+)$")
    public void iChangeQuantityTo(String number) {
        new GearTestPage().clearAnElementFromUpdatedShoppingCart();
        new GearTestPage().updateTheQuantity(number);
    }

    @And("^I click on update shopping cart$")
    public void iClickOnUpdateShoppingCart() {
        new GearTestPage().updateShoppingCart();
    }

    @And("^I should be able to verify product price \"([^\"]*)\" on gear page$")
    public void iShouldBeAbleToVerifyProductPriceOnGearPage(String arg0) {
        Assert.assertEquals(new GearTestPage().getTextFromUpdatedProductPrice(),"$225.00","Error message: Price is not matching");

    }

    @Then("^I should be able to add product to shopping cart successfully$")
    public void iShouldBeAbleToAddProductToShoppingCartSuccessfully() {
    }



}
