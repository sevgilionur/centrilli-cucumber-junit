package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_OmerNecip {

    public LoginPage_OmerNecip() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "login")
    public WebElement usernameinput;

    @FindBy(id = "password")
    public WebElement passwordinput;

    @FindBy(css = ".btn-primary")
    public WebElement cilickButton;

    @FindBy(css = ".o_mail_thread")
    public WebElement homepage;

    @FindBy(css = "p")
    public WebElement errorMessage;




    
    


}