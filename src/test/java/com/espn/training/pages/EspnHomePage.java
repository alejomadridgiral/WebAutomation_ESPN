package com.espn.training.pages;

import com.espn.training.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class EspnHomePage extends BasePage {

    public EspnHomePage(WebDriver driver){
        super(driver);
        driver.get("https://www.espnqa.com/?src=com&_adblock=true&espn=cloud");
    }

    @FindBy(id="global-user-trigger")
    private WebElement userTrigger;

    @FindBy(css = "li[class='user hover'] div[class='global-user'] div[class='global-user-container'] ul[class='account-management'] li a[data-affiliatename='espn']")
    private WebElement logIn;

    @FindBy(css=".btn.btn-secondary.ng-isolate-scope")
    private WebElement signUp;

    @FindBy(css="#did-ui-view > div > section > section > form > section.section.section-your-account-fields > div:nth-child(1) > div.field.field-first-name.ng-scope.ng-isolate-scope.badgeable.field-required.field-error > label > span.input-wrapper.ng-scope > input")
    private WebElement firstName;

    public void triggerUser(){
        userTrigger.click();
    }

    public void logIn(){
        logIn.click();
    }

    public void signUp(){
        getDriver().switchTo().frame("disneyid-iframe");
        signUp.click();
    }
}
