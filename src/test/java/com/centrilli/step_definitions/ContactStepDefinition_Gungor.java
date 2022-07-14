package com.centrilli.step_definitions;

import com.centrilli.pages.ContactPage_Gungor;
import com.centrilli.pages.NavigationBar_Gungor;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class ContactStepDefinition_Gungor {

    NavigationBar_Gungor navibar = new NavigationBar_Gungor();
    ContactPage_Gungor contactPage = new ContactPage_Gungor();
    Faker faker = new Faker();

    @When("user clicks contact button gy")
    public void user_clicks_contact_button_gy() throws InterruptedException {
        Thread.sleep(5000);
        navibar.contactButton.click();
    }

    @When("user clicks create button gy")
    public void user_clicks_create_button_gy() throws InterruptedException {
        Thread.sleep(3000);
        contactPage.createBtn.click();

    }
    @When("user enters contact name to {string} input box gy")
    public void user_enters_contact_name_to_input_box_gy(String name) throws InterruptedException {
        Thread.sleep(3000);
         name = faker.name().fullName();
        contactPage.nameInput.sendKeys(name);
    }
    @When("user clicks save button gy")
    public void user_clicks_save_button_gy() throws InterruptedException {
        Thread.sleep(3000);
        contactPage.saveButton.click();
    }
    @Then("user verifies that contact created gy")
    public void user_verifies_that_contact_created_gy() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(contactPage.contactCreated.isDisplayed());
    }
}
