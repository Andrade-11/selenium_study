package saucedemo.test;

import org.junit.Assert;
import org.junit.Test;
import saucedemo.database.interfaces.GetCredencial;



public class LoginTest extends BaseTest implements GetCredencial {

    @Test
    public void sucessfullLogin(){
        user.login(getUsernameValue(0), getPasswordValue(0));
        Assert.assertEquals(user.searchWordInInventory(), "Products");
    }
    @Test
    public void messageErrorLogin() {
    user.login(getUsernameValue(1),getPasswordValue(1));
    Assert.assertEquals(user.searchMensageErrorLogin(),"Epic sadface: Username and password do not match any user in this service");
    }
}

