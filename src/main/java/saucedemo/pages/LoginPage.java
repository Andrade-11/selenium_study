package saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static saucedemo.driver.DriverFactory.getDefaultWait;
import static saucedemo.driver.DriverFactory.getDriver;

public class LoginPage extends BasePage{
    By username = By.id("user-name");
    By passaword = By.id("password");
    By login_button = By.id("login-button");
    By word_invertory = By.className("title");
    By error_message = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    //This methods used in Junit Test
    public void login(String user,String pass) throws InterruptedException {
        reusable.goToSauceDemo();
        reusable.writeTextField(username,user);
        reusable.writeTextField(passaword,pass);
        getDefaultWait().until(ExpectedConditions.visibilityOfElementLocated(login_button));
        reusable.clickInButton(login_button);

    }
    //This methods used in Login feature Cucumber
    public void loginCucumber(String user,String pass){
        reusable.goToSauceDemo();
        reusable.writeTextField(username,user);
        reusable.writeTextField(passaword,pass);
    }
    public void clickOnLoginButton() throws InterruptedException {
        getDefaultWait().until(ExpectedConditions.visibilityOfElementLocated(login_button));
        reusable.clickInButton(login_button);
    }
    public String searchWordInInventory(){
       return getDriver().findElement(word_invertory).getText();
    }
    public String searchMensageErrorLogin(){
        return getDriver().findElement(error_message).getText();
    }
}
