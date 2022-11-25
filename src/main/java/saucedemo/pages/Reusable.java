package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static saucedemo.driver.DriverFactory.getDriver;
public class Reusable {

    public void goToSauceDemo(){
        getDriver().get("https://www.saucedemo.com/");
    }

    public void writeTextField(By by,String text){
        getDriver().findElement(by).sendKeys(text);
    }
    public void clickInButton(By by){
        getDriver().findElement(by).click();
    }
    public void selectOption(By by,String option){
        Select select = new Select(getDriver().findElement(by));
        select.selectByVisibleText(option);
    }
    public void sleepBrowser() throws InterruptedException {
        Thread.sleep(2000);
    }
}
