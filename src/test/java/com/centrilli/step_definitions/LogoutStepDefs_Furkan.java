package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Furkan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs_Furkan {
    LoginPage_Furkan loginPageFurkan=new LoginPage_Furkan();
    Logout_Furkan logout_furkan=new Logout_Furkan();


    @Given("User lands on the homepage fy")
    public void user_lands_on_the_homepage_fy() {
       loginPageFurkan.setLogin();

    }

    @When("User clicks on user dropdown menu fy")
    public void user_clicks_on_user_dropdown_menu_fy() {
       logout_furkan.userDropdownButton.click();
    }

    @Then("User clicks on logout button fy")
    public void user_clicks_on_logout_button_fy() {
        logout_furkan.logoutButton.click();
    }

    @Then("User logged out securely fy")
    public void user_logged_out_securely_fy() {
        Assert.assertTrue(loginPageFurkan.loginButton.isDisplayed());
    }



}
