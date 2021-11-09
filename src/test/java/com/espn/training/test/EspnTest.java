package com.espn.training.test;

import com.espn.training.Data.Data;
import com.espn.training.pages.EspnHomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class EspnTest extends BaseTest{

    @Test(groups="logIn", dataProvider = "createData", dataProviderClass = Data.class)
    public void logIn(String fName, String flastNAme, String fEmail, String fPassword ){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.signUp();
        home.fillFirstName(fName);
        home.fillLastName(flastNAme);
        home.fillEmail(fEmail);
        home.fillPassword(fPassword);
        home.fullfillSingUpSubmit();
        home.triggerUser();
        home.clickLogOut();
        home.refreshLogin();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn(fEmail);
        home.fillPasswordLogIn(fPassword);
        home.clickLogIn();
        home.triggerUser();
        home.clickLogOut();
        Assert.assertEquals(home.getUserName(), "Welcome"+fName+"!");
    }

//    @Test(groups="logIn")
//    public void login(){
//        EspnHomePage home = getEspnHomePage();
//        home.triggerUser();
//        home.logIn();
//        home.switchToLogInIframe();
//        home.fillEmailLogIn("alejandro.madrid1@globant.com");
//        home.fillPasswordLogIn("GLo_ESPN_1*#");
//        home.clickLogIn();
//        home.triggerUser();
//        home.clickLogOut();
//        Assert.assertEquals(home.getUserName(), "WelcomeAlejandro!");
//    }

//    @Test(groups="logOut")
//    public void testEspnLogOut(){
//        EspnHomePage home = getEspnHomePage();
//        home.triggerUser();
//        home.logIn();
//        home.switchToLogInIframe();
//        home.fillEmailLogIn("alejandro.madrid1@globant.com");
//        home.fillPasswordLogIn("GLo_ESPN_1*#");
//        home.clickLogIn();
//        home.triggerUser();
//        home.clickLogOut();
//        Assert.assertEquals(home.getUserNameLogOut(), "Customize ESPN");
//    }

    @Test(groups="logOut", dataProvider = "createData", dataProviderClass = Data.class)
    public void logOut(String fName, String flastNAme, String fEmail, String fPassword ){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.signUp();
        home.fillFirstName(fName);
        home.fillLastName(flastNAme);
        home.fillEmail(fEmail);
        home.fillPassword(fPassword);
        home.fullfillSingUpSubmit();
        home.triggerUser();
        home.clickLogOut();
        home.refreshLogin();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn(fEmail);
        home.fillPasswordLogIn(fPassword);
        home.clickLogIn();
        home.triggerUser();
        home.clickLogOut();
        Assert.assertEquals(home.getUserNameLogOut(), "Customize ESPN");;
    }

//    @Test(groups="CancelAccount", , dataProvider = "createData", dataProviderClass = Data.class)
//    public void cancelAccount(String fName, String flastNAme, String fEmail, String fPassword){
//        EspnHomePage home = getEspnHomePage();
//        home.triggerUser();
//        home.logIn();
//        home.switchToLogInIframe();
//        home.fillEmailLogIn("alejandro.madrid7@globant.com");
//        home.fillPasswordLogIn("GLo_ESPN_1*#");
//        home.clickLogIn();
//        home.triggerUser();
//        home.clickEspnProfile();
//        home.switchToLogInIframe();
//        home.clickCancelAccount();
//        home.clickConfirmAccountDelete();
//        home.triggerUser();
//        home.logIn();
//        home.switchToLogInIframe();
//        home.fillEmailLogIn("alejandro.madrid7@globant.com");
//        home.fillPasswordLogIn("GLo_ESPN_1*#");
//        home.clickLogIn();
//        Assert.assertEquals(home.getAccountDeactivate(), "Account Deactivated");
//    }

        @Test(groups="cancelAccount", dataProvider = "createData", dataProviderClass = Data.class)
        public void cancelAccount(String fName, String flastNAme, String fEmail, String fPassword){
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.signUp();
        home.fillFirstName(fName);
        home.fillLastName(flastNAme);
        home.fillEmail(fEmail);
        home.fillPassword(fPassword);
        home.fullfillSingUpSubmit();
        home.triggerUser();
        home.clickLogOut();
        home.refreshLogin();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn(fEmail);
        home.fillPasswordLogIn(fPassword);
        home.clickLogIn();
        home.triggerUser();
        home.clickEspnProfile();
        home.switchToLogInIframe();
        home.clickCancelAccount();
        home.clickConfirmAccountDelete();
        home.triggerUser();
        home.logIn();
        home.switchToLogInIframe();
        home.fillEmailLogIn(fEmail);
        home.fillPasswordLogIn(fPassword);
        home.clickLogIn();
        Assert.assertEquals(home.getAccountDeactivate(), "Account Deactivated");
    }

}
