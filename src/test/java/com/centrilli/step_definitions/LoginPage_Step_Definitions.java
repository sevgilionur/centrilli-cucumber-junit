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
        loginPage.enterCredentials(email, password);
    }

    @Then("User lands on homepage as posmanager")
    public void userLandsOnHomepageAsPosmanager() {
        Assert.assertTrue(loginPage.getUsername().getText().contains("POSManager"));
    }

    @Then("User lands on homepage as salesmanager")
    public void userLandsOnHomepageAsSalesmanager() {
        Assert.assertTrue(loginPage.getUsername().getText().contains("SalesManager"));
    }

    @Then("User lands on homepage as inventorymanager")
    public void userLandsOnHomepageAsInventorymanager() {
        Assert.assertTrue(loginPage.getUsername().getText().contains("InventoryManager"));
    }

    @Then("User lands on homepage as expensesmanager")
    public void userLandsOnHomepageAsExpensesmanager() {
        Assert.assertTrue(loginPage.getUsername().getText().contains("ExpensesManager"));
    }

    @Then("User lands on homepage as manufacturing user")
    public void userLandsOnHomepageAsManufacturingUser() {
        Assert.assertTrue(loginPage.getUsername().getText().contains("ManufacturingUser"));
    }

    @And("User enters valid {string} and {string}")
    public void userEntersValidAnd(String email, String password) {
        loginPage.enterCredentials(email,password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.getLoginButton().click();
    }


    @And("User enters invalid {string} , valid {string} and clicks enter")
    public void userEntersInvalidValidAndClicksEnter(String email, String password) {
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password + Keys.ENTER);
    }

    @Then("User gets Wrong login or password message")
    public void userGetsWrongLoginOrPasswordMessage() {
        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
    }

    @And("User enters valid {string} , invalid {string} and clicks enter")
    public void userEntersValidInvalidAndClicksEnter(String email, String password) {
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password + Keys.ENTER);
    }

    @And("User enters invalid {string} , valid {string} and clicks login button")
    public void userEntersInvalidValidAndClicksLoginButton(String email, String password) {
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLoginButton().click();
    }

    @And("User enters valid {string} , invalid {string} and clicks login button")
    public void userEntersValidInvalidAndClicksLoginButton(String email, String password) {
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLoginButton().click();
    }

    @And("User enters valid email {string}")
    public void userEntersValid(String email) {
        loginPage.getEmail().sendKeys(email);

    }

    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.getLoginButton().click();
    }

    @Then("User gets Please fill out this field message from password field")
    public void userGetsPleaseFillOutThisFieldMessage() {
        String message = loginPage.getPassword().getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.", message);
    }

    @And("User enters valid password {string}")
    public void userEntersValidPassword(String password) {
        loginPage.getPassword().sendKeys(password);
    }

    @Then("User gets Please fill out this field message from email field")
    public void userGetsPleaseFillOutThisFieldMessageFromEmailField() {
        String message = loginPage.getEmail().getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.", message);
    }


}
