package saucedemo.test;

import com.beust.ah.A;
import jdk.vm.ci.aarch64.AArch64;
import org.junit.Assert;
import org.junit.Test;
import saucedemo.pages.CheckoutPage;
import saucedemo.pages.InventoryPage;
import saucedemo.pages.LoginPage;

public class CheckoutTest extends BaseTest {
        private LoginPage loginPage;
        private CheckoutPage checkout;
        private InventoryPage inventory;
        public CheckoutTest(){
                loginPage = new LoginPage();
                checkout = new CheckoutPage();
                inventory = new InventoryPage();
        }
        @Test
        public void sucessfullOrder() throws InterruptedException {
                loginPage.login("standard_user","secret_sauce");
                inventory.getItemInTheCart();
                checkout.submitForm("Gabriel Augusto","Dias de Andrade","2312321321");
                Assert.assertEquals(checkout.searchThankYouOrder(),"THANK YOU FOR YOUR ORDER");
        }
}
