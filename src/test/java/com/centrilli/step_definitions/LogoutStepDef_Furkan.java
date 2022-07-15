package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage_Furkan;
import com.centrilli.pages.LogoutPage_Furkan;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutStepDef_Furkan {
    LoginPage_Furkan loginPageFurkan=new LoginPage_Furkan();
    LogoutPage_Furkan logoutPageFurkan=new LogoutPage_Furkan();

    @Given("User lands on the homepage fy")
    public void userLandsOnTheHomepageFy() {
        loginPageFurkan.setLogin();
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(logoutPageFurkan.congratulationsMessage));
    }

    @When("User clicks on dropdown menu fy")
    public void userClicksOnDropdownMenuFy() {
        logoutPageFurkan.dropdownButton.click();
    }

    @Then("User clicks on logout button fy")
    public void userClicksOnLogoutButtonFy() {
        logoutPageFurkan.logoutButton.click();
    }

    @And("User logged out fy")
    public void userLoggedOutFy() {
        Assert.assertTrue(loginPageFurkan.loginButton.isDisplayed());
    }
}
