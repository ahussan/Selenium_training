package com.training.pages;

import com.training.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.training.locators.id.ForgotPasswordId.EMAIL_TEXT_BOX;
import static com.training.locators.id.ForgotPasswordId.RETRIVE_PASSWORD_BUTTON;

public class ForgotPasswordPage extends PageBase {

    private WebDriver driver;


    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public ForgotPasswordPage entertextinBox(){

        WebElement textbox = driver.findElement(By.id(EMAIL_TEXT_BOX.get()));

        textbox.click();
        textbox.sendKeys("123@gmail.com");

        return TestBase.pageFactory(ForgotPasswordPage.class);
    }

    public ForgotPasswordPage clickOnRetrievePasswordButton(){

        WebElement button = driver.findElement(By.id(RETRIVE_PASSWORD_BUTTON.get()));
        button.click();

        //TODO Assertion

        return TestBase.pageFactory(ForgotPasswordPage.class);

    }


}
