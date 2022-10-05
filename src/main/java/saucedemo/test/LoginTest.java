package saucedemo.test;

import org.junit.Assert;
import org.junit.Test;
import saucedemo.pages.LoginPage;



public class LoginTest extends BaseTest {

    @Test
    public void sucessfullLogin() throws InterruptedException{
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(loginPage.searchWordInInventory(), "PRODUCTS");
    }
}
