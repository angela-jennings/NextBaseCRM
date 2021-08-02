package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseLandingPage {
    public NextBaseLandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInputField;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@id='USER_REMEMBER']")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//label[@class='login-item-checkbox-label']")
    public WebElement rememberMeText;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[@class='log-popup-header']")
    public WebElement authorizationText;
}
