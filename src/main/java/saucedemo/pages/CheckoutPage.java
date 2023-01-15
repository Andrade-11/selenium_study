package saucedemo.pages;

import org.openqa.selenium.By;
import static saucedemo.driver.DriverFactory.getDriver;

public class CheckoutPage extends BasePage {
    By checkout = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By continueButton = By.name("continue");
    By finish = By.id("finish");
    By thank_you = By.className("complete-header");

    public void submitForm(String name,String lastname,String zipcode){
        reusable.clickInButton(checkout);
        reusable.writeTextField(firstName,name);
        reusable.writeTextField(lastName,lastname);
        reusable.writeTextField(zipCode,zipcode);
        reusable.clickInButton(continueButton);
        reusable.clickInButton(finish );
    }
    public String searchThankYouOrder(){
        return getDriver().findElement(thank_you).getText();
    }

}
