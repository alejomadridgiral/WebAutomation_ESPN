package com.espn.training.test;

import com.espn.training.driver.Driver;
import com.espn.training.pages.EspnHomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



public class BaseTest {

    Driver myDriver;

    private EspnHomePage espnHome;

    public BaseTest() {
    }

    @BeforeSuite(alwaysRun=true)
    @Parameters({"browser"})
    public void beforeSuite(String browser) {
        myDriver = new Driver(browser);
        espnHome = new EspnHomePage(myDriver.getDriver());
    }

    @AfterSuite(alwaysRun=true)
    public void afterSuite() {
        espnHome.dispose();
    }

    public EspnHomePage EspnHomePage() {
        return espnHome;
    }
}
