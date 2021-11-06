package com.espn.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EspnHomePage extends BasePage {

    public EspnHomePage(WebDriver driver){
        super(driver);
        driver.get("https://www.espnqa.com/?src=com&_adblock=true&espn=cloud");
    }

    @FindBy(id="global-user-trigger")
    private WebElement userTrigger;

    @FindBy(xpath="//*[@id=global-viewport']/div[3]/div/ul[1]/li[7]/a")
    private WebElement logIn;

    @FindBy(className="btn btn-secondary ng-isolate-scope")
    private WebElement signUp;

    @FindBy(css="#did-ui-view > div > section > section > form > section.section.section-your-account-fields > div:nth-child(1) > div.field.field-first-name.ng-scope.ng-isolate-scope.badgeable.field-required.field-error > label > span.input-wrapper.ng-scope > input")
    private WebElement firstName;

    public void triggerUser(){
        userTrigger.click();
    }
}
