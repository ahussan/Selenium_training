package com.training.locators;

import java.util.function.Supplier;

public enum ForgotPasswordLocators implements Supplier<String> {

    EMAIL_TEXT_BOX_ID("email"),
    RETRIVE_PASSWORD_BUTTON_ID("form_submit"),
    EMAIL_SENT_CONFIRMATION_ID("content"),

    EMAIL_SENT_CONFIRMATION_XPATH("//*[@id='content']"),

    DUMMYLINKTEXT ("DUMMYLINKTEXT"),

    ;

    private String stringVariable;

    ForgotPasswordLocators(String mystring){
        System.out.println("This is constructor");
        this.stringVariable = mystring;
    }


    @Override
    public String get() {
        return stringVariable;
    }
}
