package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<WebElement> listOfElementProducts(){
        List<WebElement> listOFTitles = getDriver().findElements(By.className("inventory_item_name"));
        return new ArrayList<>(listOFTitles);
    }
    public void printarArrayList(){
        System.out.print(listOfElementProducts().get(4).getText());
    }
    public String getTextAboutListOfProducts(){
        return listOfElementProducts().get(0).getText();
    }
}
