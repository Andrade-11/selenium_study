package saucedemo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        CheckoutTest.class,
        InventoryTest.class

})
public class SuiteCase {
}
