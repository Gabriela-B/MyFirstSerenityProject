package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class Homepage extends PageObject {

    @FindBy(css = "#menu-item-64")
    private WebElementFacade myAccountButton;

    @FindBy(css = "button.woocommerce-Button.button[value='Login'")
    private WebElementFacade loginButton;

    @FindBy(css="button.woocommerce-Button.button[value='Register'")
    private WebElementFacade registerButton;

//    @FindBy(css = "a[title='Log In']")
//    private WebElementFacade loginLink;

    public void clickMyAccount(){
        clickOn(myAccountButton);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);

    }
    //    public void clickLoginLink(){
//        clickOn(loginLink);
//    }

}
