package saucedemo.test;

import org.junit.Assert;
import org.junit.Test;

public class InventoryTest extends BaseTest{

    @Test
    public void  orderProductZToA() {
        user.login("standard_user", "secret_sauce");
        inventory.selectFilterOption("Name (Z to A)");
    }
    @Test
    public void continueShopping() {
        user.login("standard_user","secret_sauce");
       inventory.getItemInTheCart();
       inventory.continueShopping();
        Assert.assertEquals(inventory.getTitle(),"PRODUCTS");
    }
}
