import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import setup.Setup;

public class LoginTest extends Setup {
    private WebDriver driver;
    @BeforeTest
    public void before(){
        setup();
        driver = new ChromeDriver();
    }

    @Test
    public void sucessfullLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }
    @AfterTest
    public void quit(){
    driver.quit();
    }
}
