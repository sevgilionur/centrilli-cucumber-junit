package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Furkan;
import com.centrilli.pages.LogoutPage_Furkan;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions_Furkan {

    LoginPage_Furkan loginPage=new LoginPage_Furkan();
    LogoutPage_Furkan logoutpage=new LogoutPage_Furkan();

    @When("User goes to login page FY")
    public void user_goes_to_login_page_fy() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));

    }

    @When("User enters valid {string} and {string} FY")
    public void user_enters_valid_and_fy(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }

    @When("User clicks login button FY")
    public void user_clicks_login_button_fy() {
        loginPage.loginButton.click();
    }

    @Then("User should see the homepage as posmanager FY")
    public void user_should_see_the_homepage_as_posmanager_fy() {
        Assert.assertTrue(loginPage.homePage.isDisplayed());
    }


    @And("User enters invalid  {string} and valid {string} FY")
    public void userEntersInvalidAndValidFY(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("Verify that error message FY")
    public void verifyThatErrorMessageFY() {
        Assert.assertTrue(loginPage.alertMessage.isDisplayed());
    }

    @And("User enters valid  {string} and invalid {string} FY")
    public void userEntersValidAndInvalidFY(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @When("User  enters valid {string} FY")
    public void userEntersValidFY(String username) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.loginButton.click();
    }

    @Then("User verifies that application's error message FY")
    public void userVerifiesThatApplicationSErrorMessageFY() {
        String expected ="Lütfen bu alanı doldurun.";
        String message=loginPage.passwordInput.getAttribute("validationMessage");
        Assert.assertEquals(expected,message);
    }

    @When("User  enters valid {string} without username FY")
    public void userEntersValidWithoutUsernameFY(String password) {
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("User verifies that application's error message for password FY")
    public void userVerifiesThatApplicationSErrorMessageForPasswordFY() {
        String expected ="Lütfen bu alanı doldurun.";
        String message=loginPage.usernameInput.getAttribute("validationMessage");
        Assert.assertEquals(expected,message);

    }
}
