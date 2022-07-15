package com.centrilli.step_definitions;

import com.centrilli.pages.HomePage_Omernecip;
import com.centrilli.pages.LoginPage_OmerNecip;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class LogoutStepDefinitions_OmerNecip {

    LoginPage_OmerNecip loginPage_omerNecip=new LoginPage_OmerNecip();
    HomePage_Omernecip homePage_omernecip=new HomePage_Omernecip();


    @Given("User clicks on user dropdown menu_necip")
    public void user_clicks_on_user_dropdown_menu_necip() {
        homePage_omernecip.usernameButton.click();
    }
    @When("user clicks on logout button_necip")
    public void user_clicks_on_logout_button_necip() {
    homePage_omernecip.logoutButton.click();
    }
    @Then("user should see the Login Page_necip")
    public void user_should_see_the_login_page_necip() {
        Assert.assertTrue(loginPage_omerNecip.cilickButton.isDisplayed());
    }

}
