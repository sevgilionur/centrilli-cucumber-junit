package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage_OmerNecip {

    public ContactPage_OmerNecip() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = "a[data-menu='68'] span")
    public WebElement ContactsButton;

   @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement CreateButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement NameInput;

    @FindBy(css = ".o_form_button_save")
    public WebElement SaveButton;

    @FindBy(xpath = "//p[.='Contact created']")
    public WebElement ContactCreated;
    


   

    
    
}
