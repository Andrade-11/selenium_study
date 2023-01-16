package saucedemo.test;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import saucedemo.driver.DriverFactory;
import saucedemo.pages.CheckoutPage;
import saucedemo.pages.InventoryPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.OptionsPage;

import java.io.File;
import java.io.IOException;

import static saucedemo.driver.DriverFactory.getDriver;

public abstract class BaseTest{
    protected LoginPage user;
    protected CheckoutPage checkout;
    protected InventoryPage inventory;
    protected OptionsPage options;
    @Rule
    public TestName testName = new TestName();
    public BaseTest(){
        this.user = new LoginPage();
        this.checkout = new CheckoutPage();
        this.inventory = new InventoryPage();
        this.options = new OptionsPage();
    }

    @After
    public void quit() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
                File.separator + testName.getMethodName() + ".jpg"));
        DriverFactory.killDriver();
    }
}
