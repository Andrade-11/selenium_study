package saucedemo.test;

import org.junit.Assert;
import org.junit.Test;
import saucedemo.pages.LoginPage;



public class LoginTest extends BaseTest {
    private LoginPage user;
    public LoginTest(){
        user = new LoginPage();
    }
    @Test
    public void sucessfullLogin() throws InterruptedException{
        user.login("standard_user", "secret_sauce");
        Assert.assertEquals(user.searchWordInInventory(), "PRODUCTS");
    }
    @Test
    public void messageErrorLogin() throws InterruptedException{
    user.login("standard_user","21321321");
    Assert.assertEquals(user.searchMensageErrorLogin(),"Epic sadface: Username and password do not match any user in this service");
    }
}
