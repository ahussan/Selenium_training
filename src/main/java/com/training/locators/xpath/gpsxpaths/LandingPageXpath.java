package com.training.locators.xpath.gpsxpaths;

import java.util.function.Supplier;

public enum LandingPageXpath implements Supplier<String> {
    PHONE_MENUS("//button[@data-category-id='phones']"),

    PHONE_SUB_CATEGORIES("//div[@data-subcategory-id='phones']"),
    BUY_BUTTONS("//button/span[@class='button-text']"),  // This will return 3 button take first

    ;

    private final String xyz;

    LandingPageXpath(String myxpath ){
        this.xyz = myxpath;
    }

    @Override
    public String get() {
        return xyz;
    }
}
