package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Burak;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;

public class LoginStepDefinition_Burak {

    LoginPage_Burak loginPage = new LoginPage_Burak();

    @When("User goes to application login page_bs")
    public void user_goes_to_application_login_page() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        //Driver.getDriver().get("https://app.centrilli.com/");
    }
    @When("User enters valid username_bs {string}")
    public void user_enters_valid_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @When("User enters valid password_bs {string}")
    public void user_enters_valid_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @When("User clicks the login button_bs")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User reach the salesmanager home page_bs")
    public void user_reach_the_sales_manager_home_page() {
        Assert.assertTrue(loginPage.userType.getText().contains("SalesManager"));
    }

}
