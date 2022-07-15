package com.centrilli.step_definitions;

import com.centrilli.pages.DiscussPage_Onur;
import com.centrilli.pages.LoginPage_Onur;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Logout_Step_Definitions_Onur {
    LoginPage_Onur loginPage_onur = new LoginPage_Onur();
    DiscussPage_Onur discussPage_onur= new DiscussPage_Onur();

    @Given("User goes to application page enter valid {string} and {string} clicks enter")
    public void userGoesToApplicationPageEnterValidAndClicksEnte(String email, String password) {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        loginPage_onur.email.sendKeys(email);
        loginPage_onur.password.sendKeys(password + Keys.ENTER);
    }


    @When("User clicks profile dropdown menu")
    public void user_clicks_profile_dropdown_menu() throws InterruptedException {
        Thread.sleep(2000);
        discussPage_onur.dropdownButton.click();
    }
    @Then("User clicks logout button")
    public void user_clicks_logout_button() {
        discussPage_onur.LogoutButton.click();
    }

    @And("User clicks navigate back button")
    public void userClicksNavigateBackButton() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);
    }

    @Then("User logs out successfully")
    public void user_logs_out_successfully() {
        Assert.assertTrue(discussPage_onur.expiredMessage.isDisplayed());
    }



}
