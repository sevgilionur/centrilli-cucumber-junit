package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_MKemal;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs_Mkemal {
    LoginPage_MKemal loginPage = new LoginPage_MKemal();
    @Given("I am on the login page_mks")
    public void iAmOnTheLoginPage_mks() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }

    @Then("I enter username and password_mks")
    public void iEnterUsernameAndPassword_mks() {
        loginPage.enterCridentials(" ", " ");

    }

    @When("I click enter I should be navigate to Dashboard_mks")
    public void iClickEnterIShouldBeNavigateToDashboard_mks() {
    }

}
