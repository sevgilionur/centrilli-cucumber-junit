package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar_Gungor {

    public NavigationBar_Gungor() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    private WebElement username;

    public WebElement getUsername(){
        return username;
    }

    @FindBy(xpath = "//a[.=\"Log out\"]")
    private  WebElement logoutBtn;

    public WebElement getLogoutBtn(){
        return logoutBtn;
    }
}
