package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_OmerNecip;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.configuration.Configuration;
import org.junit.Assert;

public class LoginStepDefinitions_OmerNecip {

    LoginPage_OmerNecip loginPageOmerNecip=new LoginPage_OmerNecip();

    @Given("User goes to Centrilli page")
    public void user_goes_to_centrilli_page() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));

    }
    @When("user  enters valid {string}_necip")
    public void user_enters_valid__necip(String string) {
        loginPageOmerNecip.usernameinput.sendKeys(string);
    }
    @When("user enters {string}_necip")
    public void user_enters__necip(String string) {

        loginPageOmerNecip.passwordinput.sendKeys(string);

    }
    @Then("user clicks the login button_necip")
    public void user_clicks_the_login_button_necip() {
        loginPageOmerNecip.cilickButton.click();

    }
    @Then("user should see the homepage as expensesmanager_necip")
    public void user_should_see_the_homepage_as_expensesmanager_necip() {

        Assert.assertTrue(loginPageOmerNecip.homepage.isDisplayed());

    }

    @When("User enters invalid  {string} and valid {string} and clicks_necip")
    public void user_enters_invalid_and_valid_and_clicks_necip(String username, String password) {

       loginPageOmerNecip.usernameinput.sendKeys(username);
        loginPageOmerNecip.passwordinput.sendKeys(password);
        loginPageOmerNecip.cilickButton.click();


    }
    @Then("Verify that error message_necip")
    public void verify_that_error_message_necip() {
        Assert.assertTrue(loginPageOmerNecip.errorMessage.isDisplayed());
    }

    @When("User goes to Centrilli page_necip")
    public void user_goes_to_centrilli_page_necip() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }
    @When("User enters valid  {string} and invalid {string} and clicks_necip")
    public void user_enters_valid_and_invalid_and_clicks_necip(String string, String string2) {

        loginPageOmerNecip.usernameinput.sendKeys(string);
        loginPageOmerNecip.passwordinput.sendKeys(string2);
        loginPageOmerNecip.cilickButton.click();


    }

    @Then("User verifies that I got message if I leave empty password_necip")
    public void user_verifies_that_i_got_message_if_i_leave_empty_password_necip() {
        String expected ="Please fill in this field.";
        String message = loginPageOmerNecip.passwordinput.getAttribute("validationMessage");
        Assert.assertEquals(expected, message);
    }


    @Then("User verifies that I got message if I leave empty username_necip")
    public void user_verifies_that_i_got_message_if_i_leave_empty_username_necip() {
        String expected ="Please fill in this field.";
        String message = loginPageOmerNecip.usernameinput.getAttribute("validationMessage");
        Assert.assertEquals(expected, message);
    }
}
