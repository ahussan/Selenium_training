package com.training.locators.linktext.gpslinktext;

import java.util.function.Supplier;

public enum LandingPageLinkText implements Supplier<String> {

    PIXEL3("Pixel 3")

    ;

    private String link;

    LandingPageLinkText(String text){
        this.link = text;
    }
    @Override
    public String get() {
        return link;
    }
}
