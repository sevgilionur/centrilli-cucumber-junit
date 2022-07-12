package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Omernecip {

    public HomePage_Omernecip() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement usernameButton;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButton;




}
