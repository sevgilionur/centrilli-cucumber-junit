package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

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

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public void enterCredentials(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }


    //String message = Driver.getDriver().findElement(By.name("login")).getAttribute("validationMessage");
    //String message = loginPage.password.getAttribute("validationMessage");













}
