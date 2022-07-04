package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


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

    @Then("User lands on homepage as expensesmanager")
    public void userLandsOnHomepageAsExpensesmanager() {
        Assert.assertTrue(loginPage.username.getText().contains("ExpensesManager"));
    }

    @Then("User lands on homepage as manufacturing user")
    public void userLandsOnHomepageAsManufacturingUser() {
        Assert.assertTrue(loginPage.username.getText().contains("ManufacturingUser"));
    }

    @And("User enters valid {string} and {string}")
    public void userEntersValidAnd(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginButton.click();
    }


    @And("User enters invalid {string} , valid {string} and clicks enter")
    public void userEntersInvalidValidAndClicksEnter(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password + Keys.ENTER);
    }

    @Then("User gets Wrong login or password message")
    public void userGetsWrongLoginOrPasswordMessage() {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }

    @And("User enters valid {string} , invalid {string} and clicks enter")
    public void userEntersValidInvalidAndClicksEnter(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password + Keys.ENTER);
    }

    @And("User enters invalid {string} , valid {string} and clicks login button")
    public void userEntersInvalidValidAndClicksLoginButton(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);
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
        String message = loginPage.password.getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.", message);
    }

    @And("User enters valid password {string}")
    public void userEntersValidPassword(String password) {
        loginPage.password.sendKeys(password);
    }

    @Then("User gets Please fill out this field message from email field")
    public void userGetsPleaseFillOutThisFieldMessageFromEmailField() {
        String message = loginPage.email.getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.", message);
    }
}
