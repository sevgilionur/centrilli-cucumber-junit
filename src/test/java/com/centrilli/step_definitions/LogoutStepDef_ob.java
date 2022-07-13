package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPageob;
import com.centrilli.pages.NavigationBar_Gungor;
import com.centrilli.utilities.BrowserUtilities;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LogoutStepDef_ob {

    LoginPageob loginPageob = new LoginPageob();
    NavigationBar_Gungor navibar = new NavigationBar_Gungor();

    @Given("User goes to application page enter valid {string} and {string} clicks enter ob")
    public void user_goes_to_application_page_enter_valid_and_clicks_enter_ob(String email, String password) {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        loginPageob.enterCredentials(email, password + Keys.ENTER);

    }
    @When("user clicks on username ob")
    public void user_clicks_on_username_ob() throws InterruptedException {
        Thread.sleep(4000);
        navibar.getUsername().click();

    }
    @When("user clicks on logout button ob")
    public void user_clicks_on_logout_button_ob() {
       navibar.getLogoutBtn().click();
    }
    @Then("user log out correctly ob")
    public void user_log_out_correctly_ob() {
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith("Login"));

    }


}
