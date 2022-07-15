package com.centrilli.pages;

import com.centrilli.utilities.BrowserUtilities;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.Reader;

public class LoginPage_Murat {

    public LoginPage_Murat(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userType;

    @FindBy(xpath = "//a[@class='btn btn-link pull-right']")
    public WebElement resetPasswordLink;

    public void login()  {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        username.sendKeys(PropertyReader.getProperty("email"));
        password.sendKeys(PropertyReader.getProperty("password"));
        loginButton.click();


       // BrowserUtilities.clickWithJS(logInButton);
      //  BrowserUtils.waitFor(3);

    }


  


}

