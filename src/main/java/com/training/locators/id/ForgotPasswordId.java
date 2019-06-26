package com.training.locators.id;

import org.openqa.selenium.By;

import java.util.function.Supplier;

public enum ForgotPasswordId implements Supplier<String > {

    EMAIL_TEXT_BOX("email"),
    RETRIVE_PASSWORD_BUTTON("form_submit"),
    EMAIL_SENT_CONFIRMATION("content"),

    ;

    private final String id;

    ForgotPasswordId(String id){
        this.id = id;
    }

    @Override
    public String get() {
        return id;
    }
}
