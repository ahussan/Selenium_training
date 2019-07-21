package com.training.locators.xpath.gpsxpaths;

import org.openqa.selenium.By;

import java.util.function.Supplier;


public enum LandingPageXpath implements Supplier<By> {
    PHONE_MENUS("//button[@data-category-id='phones']"),

    PHONE_SUB_CATEGORIES("//div[@data-subcategory-id='phones']"),
    BUY_BUTTONS("//button/span[@class='button-text']"),  // This will return 3 button take first

    ;

    private final By xyz;

    LandingPageXpath(String myxpath ){
        this.xyz = By.xpath(myxpath);
    }

    @Override
    public By get() {
        return xyz;
    }
}
