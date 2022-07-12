package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashPage_Yahya {
    public DashPage_Yahya(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="//span[@class='oe_topbar_name']" )
    public WebElement userDropdownButton;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButton;

    @FindBy(css = "a[data-menu='68'] span")
    public WebElement contactsButton;

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement congratulationsMessage;


}
