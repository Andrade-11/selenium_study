
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import setup.BaseTest;


import static driver.DriverFactory.getDriver;

public class LoginTest extends BaseTest {

    @Test
    public void sucessfullLogin() throws InterruptedException{
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(getDriver().getTitle(), "Swag Labs");
    }
}
