package saucedemo.test;

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
    public void  orderProductZToA() throws InterruptedException {
        user.login("standard_user", "secret_sauce");
        inventoryPage.selectFilterOption("Name (Z to A)");
    }
}
