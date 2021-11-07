package com.espn.training.test;

import com.espn.training.pages.EspnHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EspnTest extends BaseTest{

//    @BeforeTest (groups = "Signup")
//    public void singUp(){
//        EspnHomePage home = getEspnHomePage();
//        home.triggerUser();
//        home.logIn();
//        home.switchToLogInIframe();
//        home.signUp();
//        home.fillFirstName("Alejandro");
//        home.fillLastName("Madrid");
//        home.fillEmail("alejandro.madrid4@globant.com");
//        home.fillPassword("GLo_ESPN_1*#");
//        home.fullfillSingUpSubmit();
//    }


    @BeforeTest (groups = "LogIn")
    public void login(){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn("alejandro.madrid4@globant.com");
        home.fillPasswordLogIn("GLo_ESPN_1*#");
        home.clickLogIn();
    }


    @Test (groups="logIn, Signup", priority = 0)
    public void testEspnLogin() {
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        Assert.assertEquals(home.getUserName(), "WelcomeAlejandro!");
    }

    @Test (priority = 1)
    public void testEspnLogOut(){
        EspnHomePage home = getEspnHomePage();
        home.clickLogOut();
        Assert.assertEquals(home.getUserNameLogOut(), "Customize ESPN");
    }






}
