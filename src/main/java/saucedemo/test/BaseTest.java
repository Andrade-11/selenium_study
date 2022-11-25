package saucedemo.test;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import saucedemo.driver.DriverFactory;

import java.io.File;
import java.io.IOException;

import static saucedemo.driver.DriverFactory.getDriver;

public class BaseTest {
    @Rule
    public TestName testName = new TestName();

    @After
    public void quit() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
                File.separator + testName.getMethodName() + ".jpg"));
        DriverFactory.killDriver();
    }
}
