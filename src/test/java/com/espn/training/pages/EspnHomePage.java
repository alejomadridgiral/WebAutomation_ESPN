package com.espn.training.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(css = "li.user a[data-regformid='espn']")
    private WebElement logIn;

    public void logIn(){
        getWait().until(ExpectedConditions.elementToBeClickable(logIn));
        logIn.click();
    }

    @FindBy(css=".btn.btn-secondary.ng-isolate-scope")
    private WebElement signUp;


    public void switchToLogInIframe(){
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

    @FindBy(css="button[type='submit']")
    private WebElement singUpSubmit;

    public void fullfillSingUpSubmit(){
        singUpSubmit.click();
    }

    @FindBy(css = "input[placeholder='Username or Email Address']")
    private WebElement emailAddressLogIn;

    public void fillEmailLogIn(String fEmailLogin){
        getWait().until(ExpectedConditions.elementToBeClickable(emailAddressLogIn));
        emailAddressLogIn.click();
        emailAddressLogIn.sendKeys(fEmailLogin);
    }

    @FindBy(css = "input[placeholder='Password (case sensitive)']")
    private WebElement passwordLogIn;

    public void fillPasswordLogIn(String fPasswordLogin){
        passwordLogIn.click();
        passwordLogIn.sendKeys(fPasswordLogin);
    }

    @FindBy(css = "button[aria-label='Log In']")
    private WebElement logInButton;

    public void clickLogIn(){
        logInButton.click();
    }

    @FindBy(className = "display-user")
    private WebElement userName;

    public String getUserName(){
        return userName.getText();
    }

    @FindBy(css = "li[class='user hover'] div[class='global-user'] div[class='global-user-container'] ul[class='account-management'] li a[class='small']")
    private WebElement logOut;

    public void clickLogOut(){
        getWait().until(ExpectedConditions.elementToBeClickable(logOut));
        logOut.click();
    }

    public void refreshLogin(){
        Actions builder = new Actions(getDriver());
        getWait().until(ExpectedConditions.visibilityOf(userTrigger));
        builder.moveToElement(userTrigger).click(userTrigger);
        builder.perform();
        userTrigger.click();
    }

    @FindBy(xpath = "//*[@id='sideLogin-left-rail']/h1")
        private WebElement userNameLogOut;

    public String getUserNameLogOut(){
        getWait().until(ExpectedConditions.visibilityOf(userNameLogOut));
        return userNameLogOut.getText();
    }

    @FindBy(css = "div[class='container'] li:nth-child(5) a:nth-child(1)")
    private WebElement espnProfile;

    public void clickEspnProfile(){
        espnProfile.click();
    }

    @FindBy(css = "#cancel-account")
    private WebElement cancelAccount;

    public void clickCancelAccount() {
        try {
            cancelAccount.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            cancelAccount.click();
        }
    }

    @FindBy(css= "button[did-translate='deactivate.confirmation.buttons.confirm']")
    private WebElement confirmAccountDelete;

    public void clickConfirmAccountDelete(){
        getWait().until(ExpectedConditions.visibilityOf(confirmAccountDelete));
        confirmAccountDelete.click();
    }

    @FindBy(css= ".title.title-primary.ng-isolate-scope")
    private WebElement accountDeactivate;

    public String getAccountDeactivate(){
        getWait().until(ExpectedConditions.visibilityOf(accountDeactivate));
        return accountDeactivate.getText();
    }

}
