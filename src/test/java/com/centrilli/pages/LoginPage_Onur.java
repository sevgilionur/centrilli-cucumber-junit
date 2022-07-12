package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Onur {

    public LoginPage_Onur(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(css = ".btn-primary")
    public WebElement loginButton;

    @FindBy(xpath = "//p")
    public WebElement errorMessage;

    public void enterCredentials(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void method2(){}


    //String message = Driver.getDriver().findElement(By.name("login")).getAttribute("validationMessage");
    //String message = loginPage.password.getAttribute("validationMessage");













}
