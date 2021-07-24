package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBear_LoginPage {
    public SmartBear_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userName;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id ="ctl00_MainContent_login_button")
    public WebElement loginBtn;



}
