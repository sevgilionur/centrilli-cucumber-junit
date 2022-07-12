package com.centrilli.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class BrowserUtilities {

    public static void homePageVerification(WebElement webElement, String expected){
        Assert.assertTrue(webElement.getText().contains(expected));
    }

    public static void fillOutMessage(WebElement webElement, String expected){
        String message = webElement.getAttribute("validationMessage");
        Assert.assertEquals(expected, message);
    }

}
