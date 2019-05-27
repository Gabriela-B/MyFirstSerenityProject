package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {

    @FindBy(css = "#post-7 > div > div > div? p:nth-child(1) >strong:nth-child(1)")
    private WebElementFacade helloMessage;

    @FindBy(css= "li.woocommerce-MyAccount-navigation-link a[href$='page_id=7']" )
    private WebElementFacade dashboardButton;

    @FindBy(css= "li.woocommerce-MyAccount-navigation-link a[href$='page_id=7&orders']" )
    private WebElementFacade ordersButton;

    @FindBy(css= "li.woocommerce-MyAccount-navigation-link a[href$='c]" )
    private WebElementFacade downloadsButton;

    @FindBy(css= "li.woocommerce-MyAccount-navigation-link a[href$='address']" )
    private WebElementFacade addressesButton;

    @FindBy(css= "li.woocommerce-MyAccount-navigation-link a[href$='account']" )
    private WebElementFacade accountDetailsButton;

    @FindBy(css= "li.woocommerce-MyAccount-navigation-link a[href*='logout&_wpnonce']" )
    private WebElementFacade logoutButton;

    @FindBy (css="p a[href*='page_id=7&edit-address']" )
    private WebElementFacade dashboardMessage;

    @FindBy (css="a.woocommerce-Button.button")
    private WebElementFacade goShopButton;

    @FindBy (css="tr[class*='woocommerce-orders-table']")
    private WebElementFacade ordersTabel;

    @FindBy (css="div.u-column1 h3")
    private WebElementFacade addressesMessage;

    @FindBy (css= "button[value='Save changes']")
    private WebElementFacade accountDetailsMessage;

    public void checkLoggedIn(String email) {
        helloMessage.shouldContainText( email );
    }

    public void clickOnDashboardButton(){
        clickOn(dashboardButton);
    }
    public void clickOnOrdersButton(){
      clickOn(ordersButton);
    }
    public void clickOnDownloadsButton(){
        clickOn(downloadsButton);
    }
    public void clickOnAddressesButton(){
        clickOn(addressesButton);
    }
    public void clickOnAccountDetailsButton(){
        clickOn(accountDetailsButton);
    }
    public void clickOnLoggoutButton(){
        clickOn(logoutButton);
    }

    public void checkDashboardMessage(){
        dashboardMessage.shouldContainText("shipping and billing addresses");
    }
    public void checkNoOrdersMessage(){
        goShopButton.shouldBeVisible();
    }
    public void checkOrdersMessage(){
        ordersTabel.shouldBeVisible();
    }
    public void checkAddressesMessage(){
        addressesMessage.shouldContainText("Billing address");
    }


}









