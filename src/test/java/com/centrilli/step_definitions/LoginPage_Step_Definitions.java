package com.centrilli.step_definitions;

import com.centrilli.pages.DiscussPage_Onur;
import com.centrilli.pages.LoginPage_Onur;
import com.centrilli.utilities.BrowserUtilities;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class LoginPage_Step_Definitions {

    LoginPage_Onur loginPage = new LoginPage_Onur();
    DiscussPage_Onur discussPage_onur = new DiscussPage_Onur();

    @When("User goes to application page")
    public void user_goes_to_application_page() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }

    @And("User enters valid {string} and {string} and clicks enter")
    public void userEntersValidAndAndClicksEnter(String email, String password) {
        loginPage.enterCredentials(email, password + Keys.ENTER);
    }

    @Then("User lands on homepage as posmanager")
    public void userLandsOnHomepageAsPosmanager() {
        //Assert.assertTrue(loginPage.getUsername().getText().contains("POSManager"));
        BrowserUtilities.homePageVerification(discussPage_onur.username, "POSManager");

    }

    @And("User enters valid {string} and {string}")
    public void userEntersValidAnd(String email, String password) {
        loginPage.enterCredentials(email,password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginButton.click();

    }

    @And("User enters invalid {string} , valid {string} and clicks enter")
    public void userEntersInvalidValidAndClicksEnter(String email, String password) {
        loginPage.enterCredentials(email, password + Keys.ENTER);
    }

    @Then("User gets Wrong login or password message")
    public void userGetsWrongLoginOrPasswordMessage() {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }

    @And("User enters valid {string} , invalid {string} and clicks enter")
    public void userEntersValidInvalidAndClicksEnter(String email, String password) {
        loginPage.enterCredentials(email, password + Keys.ENTER);
    }

    @And("User enters invalid {string} , valid {string} and clicks login button")
    public void userEntersInvalidValidAndClicksLoginButton(String email, String password) {
        loginPage.enterCredentials(email, password);
        loginPage.loginButton.click();
    }

    @And("User enters valid {string} , invalid {string} and clicks login button")
    public void userEntersValidInvalidAndClicksLoginButton(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
    }

    @And("User enters valid email {string}")
    public void userEntersValid(String email) {
        loginPage.email.sendKeys(email);

    }

    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("User gets Please fill out this field message from password field")
    public void userGetsPleaseFillOutThisFieldMessage() {
        //String message = loginPage.getPassword().getAttribute("validationMessage");
        //Assert.assertEquals("Please fill out this field.", message);
        BrowserUtilities.fillOutMessage(loginPage.password, "Please fill out this field.");
        System.out.println(loginPage.password.getAttribute("required"));
    }

    @And("User enters valid password {string}")
    public void userEntersValidPassword(String password) {
        loginPage.password.sendKeys(password);
    }

    @Then("User gets Please fill out this field message from email field")
    public void userGetsPleaseFillOutThisFieldMessageFromEmailField() {
        //String message = loginPage.getEmail().getAttribute("validationMessage");
        //Assert.assertEquals("Please fill out this field.", message);
        BrowserUtilities.fillOutMessage(loginPage.email, "Please fill out this field.");
    }

    @Given("User goes to application page enter valid {string} and {string} clicks enter")
    public void userGoesToApplicationPageEnterValidAndClicksEnter(String email, String password) {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password + Keys.ENTER);
    }


}
