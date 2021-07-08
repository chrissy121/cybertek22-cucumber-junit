package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OscarAmazonSearch {
    public OscarAmazonSearch() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='nav-a  ']")
    public List<WebElement> tabs;

    public WebElement tab (String Text) {
        String locator = "//a[.=\""+Text+"\"]";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@data-index=\"2\"])[1]")
    public WebElement hat1;

    @FindBy(id = "price_inside_buybox")
    public WebElement price;

    @FindBy(xpath = "//select[@name='quantity']")
    public WebElement quantityDropDown;

    @FindBy(css = "#add-to-cart-button")
    public WebElement cartBtn;

    @FindBy(css = "#nav-cart")
    public WebElement cart;
}
