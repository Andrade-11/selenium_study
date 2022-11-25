package saucedemo.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import saucedemo.pages.LoginPage;
import saucedemo.pages.Reusable;

public class Login {
    private Reusable app;
    private LoginPage user;

    public Login(){
        app = new Reusable();
        user = new LoginPage();
    }
    @Dado("que o usuário esta na pagina https:\\/\\/www.saucedemo.com\\/")
    public void goToSauceDemo() {
        app.goToSauceDemo();
    }

    @Quando("inserir suas credencias")
    public void inputCredencial() throws InterruptedException {
        user.login("standard_user", "secret_sauce");
    }

    @E("clicar no botão de: login")
    public void clicarNoBotãoDeLogin() throws InterruptedException {
        user.clickOnLoginButton();
    }

    @Então("ele será direcionado para o inventário")
    public void goToInventory() {
        Assert.assertEquals(user.searchMensageErrorLogin(),"Epic sadface: Username and password do not match any user in this service");
    }



}
