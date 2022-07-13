package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPageob;
import com.centrilli.pages.NavigationBar_Gungor;
import com.centrilli.utilities.BrowserUtilities;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class LoginStepDefob {
    LoginPageob loginPageob = new LoginPageob();
    NavigationBar_Gungor navibar = new NavigationBar_Gungor();

    @When("User goes to application page ob")
    public void user_goes_to_application_page_ob() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));

    }

    @When("User enters valid {string} and {string} and clicks enter ob")
    public void user_enters_valid_and_and_clicks_enter_ob(String email, String password) {
        loginPageob.enterCredentials(email, password + Keys.ENTER);

    }

    @Then("User lands on homepage as posmanager ob")
    public void user_lands_on_homepage_as_posmanager_ob() {
        BrowserUtilities.homePageVerification(navibar.getUsername(), "POSManager");


    }
}

