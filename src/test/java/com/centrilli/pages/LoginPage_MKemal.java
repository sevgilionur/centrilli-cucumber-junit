package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_MKemal {
    public LoginPage_MKemal(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "login")
    private WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(css = ".btn-primary")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    private WebElement username;

    @FindBy(xpath = "//p")
    private WebElement errorMessage;

    public void enterCridentials(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        
    }

    public void getText(){
        email.getText();
    }
    public void conflictOnur (){
        email.getText();
    }
    public void newMethod_Onur (){
        email.getText();
    }

}
