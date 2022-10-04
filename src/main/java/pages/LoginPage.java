package pages;


import org.openqa.selenium.By;
import static driver.DriverFactory.getDriver;
import java.util.concurrent.TimeUnit;
public class LoginPage {
    By username = By.id("user-name");
    By passaword = By.id("password");
    By login_button = By.id("login-button");
    By word_invertory = By.className("Products");

    public void goToSauceDemo(){
        getDriver().get("https://www.saucedemo.com/");
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void login(String user,String pass)  {
        goToSauceDemo();
        getDriver().findElement(username).sendKeys(user);
        getDriver().findElement(passaword).sendKeys(pass);
        getDriver().findElement(login_button).click();
    }
}
