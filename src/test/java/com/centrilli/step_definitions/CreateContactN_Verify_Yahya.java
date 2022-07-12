package com.centrilli.step_definitions;

import com.centrilli.pages.ContactPage_YHY;
import com.centrilli.pages.DashPage_Yahya;
import com.centrilli.pages.LoginPage_Yahya_neww;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.titleContains("Contacts"));

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
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.titleContains(name));
    }

    @Then("Verify user has created new contact successfully")
    public void verify_user_has_created_new_contact_successfully() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(name));
    }

    @And("User find the user using search bar")
    public void user_Find_The_User_Using_SearchBar() {
    contactPage_yhy.searchBar.clear();
    contactPage_yhy.searchBar.sendKeys(name+ Keys.ENTER);
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.titleContains(name));

    }
    @And("Click on the contact's path")
    public void click_On_The_ContactS_Path() {

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
