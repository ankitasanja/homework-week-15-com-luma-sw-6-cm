package com.softwaretestingboard.pages;

import com.softwaretestingboard.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WomenTestPage extends Utility {

    private static final Logger log = LogManager.getLogger(WomenTestPage.class.getName());

    public WomenTestPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#ui-id-4")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-9")
    WebElement topsMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-11")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement dropDownList;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product details product-item-details']//div[@class='price-box price-final_price']//span[@class='price']")
    WebElement priceElements;

    public void mouseHoverOnWomenMenu() {
        log.info("Mouse hover on women menu" );
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        log.info("Mouse hover on tops" );
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJackets() {
        log.info("Click on jackets" );
        clickOnElement(jackets);
    }

    public void selectSortByFilter(String  productSort) {
        log.info("Get selection by sorting filter" );
        selectByVisibleTextFromDropDown(dropDownList, productSort);
    }

    public ArrayList<String> returnActualProductNameArrayList() {
        List<WebElement> listOfElements = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : listOfElements) {
            actualList.add(element.getText());
        }
        log.info("Get the product name verification" );
        return actualList;

    }

    public   ArrayList<String> returnActualPriceArrayList() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='product details product-item-details']//div[@class='price-box price-final_price']//span[@class='price']"));
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : listOfElements) {
            actualList.add(element.getText());
        }
        log.info("Get the product price verification" );
        return actualList;

    }

}
