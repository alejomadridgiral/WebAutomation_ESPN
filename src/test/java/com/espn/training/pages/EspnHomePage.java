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

    public void triggerUser(){
        getWait().until(ExpectedConditions.elementToBeClickable(userTrigger));
        userTrigger.click();
    }

    @FindBy(css = "li[class='user hover'] div[class='global-user'] div[class='global-user-container'] ul[class='account-management'] li a[data-affiliatename='espn']")
    private WebElement logIn;

    public void logIn(){
        logIn.click();
    }

    @FindBy(css=".btn.btn-secondary.ng-isolate-scope")
    private WebElement signUp;


    public void switchToSignUp(){
        getDriver().switchTo().frame("disneyid-iframe");
    }

    public void signUp(){
        signUp.click();
    }

    @FindBy(css="input[placeholder='First Name']")
    private WebElement firstName;

    public void fillFirstName(String fName){
        getWait().until(ExpectedConditions.elementToBeClickable(firstName));
        firstName.click();
        firstName.sendKeys(fName);
    }

    @FindBy(css="input[placeholder='Last Name']")
    private WebElement lastName;

    public void fillLastName(String flastName){
        lastName.click();
        lastName.sendKeys(flastName);
    }

    @FindBy(css="input[placeholder='Email Address']")
    private WebElement emailAddress;

    public void fillEmail(String fEmail){
        emailAddress.click();
        emailAddress.sendKeys(fEmail);
    }

    @FindBy(css="input[placeholder='Password (case sensitive)']")
    private WebElement password;

    public void fillPassword(String fPassword){
        password.click();
        password.sendKeys(fPassword);
    }

    @FindBy(css="button[type='submit']\n")
    private WebElement singUpSubmit;

    public void fullfillSingUpSubmit(){
        singUpSubmit.click();
    }

    @FindBy(className = "display-user")
    private WebElement userName;

    public String getUserName(){

        return userName.getText();
    }

}
