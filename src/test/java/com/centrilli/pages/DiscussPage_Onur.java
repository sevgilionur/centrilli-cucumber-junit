package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage_Onur {

    public DiscussPage_Onur(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement username;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement dropdownButton;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement LogoutButton;

    @FindBy(xpath = "//div[@class='modal-header']")
    public WebElement expiredMessage;

    @FindBy(css = "a[data-menu='68'] span")
    public WebElement contactButton;



}
