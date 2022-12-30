package saucedemo.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import saucedemo.pages.LoginPage;
import saucedemo.pages.Reusable;

public class Steps {
    private Reusable app;
    private LoginPage user;

    public Steps(){
        app = new Reusable();
        user = new LoginPage();
    }
    @Dado("que o usuario acessa o saucedemo")
    public void queOUsuarioAcessaOSaucedemo() {app.goToSauceDemo();}

    @Quando("inserir suas credencias")
    public void inputCredencial() throws InterruptedException {
        user.loginCucumber("standard_user", "secret_sauce");
    }

    @E("clicar no botao de: login")
    public void clicarNoBotaoDeLogin() throws InterruptedException {
        user.clickOnLoginButton();
    }

    @Então("ele sera direcionado para o inventario")
    public void goToInventory() {
        Assert.assertEquals(user.searchWordInInventory(),"PRODUCTS");
    }

}
