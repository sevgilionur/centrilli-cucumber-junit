package com.centrilli.step_definitions;

import com.centrilli.pages.DashPage_Yahya;
import com.centrilli.pages.LoginPage_Yahya_neww;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut_Yahya_StepDefs {
    LoginPage_Yahya_neww loginPage_yahya_neww=new LoginPage_Yahya_neww();
    DashPage_Yahya dashPage_yahya=new DashPage_Yahya();



    @Given("User on the homepage")
    public void user_on_the_homepage() {
    loginPage_yahya_neww.login();
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(dashPage_yahya.congratulationsMessage));
    }

    @When("User clicks on user dropdown menu")
    public void user_clicks_on_user_dropdown_menu() {
        dashPage_yahya.userDropdownButton.click();
    }

    @Then("User clicks on logout button")
    public void user_clicks_on_logout_button() {
        dashPage_yahya.logoutButton.click();
    }

    @Then("User logged out securely")
    public void user_logged_out_securely() {
        Assert.assertTrue(loginPage_yahya_neww.loginButton.isDisplayed());

    }



}
