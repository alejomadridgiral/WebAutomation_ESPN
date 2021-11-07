package com.espn.training.test;

import com.espn.training.pages.EspnHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EspnTest extends BaseTest{

    @BeforeTest (groups = "Signup")
    public void singUp(){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToSignUp();
        home.signUp();
        home.fillFirstName("Alejandro");
        home.fillLastName("Madrid");
        home.fillEmail("alejandro.madrid4@globant.com");
        home.fillPassword("GLo_ESPN_1*#");
        home.fullfillSingUpSubmit();
    }

    @Test(groups="logIn")
    public void testEspnLogin() {
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        Assert.assertEquals(home.getUserName(), "WelcomeAlejandro!");
    }


}
