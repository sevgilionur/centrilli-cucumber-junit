package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Gungor;
import com.centrilli.pages.NavigationBar_Gungor;
import com.centrilli.utilities.BrowserUtilities;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class LoginStepDefiniton_Gungor {

    LoginPage_Gungor loginpage = new LoginPage_Gungor();
    NavigationBar_Gungor navibar = new NavigationBar_Gungor();

    @When("User goes to application page gy")
    public void userGoesToApplicationPageGy() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
    }

    @And("User enters valid {string} and {string} and clicks enter gy")
    public void userEntersValidAndAndClicksEnterGy(String email, String password) {
        loginpage.enterCredentials(email, password + Keys.ENTER);
    }

    @Then("User lands on homepage as salesmanager gy")
    public void userLandsOnHomepageAsSalesmanagerGy() {
        BrowserUtilities.homePageVerification(navibar.getUsername(), "SalesManager");
    }

    @And("User enters valid {string} and {string} gy")
    public void userEntersValidAndGy(String email, String password) {
        loginpage.enterCredentials(email, password);
    }

    @And("User clicks login button gy")
    public void userClicksLoginButtonGy() {
        loginpage.getLoginButton().click();
    }
    
    @Given("User goes to application page enter valid {string} and {string} clicks enter gy")
    public void userGoesToApplicationPageEnterValidAndClicksEnterGy(String email, String password) {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        loginpage.getEmail().sendKeys(email);
        loginpage.getPassword().sendKeys(password + Keys.ENTER);
    }


}
