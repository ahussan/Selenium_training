package com.training.locators.id;

import java.util.function.Supplier;

public enum ForgotPasswordId implements Supplier<String> {

    EMAIL_TEXT_BOX("email"),

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
