package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Yahya_neww;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class yahya_login_StepDefs_neww {
    LoginPage_Yahya_neww loginPage_yahya_neww=new LoginPage_Yahya_neww();

    @When("User goes to the application login page")
    public void user_goes_to_the_application_login_page() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }
    @When("User enters valid email {string} and valid password {string} and press enter key")
    public void user_enters_valid_email_and_valid_password_and_press_enter_key(String mail, String password) {
        loginPage_yahya_neww.emailBox.sendKeys(mail);
        loginPage_yahya_neww.passwordBox.sendKeys(password);
        loginPage_yahya_neww.loginButton.click();

    }
    @Then("User on homepage as posmanager")
    public void user_on_homepage_as_posmanager() {
        Assert.assertTrue(loginPage_yahya_neww.usernameVerify.getText().toLowerCase().contains("posmanager"));
    }
    @When("User enters valid email {string} and valid password {string}")
    public void user_enters_valid_email_and_valid_password(String email, String password) {
        loginPage_yahya_neww.emailBox.sendKeys(email);
        loginPage_yahya_neww.passwordBox.sendKeys(password);
    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        loginPage_yahya_neww.loginButton.click();

    }
    @Then("User on homepage as salesmanager")
    public void user_on_homepage_as_salesmanager() {
        Assert.assertTrue(loginPage_yahya_neww.usernameVerify.getText().toLowerCase().contains("salesmanager"));
    }
    @Then("User on homepage as expense manager")
    public void user_on_homepage_as_expense_manager() {
        Assert.assertTrue(loginPage_yahya_neww.usernameVerify.getText().toLowerCase().contains("expensemanager"));

    }@Then("User on homepage as inventory manager")
    public void user_on_homepage_as_inventory_manager() {
        Assert.assertTrue(loginPage_yahya_neww.usernameVerify.getText().toLowerCase().contains("inventorymanager"));

    }@Then("User on homepage as manufacturing user")
    public void user_on_homepage_as_manufacturing_user() {
        Assert.assertTrue(loginPage_yahya_neww.usernameVerify.getText().toLowerCase().contains("manufacturinguser"));

    }

}
