package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static saucedemo.driver.DriverFactory.getDefaultWait;
import static saucedemo.driver.DriverFactory.getDriver;

public class OptionsPage extends BasePage{
    By options = By.id("react-burger-menu-btn");
    By about = By.id("about_sidebar_link");
    By logout = By.id("logout_sidebar_link");
    By superTitle = By.xpath("//*[@id=\"entry-3qDFahnypj1KkiORyU1Zyh\"]/div/div/div/div[1]/div/h1");
    By username = By.xpath("user-name");
    public void aboutSauceDemo(){
        getDefaultWait().until(ExpectedConditions.elementToBeClickable(options)).click();
        getDefaultWait().until(ExpectedConditions.elementToBeClickable(about)).click();
    }
    public void logoutSauceDemo(){
        getDefaultWait().until(ExpectedConditions.elementToBeClickable(options)).click();
        getDefaultWait().until(ExpectedConditions.elementToBeClickable(logout)).click();
    }
    public WebElement getUsername(){
        return getDriver().findElement(username);
    }

    public String getTextSuperTitle(){
        return getDriver().findElement(superTitle).getText();
    }
}
