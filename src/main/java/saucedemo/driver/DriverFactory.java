package saucedemo.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public final class DriverFactory {
    private static WebDriver driver;

    public DriverFactory(){
        throw new UnsupportedOperationException("This is one Utility Class can't be instantiate");
    }

    public static WebDriver getDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("start-maximized");
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        }
        return driver;
    }
    public static void killDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    public static WebDriverWait getDefaultWait(){
        return new WebDriverWait(driver, Duration.ofSeconds(3));
    }
}
