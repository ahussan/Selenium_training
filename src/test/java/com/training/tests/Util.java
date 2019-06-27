package com.training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

    public static boolean isElementPresentByText(WebDriver driver, String text) {
        boolean foo = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]"));
            if (element.isDisplayed()) {
                foo = true;
            }
        } catch (Exception e) {
            foo = false;
        }
        return foo;
    }

}
