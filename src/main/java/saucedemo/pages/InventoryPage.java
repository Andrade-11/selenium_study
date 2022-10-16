package saucedemo.pages;

import org.openqa.selenium.By;
import static saucedemo.driver.DriverFactory.getDriver;

public class InventoryPage extends BasePage{
    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.className("shopping_cart_link");

    protected void putItemInCart(){
        reusable.clickInButton(backpack);
    }
    protected void goToCART(){
        reusable.clickInButton(cart);
    }
    public void  getItemInTheCart(){
        putItemInCart();
        goToCART();
    }
}
