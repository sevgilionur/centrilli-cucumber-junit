package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageob {

    public LoginPageob(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "login")
    private WebElement email;

    public WebElement getEmail(){
        return email;
    }

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    public WebElement getPassword(){
        return password;
    }

    @FindBy(css = ".btn-primary")
    private WebElement loginButton;

    public WebElement getLoginButton(){
        return loginButton;
    }


    @FindBy(xpath = "//p")
    private WebElement errorMessage;

    public WebElement getErrorMessage(){
        return errorMessage;
    }

    public void enterCredentials(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);

    }


    public void getText(){
        email.getText();
    }
    public void commit (){
        email.getText();
    }
}
