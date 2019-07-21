package com.training.locators.linktext.gpslinktext;

import org.openqa.selenium.By;

import java.util.function.Supplier;

public enum LandingPageLinkText implements Supplier<By> {

    PIXEL3("Pixel 3")

    ;

    private By enumLinkText;

    LandingPageLinkText(String text){
        this.enumLinkText = By.linkText(text);
    }

    @Override
    public By get() {
        return enumLinkText;
    }
}
