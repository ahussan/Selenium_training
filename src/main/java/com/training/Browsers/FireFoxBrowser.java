package com.training.Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBrowser implements IWebBrowser {
    @Override
    public WebDriver getWebDriverObject() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("screenResolution", "1280x1024");
        firefoxOptions.setCapability("marionette", true);

        return new FirefoxDriver(firefoxOptions);    }
}
