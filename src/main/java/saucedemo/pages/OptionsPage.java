package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static saucedemo.driver.DriverFactory.getDefaultWait;
import static saucedemo.driver.DriverFactory.getDriver;

public class OptionsPage extends BasePage{
    By options = By.id("react-burger-menu-btn");
    By about = By.id("about_sidebar_link");
    By logout = By.id("logout_sidebar_link");
    By superTitle = By.xpath("//*[@id=\"entry-3qDFahnypj1KkiORyU1Zyh\"]/div/div/div/div[1]/div/h1");
    public void aboutSauceDemo(){
        getDefaultWait().until(ExpectedConditions.elementToBeClickable(options)).click();
        reusable.clickInButton(about);
    }
    public void logoutSauceDemo(){
        reusable.clickInButton(options);
        reusable.clickInButton(logout);
    }
    public String getTextSuperTitle(){
        return getDriver().findElement(superTitle).getText();
    }
}
