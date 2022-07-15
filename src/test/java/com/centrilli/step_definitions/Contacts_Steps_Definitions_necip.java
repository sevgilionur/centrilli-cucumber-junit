package com.centrilli.step_definitions;

import com.centrilli.pages.ContactPage_OmerNecip;
import com.centrilli.pages.LoginPage_OmerNecip;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contacts_Steps_Definitions_necip {

        ContactPage_OmerNecip contactPage_omerNecip=new ContactPage_OmerNecip();

    @When("User clicks contact button_necip")
    public void user_clicks_contact_button_necip() throws InterruptedException {
        Thread.sleep(5000);
        contactPage_omerNecip.ContactsButton.click();

    }
    @When("User clicks create button_necip")
    public void user_clicks_create_button_necip() throws InterruptedException {
        Thread.sleep(5000);
        contactPage_omerNecip.CreateButton.click();
    }
    @When("User enters {string} to input box_necip")
    public void user_enters_to_input_box_necip(String name) throws InterruptedException {
        Thread.sleep(5000);
        contactPage_omerNecip.NameInput.sendKeys("OmerNecip");
    }

    @When("User clicks save button_necip")
    public void user_clicks_save_button_necip() throws InterruptedException {
        Thread.sleep(5000);
        contactPage_omerNecip.SaveButton.click();


    }
    @Then("Users verifys that contact created_necip")
    public void users_verifys_that_contact_created_necip() {

        Assert.assertTrue(contactPage_omerNecip.ContactCreated.isDisplayed());

    }
}
