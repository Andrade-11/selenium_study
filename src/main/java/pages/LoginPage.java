package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By username = By.id("user-name");
    By passaword = By.id("password");
    By login_button = By.id("login-button");
    By word_invertory = By.className("Products");
    public void goToSauceDemo(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void login(String user,String pass)  {
        goToSauceDemo();
        driver.findElement(username).sendKeys(user);
        driver.findElement(passaword).sendKeys(pass);
        driver.findElement(login_button).click();
    }
}
