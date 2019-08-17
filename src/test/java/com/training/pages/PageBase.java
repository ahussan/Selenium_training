package com.training.pages;

import com.training.TestBase;
import com.training.action.ActionImplementation;
import com.training.pages.gpspages.GpsLandingPage;
import org.openqa.selenium.WebDriver;

public class PageBase {

    public WebDriver driver;

    //private ActionImplementation instanceofAction ;

    //constructor
    public PageBase(WebDriver incomingDriver) {
        this.driver = incomingDriver;
    }

    //https://www.trymyui.com/login

    public ForgotPasswordPage navigateToSite(String url){
        driver.navigate().to(url);
        return TestBase.pageFactory(ForgotPasswordPage.class);
    }

    public GpsLandingPage navigateToGpsLandingPage(String url){
        driver.navigate().to(url);
        return TestBase.pageFactory(GpsLandingPage.class);
    }

    //TODO combine navigate to site and introduce Generic


    public ActionImplementation getInstanceofAction(){
        ActionImplementation instanceofAction;
        instanceofAction = new ActionImplementation(driver);
        return instanceofAction;
    }
}
