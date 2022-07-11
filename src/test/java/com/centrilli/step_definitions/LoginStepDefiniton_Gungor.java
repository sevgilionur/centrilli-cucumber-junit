package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Gungor;
import com.centrilli.utilities.BrowserUtilities;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class LoginStepDefiniton_Gungor {

    LoginPage_Gungor loginpage = new LoginPage_Gungor();
    @When("User goes to application page gy")
    public void userGoesToApplicationPageGy() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }

    @And("User enters valid {string} and {string} and clicks enter gy")
    public void userEntersValidAndAndClicksEnterGy(String email, String password) {
       loginpage.enterCredentials(email,password+ Keys.ENTER);
    }

    @Then("User lands on homepage as salesmanager gy")
    public void userLandsOnHomepageAsSalesmanagerGy() {
        BrowserUtilities.homePageVerification(loginpage.getUsername(),"SalesManager");
    }

    @And("User enters valid {string} and {string} gy")
    public void userEntersValidAndGy(String email, String password) {
        loginpage.enterCredentials(email, password);
    }

    @And("User clicks login button gy")
    public void userClicksLoginButtonGy() {
        loginpage.getLoginButton().click();
    }
}
