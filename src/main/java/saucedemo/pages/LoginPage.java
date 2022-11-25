package saucedemo.pages;


import org.openqa.selenium.By;
import static saucedemo.driver.DriverFactory.getDriver;

public class LoginPage extends BasePage{
    By username = By.id("user-name");
    By passaword = By.id("password");
    By login_button = By.id("login-button");
    By word_invertory = By.className("title");
    By error_message = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public void login(String user,String pass) throws InterruptedException {
        reusable.goToSauceDemo();
        reusable.writeTextField(username,user);
        reusable.writeTextField(passaword,pass);
        reusable.clickInButton(login_button);
        reusable.sleepBrowser();
    }
    public void clickOnLoginButton() throws InterruptedException {
        reusable.clickInButton(login_button);
        reusable.sleepBrowser();
    }
    public String searchWordInInventory(){
       return getDriver().findElement(word_invertory).getText();
    }
    public String searchMensageErrorLogin(){
        return getDriver().findElement(error_message).getText();
    }
}
