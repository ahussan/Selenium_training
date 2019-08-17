package com.training.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxImplementation implements IBrowserImplementation {

    @Override
    public WebDriver getDriverWithImplementation() {

        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions ffoptions = new FirefoxOptions();
        ffoptions.setCapability("screenResolution", "1280x1024");
        ffoptions.setCapability("marionette", true);

        return new FirefoxDriver(ffoptions);
    }
}


