package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {
    public SmartBearOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderMenu;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement qty;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id= "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visa;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNum;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement listAllOrders;

    @FindBy(xpath = "(//tbody/tr/td)[4]")
    public WebElement nameView;

}
