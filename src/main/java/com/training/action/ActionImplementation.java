package com.training.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.function.Supplier;

public class ActionImplementation {

    private WebDriver aidriver;

    public ActionImplementation(WebDriver incomingDriver){
        this.aidriver = incomingDriver;
    }

    public void rightClick(Supplier<By> by){
        Actions myActions = new Actions(aidriver);
        myActions.contextClick(aidriver.findElement(by.get())).build().perform();
    }


}
