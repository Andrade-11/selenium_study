package saucedemo.test;

import org.junit.Assert;
import org.junit.Test;

public class InventoryTest extends BaseTest{

    @Test
    public void  orderProductZToA() {
        user.login("standard_user", "secret_sauce");
        inventory.selectFilterOption("Name (Z to A)");
        Assert.assertEquals("Test.allTheThings() T-Shirt (Red)",inventory.getTextAboutListOfProducts());
    }

    @Test
    public void  orderProductAToZ() {
        user.login("standard_user", "secret_sauce");
        inventory.selectFilterOption("Name (A to Z)");
        Assert.assertEquals("Sauce Labs Backpack",inventory.getTextAboutListOfProducts());
    }

    @Test
    public void  orderProductLowPrice() {
        user.login("standard_user", "secret_sauce");
        inventory.selectFilterOption("Price (low to high)");
        Assert.assertEquals("Sauce Labs Onesie",inventory.getTextAboutListOfProducts());
    }

    @Test
    public void  orderProductToHigh() {
        user.login("standard_user", "secret_sauce");
        inventory.selectFilterOption("Price (high to low)");
        Assert.assertEquals("Sauce Labs Fleece Jacket",inventory.getTextAboutListOfProducts());
    }
    @Test
    public void continueShopping() {
        user.login("standard_user","secret_sauce");
       inventory.getItemInTheCart();
       inventory.continueShopping();
        Assert.assertEquals(inventory.getTitle(),"PRODUCTS");
    }
}
