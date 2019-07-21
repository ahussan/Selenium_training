package com.training.pages.gpspages;

import com.training.TestBase;
import com.training.pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.training.locators.linktext.gpslinktext.LandingPageLinkText.PIXEL3;
import static com.training.locators.xpath.gpsxpaths.LandingPageXpath.*;
import static com.training.tests.Util.isElementPresentByText;

public class GpsLandingPage extends PageBase {

    public GpsLandingPage(WebDriver incomingDriver) {
        super(incomingDriver);
    }

    public GpsLandingPage clickPhonesTopMenu(){

        List<WebElement> phoneMenus =  driver.findElements(PHONE_MENUS.get());
        phoneMenus.get(1).click();
        List<WebElement> subcategories = driver.findElements(PHONE_SUB_CATEGORIES.get());
        Assert.assertTrue(subcategories.get(1).isDisplayed());
        return TestBase.pageFactory(GpsLandingPage.class);
    }


    public PixelThreePage clickOnPixelThreePhone(){
        //driver.findElement(By.linkText(PIXEL3.get())).click();

        driver.findElement(PIXEL3.get()).click();

        List<WebElement> buyButtons = driver.findElements(BUY_BUTTONS.get());
        Assert.assertTrue(buyButtons.get(0).isDisplayed());

        isElementPresentByText(driver, "for 24 mos with 0% APR Google Store Financing");
        return TestBase.pageFactory(PixelThreePage.class);
    }

    public void testfun(){
        System.out.printf("Test function");
    }


}
