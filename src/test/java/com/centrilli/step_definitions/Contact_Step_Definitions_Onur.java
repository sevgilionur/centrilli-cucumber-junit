package com.centrilli.step_definitions;

import com.centrilli.pages.ContactPage_Onur;
import com.centrilli.pages.DiscussPage_Onur;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contact_Step_Definitions_Onur {

    DiscussPage_Onur discussPage_onur= new DiscussPage_Onur();
    ContactPage_Onur contactPage_onur = new ContactPage_Onur();
    Faker faker = new Faker();

    @When("user clicks contact button so")
    public void user_clicks_contact_button_so() throws InterruptedException {
        Thread.sleep(5000);
        discussPage_onur.contactButton.click();
    }

    @When("user clicks create button so")
    public void user_clicks_create_button_so() throws InterruptedException {
        Thread.sleep(3000);
        contactPage_onur.createBtn.click();

    }
    @When("user enters contact name to {string} input box so")
    public void user_enters_contact_name_to_input_box_so(String name) throws InterruptedException {
        Thread.sleep(3000);
        name = faker.name().fullName();
        contactPage_onur.nameInput.sendKeys(name);
    }
    @And("user clicks save button so")
    public void userClicksSaveButtonSo() throws InterruptedException {
        Thread.sleep(3000);
        contactPage_onur.saveButton.click();
    }
    @Then("user verifies that contact created so")
    public void user_verifies_that_contact_created_so() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(contactPage_onur.contactCreated.isDisplayed());
    }


}
