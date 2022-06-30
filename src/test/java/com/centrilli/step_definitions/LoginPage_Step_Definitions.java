package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class LoginPage_Step_Definitions {

    LoginPage loginPage = new LoginPage();

    @When("User goes to application page")
    public void user_goes_to_application_page() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }

    @And("User enters valid {string} and {string} and clicks enter")
    public void userEntersValidAndAndClicksEnter(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password+ Keys.ENTER);
    }

    @Then("User lands on homepage as posmanager")
    public void userLandsOnHomepageAsPosmanager() {
        Assert.assertTrue(loginPage.username.getText().contains("POSManager"));
    }

    @Then("User lands on homepage as salesmanager")
    public void userLandsOnHomepageAsSalesmanager() {
        Assert.assertTrue(loginPage.username.getText().contains("SalesManager"));
    }

    @Then("User lands on homepage as inventorymanager")
    public void userLandsOnHomepageAsInventorymanager() {
        Assert.assertTrue(loginPage.username.getText().contains("InventoryManager"));
    }
}
