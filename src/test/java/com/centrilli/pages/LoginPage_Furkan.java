package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Furkan {
    public LoginPage_Furkan(){
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = ".btn-primary")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement homePage;

    @FindBy(css = "p")
    public WebElement alertMessage;

}
