package saucedemo.test;


import org.junit.Assert;
import org.junit.Test;


public class CheckoutTest extends BaseTest {
        @Test
        public void sucessfullOrder() {
                user.login("standard_user","secret_sauce");
                inventory.getItemInTheCart();
                checkout.submitForm("Gabriel Augusto","Dias de Andrade","2312321321");
                Assert.assertEquals(checkout.searchThankYouOrder(),"THANK YOU FOR YOUR ORDER");
        }
}
