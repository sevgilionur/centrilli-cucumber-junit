package com.centrilli.step_definitions;

import com.centrilli.pages.HomePage_Murat;
import com.centrilli.pages.LoginPage_Murat;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Properties;

public class Logout_StepDef_Murat {

    LoginPage_Murat loginPage = new LoginPage_Murat();
    HomePage_Murat homePage=new HomePage_Murat();


    @Given("User goes to application page_me")
    public void user_goes_to_application_page_me() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));

    }
    @When("User enter valid {string} and {string} clicks enter_me")
    public void user_enter_valid_and_clicks_enter_me(String string, String string2) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.username.sendKeys(string);
        loginPage.password.sendKeys(string2);
        loginPage.loginButton.click();

    }
    @When("User clicks to profile dropdown menu where top of right corner_me")
    public void user_clicks_to_profile_dropdown_menu_where_top_of_right_corner_me() throws InterruptedException {
        Thread.sleep(2000);
        homePage.profileDropdownButton.click();

    }
    @When("User clicks logout button_me")
    public void user_clicks_logout_button_me() throws InterruptedException {
        Thread.sleep(2000);
        homePage.logoutButton.click();

    }
    @Then("User logs out successfully_me")
    public void user_logs_out_successfully_me() {
        String actualResult="https://qa.centrilli.com/web/login";
        String expectedResult=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);


    }
}




