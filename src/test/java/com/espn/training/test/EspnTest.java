package com.espn.training.test;

import com.espn.training.pages.EspnHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EspnTest extends BaseTest{

    @BeforeTest(groups="Signup")
    public void singUp(){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.signUp();
        home.fillFirstName("Alejandro");
        home.fillLastName("Madrid");
        home.fillEmail("alejandro.madrid6@globant.com");
        home.fillPassword("GLo_ESPN_1*#");
        home.fullfillSingUpSubmit();
        home.clickLogOut();
    }

//    @BeforeTest (groups = "LogIn")
    @Test(groups="logIn")
    public void login(){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn("alejandro.madrid1@globant.com");
        home.fillPasswordLogIn("GLo_ESPN_1*#");
        home.clickLogIn();
        home.triggerUser();
        Assert.assertEquals(home.getUserName(), "WelcomeAlejandro!");
    }

//    @Test (groups="logIn, Signup", priority = 0)
//    public void testEspnLogin() {
//        EspnHomePage home = getEspnHomePage();
//        home.triggerUser();
//        Assert.assertEquals(home.getUserName(), "WelcomeAlejandro!");
//    }

    @Test(groups="LogOut")
    public void testEspnLogOut(){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn("alejandro.madrid1@globant.com");
        home.fillPasswordLogIn("GLo_ESPN_1*#");
        home.clickLogIn();
        home.triggerUser();
        home.clickLogOut();
        Assert.assertEquals(home.getUserNameLogOut(), "Customize ESPN");
    }

    @Test(groups="CancelAccount")
    public void cancelAccount(){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn("alejandro.madrid3@globant.com");
        home.fillPasswordLogIn("GLo_ESPN_1*#");
        home.clickLogIn();
        home.triggerUser();
        home.clickEspnProfile();
        home.switchToLogInIframe();
        home.clickCancelAccount();
        home.clickConfirmAccountDelete();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn("alejandro.madrid3@globant.com");
        home.fillPasswordLogIn("GLo_ESPN_1*#");
        home.clickLogIn();
        Assert.assertEquals(home.getAccountDeactivate(), "Account Deactivated");
    }

    @Test(groups="CancelAccount")
    public void testCancelAccount(){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn("alejandro.madrid4@globant.com");
        home.fillPasswordLogIn("GLo_ESPN_1*#");
        home.clickLogIn();
        Assert.assertEquals(home.getAccountDeactivate(), "Account Deactivated");
    }
}
