package com.training.locators.id;

import org.openqa.selenium.By;

import java.util.function.Supplier;

public enum ForgotPasswordId implements Supplier<By > {

/*  EMAIL_TEXT_BOX("email"),
    RETRIVE_PASSWORD_BUTTON("form_submit"),
    EMAIL_SENT_CONFIRMATION("content"),*/

    ;

    private final By by;

    ForgotPasswordId(String id){
        this.by = By.id(id);
    }

    @Override
    public By get() {
        return by;
    }
}
