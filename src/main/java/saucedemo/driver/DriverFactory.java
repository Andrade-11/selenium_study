package saucedemo.driver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            ChromeOptions options = new ChromeOptions();
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
}
