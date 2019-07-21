package com.training;

import com.training.browser.ChromeImplementation;
import com.training.browser.FireFoxImplementation;
import com.training.reports.ReporterNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

@Listeners(ReporterNG.class)
public class TestBase {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static String whichBrowser = System.getProperty("Browser");


    public final String APP_URL = "http://the-internet.herokuapp.com/forgot_password";
    public final String GOOGLE_URL = "https://store.google.com/";


    @BeforeSuite(alwaysRun = true)
    public static void instantiateDriverObject() {
        //TODO Make Thread safe
        assignDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
    }

    @AfterMethod(alwaysRun = true)
    public static void clearCookies() {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @AfterSuite(alwaysRun = true)
    public static void quitBrowser() {
        driver.quit();
    }
    public static <T> T pageFactory(Class<T> clazz) {
        return PageFactory.initElements(driver, clazz);
    }

    private static void assignDriver() {
        if (whichBrowser == null) {
            whichBrowser = "chrome";
        }
        switch (whichBrowser) {
            case "chrome":
                driver = new ChromeImplementation().getDriverWithImplementation();
                break;
            case "firefox":
                driver = new FireFoxImplementation().getDriverWithImplementation();
            case "safari":
                //TODO
                break;
            case "ie":
                //TODO
                break;
        }
    }
}
