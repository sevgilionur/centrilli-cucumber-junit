package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(css = ".btn-primary")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement username;







}
