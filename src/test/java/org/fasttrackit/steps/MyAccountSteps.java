package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class MyAccountSteps {

    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToMyAccountPage(){
        myAccountPage.open();
    }
    @Step
    public void goToDashboard(){
        myAccountPage.clickOnDashboardButton();
    }
    @Step
    public void goToOrders(){
        myAccountPage.clickOnOrdersButton();
    }
    @Step
    public void goToDownloads(){
        myAccountPage.clickOnDownloadsButton();
    }
    @Step
    public void goToAddresses(){
        myAccountPage.clickOnAddressesButton();
    }
    @Step
    public void goToAccountDetails(){
        myAccountPage.clickOnAccountDetailsButton();
    }
    @Step
    public void goToLogout(){
        myAccountPage.clickOnLoggoutButton();
    }


}
