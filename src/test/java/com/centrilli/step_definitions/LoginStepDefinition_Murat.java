package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Burak;
import com.centrilli.pages.LoginPage_Murat;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition_Murat {
    LoginPage_Murat loginPage = new LoginPage_Murat();

    @When("User goes to application login page_me")
    public void user_goes_to_application_login_page_me() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        //Driver.getDriver().get("https://app.centrilli.com/");

    }
    @When("User enters valid username_me {string}")
    public void user_enters_valid_username_me(String string) {
        loginPage.username.sendKeys(string);

    }
    @When("User enters valid password_me {string}")
    public void user_enters_valid_password_me(String string) {
        loginPage.password.sendKeys(string);

    }
    @When("User clicks the login button_me")
    public void user_clicks_the_login_button_me() {
        loginPage.loginButton.click();

    }
    @Then("User reach the salesmanager home page_me")
    public void user_reach_the_salesmanager_home_page_me() {
        Assert.assertTrue(loginPage.userType.getText().contains("SalesManager"));

    }
    @When("user clicks Reset Password link_me")
    public void user_clicks_reset_password_link_me() {
        loginPage.resetPasswordLink.click();

    }
    @Then("user sees Your Email  box_me")
    public void user_sees_your_email_box_me()  {
        Assert.assertTrue(loginPage.username.isDisplayed());
       //Driver.getDriver().wait(3000);
       String expectedURL="https://qa.centrilli.com/web/reset_password?";
       String actualURL=Driver.getDriver().getCurrentUrl();
        System.out.println(actualURL);
          Assert.assertEquals(expectedURL,actualURL);



    }


}
