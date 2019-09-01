package com.training.pages;

import com.training.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.training.locators.ForgotPasswordLocators.*;


public class ForgotPasswordPage extends PageBase {


    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }


    public ForgotPasswordPage entertextinBox(){

        WebElement textbox = driver.findElement(By.id(EMAIL_TEXT_BOX_ID.get()));

        textbox.click();
        textbox.sendKeys("123@gmail.com");

        return TestBase.pageFactory(ForgotPasswordPage.class);
    }

    public ForgotPasswordPage clickOnRetrievePasswordButton(){

        WebElement button = driver.findElement(By.id(RETRIVE_PASSWORD_BUTTON_ID.get()));
        button.click();

        WebElement confirMationTextElement = driver.findElement(By.id(EMAIL_SENT_CONFIRMATION_ID.get()));

        Assert.assertTrue(confirMationTextElement.isDisplayed());


        //compare text
        String confirmationText = confirMationTextElement.getText();
        Assert.assertEquals("Your e-mail's been sent!", confirmationText);

        return TestBase.pageFactory(ForgotPasswordPage.class); // TODO followup later
    }


    public ForgotPasswordPage verifymessageUsingXpath(){
        WebElement elementFoundByXpath = driver.findElement(By.xpath(EMAIL_SENT_CONFIRMATION_XPATH.get()));
        Assert.assertTrue(elementFoundByXpath.isDisplayed());

        String txtInWebPage = elementFoundByXpath.getText();
        Assert.assertEquals(txtInWebPage, "Your e-mail's been sent!");
        return this;
    }
}
