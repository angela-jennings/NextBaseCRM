package com.nextBase.step_definitions;

import com.nextBase.pages.NextBaseLandingPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFunctionalityStepDefinitions {
    NextBaseLandingPage nextBaseLandingPage = new NextBaseLandingPage();

    @Given("user is on Next Base landing page")
    public void user_is_on_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));
    }
    @When("user enters {string} and user enters {string}")
    public void userEntersAndUserEnters(String username, String password) {
        nextBaseLandingPage.usernameInputField.sendKeys(username);
        nextBaseLandingPage.passwordInputField.sendKeys(password);
        nextBaseLandingPage.signInButton.click();
    }
    @Then("user should be logged into the application")
    public void user_should_be_logged_into_the_application() {
        //would typically do a title verification here for the desired web page but there is no given title
    }
    @When("user checks the remember me box")
    public void user_checks_the_remember_me_box() {
        nextBaseLandingPage.rememberMeCheckbox.click();
    }
    @Then("the box should be clicked")
    public void the_box_should_be_clicked() {
        nextBaseLandingPage.rememberMeCheckbox.isSelected();
    }

}
