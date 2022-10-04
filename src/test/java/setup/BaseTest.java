package setup;

import driver.DriverFactory;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Master\\Documents\\chromedriver_win32\\chromedriver.exe");
    }
    @After
    public void quit(){
        DriverFactory.killDriver();
    }
}
