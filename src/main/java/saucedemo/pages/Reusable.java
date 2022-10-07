package saucedemo.pages;

import org.openqa.selenium.By;

import static saucedemo.driver.DriverFactory.getDriver;
public class Reusable {

    public void goToSauceDemo(){
        getDriver().get("https://www.saucedemo.com/");
    }

    public void writeTextField(By by,String texto){
        getDriver().findElement(by).sendKeys(texto);
    }
    public void clickInButton(By by){
        getDriver().findElement(by).click();
    }
    public void sleepBrowser() throws InterruptedException {
        Thread.sleep(1000);
    }
}
