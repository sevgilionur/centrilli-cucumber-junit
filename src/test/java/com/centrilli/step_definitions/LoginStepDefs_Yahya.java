package com.centrilli.step_definitions;

import com.centrilli.pages.DashPage_Yahya;
import com.centrilli.pages.LoginPage_Yahya;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefs_Yahya {

    LoginPage_Yahya loginPage_yahya=new LoginPage_Yahya();
    DashPage_Yahya dashPage_yahya=new DashPage_Yahya();

    @When("User goes to the application login page")
    public void user_goes_to_the_application_login_page() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }
    @When("User enters valid email {string} and valid password {string} and press enter key")
    public void user_enters_valid_email_and_valid_password_and_press_enter_key(String email, String password) {
        loginPage_yahya.emailBox.sendKeys(email);
        loginPage_yahya.passwordBox.sendKeys(password+ Keys.ENTER);
    }
    @When("User enters valid email {string} and valid password {string}")
    public void user_enters_valid_email_and_valid_password(String email, String password) {
        loginPage_yahya.emailBox.sendKeys(email);
        loginPage_yahya.passwordBox.sendKeys(password+ Keys.ENTER);
    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        loginPage_yahya.loginButton.click();
    }
    @Then("User on homepage as posmanager")
    public void user_on_homepage_as_posmanager() {
        Assert.assertTrue(dashPage_yahya.usernameVerify.getText().toLowerCase().contains("posmanager"));
    }
    @Then("User on homepage as salesmanager")
    public void user_on_homepage_as_salesmanager() {
        Assert.assertTrue(dashPage_yahya.usernameVerify.getText().toLowerCase().contains("salesmanager"));
    }
    @Then("User on homepage as expense manager")
    public void user_on_homepage_as_expense_manager() {
        Assert.assertTrue(dashPage_yahya.usernameVerify.getText().toLowerCase().contains("expensemanager"));
    }
    @Then("User on homepage as inventory manager")
    public void user_on_homepage_as_inventory_manager() {
        Assert.assertTrue(dashPage_yahya.usernameVerify.getText().toLowerCase().contains("inventorymanager"));
    }
    @Then("User on homepage as manufacturing user")
    public void user_On_Home_page_As_Manufacturing_User() {
        Assert.assertTrue(dashPage_yahya.usernameVerify.getText().toLowerCase().contains("manufacturinguser"));
    }
}







