package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty9.util.security.Credential;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Before
    public void maximiseWindow(){
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Constants.USER_NAME, Constants.USER_PASSWORD);
     //   loginSteps.checkUserIsLoggedIn();
    }

    @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("testare.gb@gmail.com","tetare1234");
        loginSteps.checkUserNotLoggedIn();
    }

    @Test
    public void loginWithIncorrectEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("testaregfdgf.gb@gmail.com","testare1234");
        loginSteps.checkUserNotLoggedIn();
    }
    @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("testare.gbgmail.com","testare1234");
        loginSteps.userStillOnLoginPage();
    }

}
