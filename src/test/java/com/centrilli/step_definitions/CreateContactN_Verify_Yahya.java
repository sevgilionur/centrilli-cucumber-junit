package com.centrilli.step_definitions;

import com.centrilli.pages.ContactPage_YHY;
import com.centrilli.pages.DashPage_Yahya;
import com.centrilli.pages.LoginPage_Yahya_neww;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateContactN_Verify_Yahya {
    DashPage_Yahya dashPage_yahya=new DashPage_Yahya();
    LoginPage_Yahya_neww loginPage_yahya_neww=new LoginPage_Yahya_neww();
    ContactPage_YHY contactPage_yhy=new ContactPage_YHY();
    Faker faker=new Faker();
    String name=faker.name().fullName();
    String adress=faker.address().streetAddress();
    String newName=faker.name().fullName();





    @When("User click on contacts button")
    public void user_click_on_contacts_button() {
        dashPage_yahya.contactsButton.click();
    }

    @When("User click on create button")
    public void user_click_on_create_button() {
        contactPage_yhy.createButton.click();
    }
    @When("User fills the new contact form and clicks save button")
    public void user_fills_the_new_contact_form_and_clicks_save_button() {

        contactPage_yhy.nameInputBox.sendKeys(name);
        contactPage_yhy.adressbox.sendKeys(adress);
        contactPage_yhy.saveButton.click();
    }

    @Then("Verify user has created new contact successfully")
    public void verify_user_has_created_new_contact_successfully() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(name));
    }

    @When("User click on edit button")
    public void user_click_on_edit_button() {
        contactPage_yhy.editButton.click();
    }


    @When("User edit fields and clicks on save button")
    public void user_edit_fields_and_clicks_on_save_button() {
       contactPage_yhy.nameInputBox.clear();
       contactPage_yhy.nameInputBox.sendKeys(newName);
    }

    @Then("Verify user has edited the contact successfully")
    public void verify_user_has_edited_the_contact_successfully() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(newName));
    }



}
