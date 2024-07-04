package saucedemo.test;


import org.junit.Assert;
import org.junit.Test;
import saucedemo.database.interfaces.GetCredencial;


public class CheckoutTest extends BaseTest implements GetCredencial {
        @Test
        public void sucessfullOrder() {
                user.login(getUsernameValue(0),getPasswordValue(0));
                inventory.getItemInTheCart();
                checkout.submitForm("Gabriel Augusto","Dias de Andrade","2312321321");
                Assert.assertEquals(checkout.searchThankYouOrder(),"THANK YOU FOR YOUR ORDER");
        }
}
