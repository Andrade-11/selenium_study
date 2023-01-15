package saucedemo.pages;

import org.openqa.selenium.By;

import static saucedemo.driver.DriverFactory.getDriver;

public class InventoryPage extends BasePage{
    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.className("shopping_cart_link");
    By product_sort = By.className("product_sort_container");
    By continue_shopping = By.id("continue-shopping");
    By title = By.className("title");

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
    public void selectFilterOption(String option){
        reusable.selectOption(product_sort,option);
    }
    public void continueShopping(){
        reusable.clickInButton(continue_shopping);
    }

    public String getTitle(){
        return getDriver().findElement(title).getText();
    }
}
