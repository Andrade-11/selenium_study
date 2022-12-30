package saucedemo.pages;

public abstract class BasePage {
    protected Reusable reusable;

    public BasePage(){
        reusable = new Reusable();
    }
}
