package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class LoginSteps {

    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void goToLoginPage(){
        homepage.clickMyAccount();
        //homepage.clickLoginLink();
    }

    @Step
    public void loginUser(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPassField(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(String email ){
        myAccountPage.checkLoggedIn(email);
    }

    @Step
    public void checkUserNotLoggedIn(){
        loginPage.checkErrorMessageInvalidEmail();
        loginPage.checkErrorMessageInvalidPassword("");
    }

    @Step
    public void userStillOnLoginPage(){
        loginPage.checkUserIsOnLoginPage();
    }

}
