package com.training.pages;

import com.training.TestBase;
import org.openqa.selenium.WebDriver;

public class PageBase {

    public WebDriver driver;

    //constructor
    public PageBase(WebDriver incomingDriver) {
        this.driver = incomingDriver;
    }

    //https://www.trymyui.com/login

    public ForgotPasswordPage navigateToSite(String url){
        driver.navigate().to(url);
        //driver.getJavascript().waitForPageToLoad();
        return TestBase.pageFactory(ForgotPasswordPage.class);
    }




}
