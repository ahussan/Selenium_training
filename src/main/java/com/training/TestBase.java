package com.training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public static WebDriverWait wait;


    @BeforeSuite(alwaysRun = true)
    public static void instantiateDriverObject() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
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
}
