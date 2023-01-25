package saucedemo.test;

import org.junit.Assert;
import org.junit.Test;
import saucedemo.database.interfaces.GetCredencial;
public class OptionsTest extends BaseTest implements GetCredencial {

    @Test
    public void aboutSauceDemo(){
        user.login(getUsernameValue(0), getPasswordValue(0));
        options.aboutSauceDemo();
        Assert.assertEquals(options.getTextSuperTitle(),"DEVELOP WITH CONFIDENCE");
    }
    @Test
    public void logout(){
        user.login(getUsernameValue(0),getPasswordValue(0));
        options.logoutSauceDemo();
    //In Future, will be implement one way to Assert this method. Now, It's arduous to do that
    }

}
