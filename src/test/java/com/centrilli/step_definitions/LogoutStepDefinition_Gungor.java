package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Gungor;
import com.centrilli.pages.NavigationBar_Gungor;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LogoutStepDefinition_Gungor {

    LoginPage_Gungor loginpage = new LoginPage_Gungor();
    NavigationBar_Gungor navibar = new NavigationBar_Gungor();

    @When("user clicks on username gy")
    public void user_clicks_on_username_gy() throws InterruptedException {
        Thread.sleep(3000);
        navibar.getUsername().click();
    }

    @When("user clicks on logout button gy")
    public void user_clicks_on_logout_button_gy() {
        navibar.getLogoutBtn().click();
    }

    @Then("user log out correctly gy")
    public void user_log_out_correctly_gy() {
        Assert.assertEquals("Login | Best solution for startups",Driver.getDriver().getTitle());
    }

}
