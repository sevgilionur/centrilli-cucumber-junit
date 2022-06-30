package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Centrilli_LoginPage_Step_Definitions {

    LoginPage loginPage = new LoginPage();

    @When("User goes to application page")
    public void user_goes_to_application_page() {

        Driver.setDriver().get(PropertyReader.getProperty("url"));

    }
   
    @When("User clicks enter button")
    public void user_clicks_enter_button() {
        loginPage.password.sendKeys();

    }
    @Then("User lands on homepage")
    public void user_lands_on_homepage() {

    }

    @And("User enters valid {string} and {string}")
    public void userEntersValidAnd(String arg0, String arg1) {
    }
}
