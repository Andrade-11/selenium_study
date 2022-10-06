package saucedemo.pages;


import org.openqa.selenium.By;
import static saucedemo.driver.DriverFactory.getDriver;

public class LoginPage {
    By username = By.id("user-name");
    By passaword = By.id("password");
    By login_button = By.id("login-button");
    By word_invertory = By.className("title");
    By error_message = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");


    public void goToSauceDemo(){
        getDriver().get("https://www.saucedemo.com/");
    }

    public void login(String user,String pass) throws InterruptedException {
        goToSauceDemo();
        getDriver().findElement(username).sendKeys(user);
        getDriver().findElement(passaword).sendKeys(pass);
        getDriver().findElement(login_button).click();
        Thread.sleep(2000);
    }
    public String searchWordInInventory(){
       return getDriver().findElement(word_invertory).getText();
    }
    public String searchMensageErrorLogin(){
        return getDriver().findElement(error_message).getText();
    }
}
