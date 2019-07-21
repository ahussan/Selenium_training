package com.training.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class ChromeImplementation implements IBrowserImplementation{

    @Override
    public WebDriver getDriverWithImplementation() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //String downloadFilepath = "src/test/resources/download";
        HashMap<String, Object> chromePrefsAnjal = new HashMap<String, Object>(); //T
        chromePrefsAnjal.put("profile.default_content_settings.popups", 0);
        //chromePrefs.put("download.default_directory", downloadFilepath);
        chromePrefsAnjal.put("credentials_enable_service", false);
        chromePrefsAnjal.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", chromePrefsAnjal);

        options.addArguments("--test-type");
        options.addArguments("chrome.switches");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        // To run test in headless driver
        //options.addArguments("headless");


       // WebDriver localdriver = new ChromeDriver(options);
        //return localdriver;

        return new ChromeDriver(options);
    }
}
