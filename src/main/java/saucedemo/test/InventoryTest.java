package saucedemo.test;

import org.junit.Assert;
import org.junit.Test;
import saucedemo.pages.InventoryPage;
import saucedemo.pages.LoginPage;

public class InventoryTest extends BaseTest{
    private LoginPage user;
    private InventoryPage inventoryPage;

    public InventoryTest(){
        user = new LoginPage();
        inventoryPage = new InventoryPage();
    }
    @Test
    public void  orderProductZToA() {
        user.login("standard_user", "secret_sauce");
        inventoryPage.selectFilterOption("Name (Z to A)");
    }
    @Test
    public void continueShopping() {
        user.login("standard_user","secret_sauce");
        inventoryPage.getItemInTheCart();
        inventoryPage.continueShopping();
        Assert.assertEquals(inventoryPage.getTitle(),"PRODUCTS");
    }
}
