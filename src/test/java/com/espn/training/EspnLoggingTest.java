package com.espn.training;


import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class EspnLoggingTest {

    public Logger log = Logger.getLogger(EspnLoggingTest.class);

    @BeforeSuite
    public void espnAccountVerification(){
        System.out.println("Does the user has an account? ");
    }

    @BeforeClass
    public void testEnterWebPage(){
        System.out.println("open https://www.espn.com/?src=com&adblock=true");
    }

    @AfterClass
    public void testCloseWebPage(){
        System.out.println("close https://www.espn.com/?src=com&adblock=true");
    }

    @Test(groups = {"group4"}, dataProvider = "User", dataProviderClass = Data.class)
    public void testUserExist(String data){
        log.info(data);
        System.out.println("The user is on our data base: " + data);
    }

    @Test (groups={"group1"})
    @Parameters({"User", "Password"})
    public void testLogginWebPage(String User, String Password ) {
        String result = User + Password;
        Assert.assertEquals(result, "Alejo 1234");
    }

    @Test (groups={"group1, group2"})
    public void testLogout(){
        System.out.println("Log out successful");
    }

    @Test (groups={"group3"}, dataProvider = "User", dataProviderClass = Data.class)
    public void testUserDeactivate(String User){
        Assert.assertEquals(User.length(), 0);
        System.out.println("User has been deactivate");
    }

}
