package com.softwaretestingboard.steps;

import com.softwaretestingboard.pages.WomenTestPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class WomenSteps {


    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I Mouse Hover On Women Menu$")
    public void iMouseHoverOnWomenMenu() {
        new WomenTestPage().mouseHoverOnWomenMenu();
    }

    @And("^I Mouse Hover On Tops$")
    public void iMouseHoverOnTops() {
        new WomenTestPage().mouseHoverOnTops();
    }


    @And("^I Click On Jackets$")
    public void iClickOnJackets() {
        new WomenTestPage().clickOnJackets();
    }

    @And("^I Select Sort By Filter \"([^\"]*)\"$")
    public void iSelectSortByFilter(String productSort)  {
        new WomenTestPage().selectSortByFilter(productSort);
    }

    @Then("^I should be able to Verify that Product name is displayed in Alphabetical Order$")
    public void iShouldBeAbleToVerifyThatProductNameIsDisplayedInAlphabeticalOrder() {
        new WomenTestPage().returnActualProductNameArrayList();
        ArrayList<String> expectedList = new WomenTestPage().returnActualProductNameArrayList();
        ArrayList<String> actualList = new WomenTestPage().returnActualProductNameArrayList();
        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");


    }
    @Then("^I should be able to Verify that Product Size is displayed in Low to High$")
    public void iShouldBeAbleToVerifyThatProductSizeIsDisplayedInLowToHigh() {
    }
}
